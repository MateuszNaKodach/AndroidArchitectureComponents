package io.github.nowakprojects.androidarchitecturecomponents.adapter

import io.reactivex.subjects.PublishSubject
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable


/**
 * Created by Mateusz on 27.09.2017.
 */

abstract class ReactiveRecyclerViewAdapter<T, VH : RecyclerView.ViewHolder>(val data: MutableList<T>)
    : RecyclerView.Adapter<VH>() {

    val onClickSubject: PublishSubject<T> by lazy { PublishSubject.create<T>() }

    val onLongClickSubject: PublishSubject<T> by lazy { PublishSubject.create<T>() }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = data[position]
        setupItemClickListeners(holder, item)
    }

    protected fun setupItemClickListeners(viewHolder: VH, item: T) {
        viewHolder.itemView
                .setOnClickListener { v -> onClickSubject.onNext(item) }
        viewHolder.itemView
                .setOnLongClickListener { v ->
                    onLongClickSubject.onNext(item)
                    true
                }
    }

    override fun getItemCount(): Int = data.size

    fun getIndexOf(item: T): Int = data.indexOf(item)

    fun getItemOnIndex(index: Int): T = data[index]

    fun updateData(newData: List<T>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

}
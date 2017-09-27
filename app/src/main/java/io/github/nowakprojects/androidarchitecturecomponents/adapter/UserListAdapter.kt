package io.github.nowakprojects.androidarchitecturecomponents.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.nowakprojects.androidarchitecturecomponents.R
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User
import kotlinx.android.synthetic.main.item_user.view.*

/**
 * Created by Mateusz on 27.09.2017.
 */

class UserListAdapter(data: MutableList<User> = mutableListOf()) : ReactiveRecyclerViewAdapter<User, RecyclerView.ViewHolder>(data) {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.item_user, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        val user = data[position]
        val itemView = holder.itemView

        itemView.tvUsername.text = user.username
    }


}
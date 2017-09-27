package io.github.nowakprojects.androidarchitecturecomponents

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import io.github.nowakprojects.androidarchitecturecomponents.adapter.UserListAdapter
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User
import io.github.nowakprojects.androidarchitecturecomponents.ui.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    var currentUser: User = User("noname")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val viewModel: MainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        initUsersRecyclerView()

        viewModel.getUsers()
                .observe(this,
                        Observer { users ->
                            println(Thread.currentThread().name + " lista: " + users)
                            val userAdapter = rvUsers.adapter as UserListAdapter

                            if (users != null) {
                                userAdapter.updateData(users)
                            }
                        })

        viewModel.userDao.findByLocalId(1L)
                .observe(this, Observer { user ->
                    print(Thread.currentThread().name + " pojedyczny: " + user)
                    if (user != null) {
                        this.currentUser = user
                    }
                })

        button.setOnClickListener {
            currentUser.username = editText.text.toString()
            viewModel.updateUser(currentUser)
        }

    }

    private fun initUsersRecyclerView() {
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.adapter = UserListAdapter()
    }
}

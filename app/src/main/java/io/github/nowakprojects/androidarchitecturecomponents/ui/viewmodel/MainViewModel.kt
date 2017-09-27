package io.github.nowakprojects.androidarchitecturecomponents.ui.viewmodel

import android.arch.lifecycle.ViewModel
import io.github.nowakprojects.androidarchitecturecomponents.application.TestApp
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.dao.OutfitDao
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.dao.UserDao
import io.reactivex.Single
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import android.arch.lifecycle.LiveData
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User


/**
 * Created by Mateusz on 27.09.2017.
 */

class MainViewModel : ViewModel(

) {
    @Inject lateinit var userDao: UserDao
    @Inject lateinit var outfitDao: OutfitDao

    init {
        TestApp.dependencyInjector.inject(this)
        insertFakeDataToDatabase()
    }

    private fun insertFakeDataToDatabase() {
        Single.fromCallable {
            val user1 = User("Mateusz")

            user1.localId = 1L

            val user2 = User("Ania")

            userDao.insert(user1, user2)

        }
                .subscribeOn(Schedulers.io())
                .subscribeBy(
                        onSuccess = { println("Zapisani users " + it) },
                        onError = { throwable -> print(throwable.message) }
                )
    }

    fun getUsers(): LiveData<List<User>> {
        return userDao.findAll()
    }



    fun updateUser(user: User) {
        Single.fromCallable {
            userDao.update(user)
        }
                .subscribeOn(Schedulers.io())
                .subscribeBy(
                        onSuccess = { println("Zaktualizaowany user " + it) },
                        onError = { throwable -> print(throwable.message) }
                )
    }


}
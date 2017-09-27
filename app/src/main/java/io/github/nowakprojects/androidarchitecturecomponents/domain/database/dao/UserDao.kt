package io.github.nowakprojects.androidarchitecturecomponents.domain.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.TABLE_USER
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.queries.CommonQueriesParts.*
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.query.UserWithOutfits

/**
 * Created by Mateusz on 27.09.2017.
 */
@Dao
interface UserDao {
    @Query(SELECT_ALL_FROM + TABLE_USER)
    fun findAll(): LiveData<List<User>>

    @Query(SELECT_ALL_FROM + TABLE_USER)
    fun findAllWithOutfits(): LiveData<List<UserWithOutfits>>

    @Query(SELECT_ALL_FROM + TABLE_USER + WHERE + LOCAL_ID_EQUALITY)
    fun findByLocalId(localId: Long): LiveData<User>

    @Insert
    fun insert(vararg user: User): List<Long>

    @Update
    fun update(vararg user: User)
}
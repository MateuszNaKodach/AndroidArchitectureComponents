package io.github.nowakprojects.androidarchitecturecomponents.domain.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.dao.OutfitDao
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.dao.UserDao
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.Outfit
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User


/**
 * Created by Mateusz on 27.09.2017.
 */
@Database(version = 4, entities = arrayOf(User::class, Outfit::class))
abstract class ArchitectureDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    abstract fun outfitDao(): OutfitDao

}
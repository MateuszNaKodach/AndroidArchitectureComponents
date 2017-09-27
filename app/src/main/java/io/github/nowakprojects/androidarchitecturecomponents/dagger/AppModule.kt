package io.github.nowakprojects.androidarchitecturecomponents.dagger

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.ArchitectureDatabase
import javax.inject.Singleton

/**
 * Created by Mateusz on 27.09.2017.
 */
@Module
class AppModule(private val context: Context) {

    @Provides fun providesAppContext() = context

    @Provides @Singleton fun providesAppDatabase(context: Context):ArchitectureDatabase =
            Room.databaseBuilder(context, ArchitectureDatabase::class.java, "test.db").build()

    @Provides @Singleton fun providesUserDao(architectureDatabase: ArchitectureDatabase) =
            architectureDatabase.userDao()

    @Provides @Singleton fun providesOutfitDao(architectureDatabase: ArchitectureDatabase) =
            architectureDatabase.outfitDao()
}
package io.github.nowakprojects.androidarchitecturecomponents.domain.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.queries.CommonQueriesParts
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.Outfit

/**
 * Created by Mateusz on 27.09.2017.
 */
@Dao
interface OutfitDao {
   // @Query(CommonQueriesParts.SELECT_ALL_FROM + DatabaseNames.TABLE_OUTFIT)
   // fun findAll(): LiveData<List<OutfitWithUser>>

    //  @Query(CommonQueriesParts.SELECT_ALL_FROM + DatabaseNames.TABLE_OUTFIT + WHERE + LOCAL_ID_EQUALITY)
    //  fun findByLocalId(localId: Long): LiveData<OutfitWithUser>

    @Insert
    fun insert(outfit: Outfit)

    @Update
    fun update(outfit: Outfit)
}
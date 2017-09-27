package io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.TABLE_USER

/**
 * Created by Mateusz on 27.09.2017.
 */
@Entity(tableName = TABLE_USER)
data class User(
        var username: String
){
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = COLUMN_LOCAL_ID)
        var localId: Long? = null
}

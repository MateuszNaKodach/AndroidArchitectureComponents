package io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.*

/**
 * Created by Mateusz on 27.09.2017.
 */
@Entity(tableName = TABLE_OUTFIT/*,
        foreignKeys = arrayOf(
                ForeignKey(
                        entity = User::class,
                        parentColumns = arrayOf(COLUMN_LOCAL_ID),
                        childColumns = arrayOf(COLUMN_USER_ID)
                )
        )*/
)
data class Outfit(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = COLUMN_LOCAL_ID)
        var localId: Long = -1,

        @ColumnInfo(name = COLUMN_USER_ID)
        @ForeignKey(entity = User::class, parentColumns = arrayOf(COLUMN_LOCAL_ID), childColumns = arrayOf(COLUMN_USER_ID))
        var userId: Long,

        @ColumnInfo(name = COLUMN_DESCRIPTION)
        var description: String
)
package io.github.nowakprojects.androidarchitecturecomponents.domain.model.query

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Relation
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_USER_ID
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.Outfit
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User

/**
 * Created by Mateusz on 27.09.2017.
 */
data class OutfitWithUser(
        @Embedded
        val outfit: Outfit,
        @Relation(parentColumn = COLUMN_USER_ID, entityColumn = COLUMN_LOCAL_ID, entity = User::class)
        val user: List<@JvmSuppressWildcards User>
)
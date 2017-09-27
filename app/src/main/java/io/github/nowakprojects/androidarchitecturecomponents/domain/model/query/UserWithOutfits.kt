package io.github.nowakprojects.androidarchitecturecomponents.domain.model.query

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Relation
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID
import io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_USER_ID
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.Outfit
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User

/**
 * Created by Mateusz on 28.09.2017.
 */
/*class UserWithOutfits(
        @Embedded
        val user: User,
        @Relation(parentColumn = COLUMN_LOCAL_ID, entityColumn = COLUMN_USER_ID)
        val outfits: List<Outfit>
)*/
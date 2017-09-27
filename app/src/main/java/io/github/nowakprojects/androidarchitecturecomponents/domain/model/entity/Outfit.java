package io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_DESCRIPTION;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_USER_ID;

/**
 * Created by Mateusz on 28.09.2017.
 */

public class Outfit {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_LOCAL_ID)
    private Long localId;

    @ColumnInfo(name = COLUMN_USER_ID)
    @ForeignKey(entity = User.class, parentColumns = COLUMN_LOCAL_ID, childColumns = COLUMN_USER_ID)
    private Long userId;

    @ColumnInfo(name = COLUMN_DESCRIPTION)
    private String description;
}

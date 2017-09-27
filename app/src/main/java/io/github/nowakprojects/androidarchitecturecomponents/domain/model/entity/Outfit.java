package io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_DESCRIPTION;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_USER_ID;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.TABLE_OUTFIT;

/**
 * Created by Mateusz on 28.09.2017.
 */
@Entity(tableName = TABLE_OUTFIT)
public class Outfit {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_LOCAL_ID)
    private Long localId;

    @ColumnInfo(name = COLUMN_USER_ID)
    @ForeignKey(entity = User.class, parentColumns = COLUMN_LOCAL_ID, childColumns = COLUMN_USER_ID)
    private Long userId;

    @ColumnInfo(name = COLUMN_DESCRIPTION)
    private String description;

    public Outfit() {
    }

    public Outfit(Long localId, Long userId, String description) {
        this.localId = localId;
        this.userId = userId;
        this.description = description;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

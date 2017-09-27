package io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_USERNAME;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.TABLE_USER;

/**
 * Created by Mateusz on 28.09.2017.
 */
@Entity(tableName = TABLE_USER)
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_LOCAL_ID)
    private Long localId;

    @ColumnInfo(name = COLUMN_USERNAME)
    private String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public User(Long localId, String username) {
        this.localId = localId;
        this.username = username;
    }

    public Long getLocalId() {
        return localId;
    }

    public void setLocalId(Long localId) {
        this.localId = localId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

package io.github.nowakprojects.androidarchitecturecomponents.domain.model.query;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.Outfit;
import io.github.nowakprojects.androidarchitecturecomponents.domain.model.entity.User;

import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID;
import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_USER_ID;

/**
 * Created by Mateusz on 28.09.2017.
 */

public class UserWithOutfits {

    @Embedded
    private User user;

    @Relation(parentColumn = COLUMN_LOCAL_ID, entityColumn = COLUMN_USER_ID, entity = Outfit.class)
    private List<Outfit> outfits;

    public UserWithOutfits() {
    }

    public UserWithOutfits(User user) {
        this.user = user;
    }

    public UserWithOutfits(User user, List<Outfit> outfits) {
        this.user = user;
        this.outfits = outfits;
    }

    public List<Outfit> getOutfits() {
        return outfits;
    }

    public User getUser() {
        return user;
    }

    public void setOutfits(List<Outfit> outfits) {
        this.outfits = outfits;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

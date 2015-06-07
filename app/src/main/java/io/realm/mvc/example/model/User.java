package io.realm.mvc.example.model;

import java.util.Observable;

/**
 * Created by TheFinestArtist on 6/7/15.
 */
public class User extends Observable {

    private String fullName;
    private String email;

    public void setEmail(String email) {
        this.email = email;
        updateViews();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        updateViews();
    }

    @Override
    public String toString() {
        return "FullName : " + fullName + "\nEmail : " + email;
    }

    private void updateViews() {
        setChanged();
        notifyObservers(this);
    }
}

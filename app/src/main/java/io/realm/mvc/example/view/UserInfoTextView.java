package io.realm.mvc.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

import io.realm.mvc.example.model.User;

/**
 * Created by TheFinestArtist on 6/7/15.
 */
public class UserInfoTextView extends TextView implements Observer {

    public UserInfoTextView(Context context) {
        super(context, null);
    }

    public UserInfoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UserInfoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void update(Observable observable, Object data) {
        if (data instanceof User)
            setText(data.toString());
    }
}

package com.example.gerrity95.game.state;

import android.view.MotionEvent;

import com.example.gerrity95.framework.util.Painter;
import com.example.gerrity95.androidgdf.GameMainActivity;

/**
 * Created by gerrity95 on 14/10/16.
 */
public abstract class State {

    public void setCurrentState(State newState)
    {
        GameMainActivity.sGame.setCurrentState(newState);
    }

    public abstract void init();

    public abstract void update(float delta);

    public abstract void render(Painter g);

    public abstract boolean onTouch(MotionEvent e, int scaledX, int scaledY);
}

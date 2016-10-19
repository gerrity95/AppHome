package com.example.gerrity95.androidgdf;

import android.content.Context;
import android.view.SurfaceView;

import com.example.gerrity95.game.state.State;

/**
 * Created by gerrity95 on 14/10/16.
 */
public class GameView extends SurfaceView {

    public GameView(Context context, int gameWidth, int gameHeight)
    {
        super(context);
    }

    public GameView(Context context)
    {
        super(context);
    }

    public void setCurrentState(State newState) {
    }
}

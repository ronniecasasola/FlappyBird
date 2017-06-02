package com.casasola.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.casasola.gameobjects.Bird;

public class GameWorld {

    private Bird bird;

    public GameWorld(int midPointY){
        bird = new Bird(33, midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird(){
        return bird;
    }
}

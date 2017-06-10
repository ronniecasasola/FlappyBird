package com.casasola.zombiebird;

import com.badlogic.gdx.Game;
import com.casasola.screens.SplashScreen;
import com.casasola.zbhelpers.AssetLoader;

public class ZBGame extends Game {

    @Override
    public void create() {
        AssetLoader.load();
        setScreen(new SplashScreen(this));
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }

}
package com.kb.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kb.helpers.AssetLoader;
import com.kb.screens.GameScreen;

public class ZBGame extends Game {

	@Override
	public void create(){
		Gdx.app.log("ZBGame","created");
		AssetLoader.load();
		setScreen(new GameScreen());
	}

	@Override
	public void dispose()
	{
		AssetLoader.dispose();
	}
}

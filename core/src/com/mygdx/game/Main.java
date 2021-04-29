package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x,y;
	final  float SPEED = 50;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		x = 0;
		y = 0;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);

		if(Gdx.input.isKeyPressed(Input.Keys.W)) {
			y += Gdx.graphics.getDeltaTime()* SPEED;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){
			y -=Gdx.graphics.getDeltaTime()* SPEED;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A)) {
			x -= Gdx.graphics.getDeltaTime()* SPEED;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			x +=Gdx.graphics.getDeltaTime()* SPEED;
		}
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

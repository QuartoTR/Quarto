package com.quarto.objects.menu;

import com.quarto.engine.managers.SoundManager;
import com.quarto.engine.objects.ButtonObject;
import com.quarto.engine.utilities.Vector2D;

public class MusicButton extends ButtonObject {

	private boolean inMenu;
	
	@Override
	public void onInit() {
		// TODO Auto-generated method stub
		this.setTexturePath("menu/buttons/music.png");
		this.setSize(new Vector2D(.75f, 0));
		this.onSetupButton();
		this.setInMenu(true);
		
		if(SoundManager.isMusicMuted())
			this.setTexturePath("menu/buttons/music_muted.png");
	}

	@Override
	public void onTick(double delta) {
		// TODO Auto-generated method stub
		if(isInMenu())
			getPosition().setX((getScene().getGameEngine().getWindowSize().getX() - getSize().getX()) / 2);
	}

	@Override
	public void onHovered() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLeftClickPressed() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLeftClickHeld() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLeftClickReleased() {
		// TODO Auto-generated method stub
		SoundManager.onPlay("effects/woosh.wav");
		SoundManager.setMusicMuted(!SoundManager.isMusicMuted());
		if(SoundManager.isMusicMuted())
			this.setTexturePath("menu/buttons/music_muted.png");
		else
			this.setTexturePath("menu/buttons/music.png");
	}

	@Override
	public void onRightClickPressed() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRightClickHeld() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRightClickReleased() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub

	}

	public boolean isInMenu() {
		return inMenu;
	}

	public void setInMenu(boolean inMenu) {
		this.inMenu = inMenu;
	}

}

package com.quarto.objects.menu.tutorial;

import com.quarto.engine.objects.ImageObject;
import com.quarto.engine.utilities.Vector2D;

public class Tutorial extends ImageObject {

	@Override
	public void onInit() {
		// TODO Auto-generated method stub
		this.setTexturePath("menu/tutorial.png");
		this.setSize(new Vector2D(3.8f, 0));
	}

	@Override
	public void onTick(double delta) {
		// TODO Auto-generated method stub
		getPosition().setX((getScene().getGameEngine().getWindowSize().getX() - getSize().getX()) / 2);
	}

	@Override
	public void onHoverEnter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHovered() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHoverLeave() {
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

}

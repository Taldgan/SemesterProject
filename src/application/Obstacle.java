package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Obstacle implements Collidable {
	
	private boolean collidable = true;
	private Rectangle platform;
	private double width, height, x, y;
	
	public Obstacle(int w, int h, Color c) {
		this.platform = new Rectangle(w, h, c);
		this.width = w;
		this.height = h;
	}

	public boolean collide(double x, double y, double w, double h) {
		System.out.println("Platform's y: "+this.y+this.height);
		System.out.println("Cicle's y: "+y+height+"\n===========================");
		//if(this.x > x && this.x+this.width < x+w && this.y < x && this.y-this.width < y-h)
		if((x >= this.x && x<= this.x+width) && (y == this.y-this.height || y <= this.y+height))
			return true;
		else 
			return false;
	}
	//Return true if the character is over the platform. Return false if they are under.
	/*public boolean isOver()
	{
		
	}*/

	public void setCollidable(boolean isCollidable) {
		this.collidable = isCollidable;
	}

	public boolean isCollidable() {
		return collidable;
	}
	
	//Getters/Setters...
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;	
	}
	
	public Rectangle getPlat() {
		return this.platform;
	}
	
	public void setWidth(double w) {
		this.width = w;
	}

	public void setHeight(double h) {
		this.height = h;
	}

	public void setX(double x) {
		this.x = x;
		this.platform.setX(x);
	}

	public void setY(double y) {
		this.y = y;
		this.platform.setY(y);
	}

}
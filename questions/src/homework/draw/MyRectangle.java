package homework.draw;

import javax.swing.*;
import java.awt.*;

public class MyRectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;

	public MyRectangle(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics g)
	{
		g.setColor(color);
		g.drawRect(x,y,width,height);
	}
}

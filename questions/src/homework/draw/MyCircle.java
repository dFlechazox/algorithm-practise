package homework.draw;

import java.awt.*;

public class MyCircle {
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;

	public MyCircle(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics g)
	{
		g.setColor(color);
		g.drawOval(x,y,width,height);
	}
}

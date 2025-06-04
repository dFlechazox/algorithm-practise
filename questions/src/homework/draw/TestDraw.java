package homework.draw;

import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;

public class TestDraw {
	public static void main(String[] args) {
		ClockPanel panel = new ClockPanel();
		JFrame application = new JFrame();
		application.setTitle("面向对象程序设计第2次作业");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 300);
		application.setVisible(true);
	}
	public static MyLine[] generateLines(){
		Random randomNumber = new Random();
		MyLine[] lines;
		lines = new MyLine[ 5 + randomNumber.nextInt(5)];
		for (int count = 0; count < lines.length; count++)
		{
			int x1 = randomNumber.nextInt(400);
			int y1 = randomNumber.nextInt(300);
			int x2 = randomNumber.nextInt(400);
			int y2 = randomNumber.nextInt(300);
			Color color = new Color( randomNumber.nextInt(256), randomNumber.nextInt(256), 
					randomNumber.nextInt(256));
			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
		return lines;
	}
	public static MyCircle[] generateCircles(){
		Random randomNumber = new Random();
		MyCircle[] circles;
		circles = new MyCircle[ 5 + randomNumber.nextInt(5)];
		for (int count = 0; count < circles.length; count++)
		{
			int x = randomNumber.nextInt(200);
			int y = randomNumber.nextInt(100);
			int width = randomNumber.nextInt(100);
			int height = width;
			Color color = new Color( randomNumber.nextInt(256), randomNumber.nextInt(256),
					randomNumber.nextInt(256));
			circles[count] = new MyCircle(x,y,width,height,color);
		}
		return circles;
	}
	public static MyRectangle[] generateRectangles(){
		Random randomNumber = new Random();
		MyRectangle[] rectangles;
		rectangles = new MyRectangle[ 5 + randomNumber.nextInt(5)];
		for (int count = 0; count < rectangles.length; count++)
		{
			int x = randomNumber.nextInt(400);
			int y = randomNumber.nextInt(300);
			int width = randomNumber.nextInt(100);
			int height = randomNumber.nextInt(100);
			Color color = new Color( randomNumber.nextInt(256), randomNumber.nextInt(256),
					randomNumber.nextInt(256));
			rectangles[count] = new MyRectangle(x, y, width, height, color);
		}
		return rectangles;
	}

}

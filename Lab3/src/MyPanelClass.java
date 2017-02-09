import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.GRAY);
		g.fillRect(x1, y1, width + 1, height + 1);
		
		//Draw a border
//		g.setColor(Color.YELLOW);
//		g.drawRect(x1, y1, width, height);
//		
//		//Draw a second border
//		g.setColor(Color.RED);
//		g.drawRect(x1+1, y1+1, width-2, height-2);
//		
//		//Draw line
//		g.setColor(Color.WHITE);
//        g.drawLine(x1, y1, x2, y2);
//        
//        //Draw second line
//        g.setColor(Color.BLUE);
//        g.drawLine(x1 + width, y1, x2 - width, y2);
//        
        
//        //Drawing circle or oval
//		g.setColor(Color.LIGHT_GRAY);
//		g.fillOval((x2-55)/2, (y2-55)/2, 55, 55);
  
//		Polygon p = new Polygon();
//        p.addPoint(x1 + 5, y1 + 25);
//        p.addPoint(x1 + 20, y1 + 10);
//        p.addPoint(x1 + 35, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 25);
//        g.setColor(Color.YELLOW);
//        g.fillPolygon(p);
		
		
		//Drawing PR Flag
		
		//drawing the red and white rectangles
		g.setColor(Color.RED);
		g.fillRect(x1, y1, 280, 36);
		g.fillRect(x1, y1+72, 280, 36);
		g.fillRect(x1, y1+144, 280, 36);
		
		g.setColor(Color.WHITE);
		g.fillRect(x1, y1+36, 280, 36);
		g.fillRect(x1, y1+108, 280, 36);
		
		//Draw blue triangle
		Polygon tri = new Polygon();
		tri.addPoint(x1, y1);
		tri.addPoint(x1+140, y1+90);
		tri.addPoint(x1, y1+180);
		tri.addPoint(x1, y1);
		g.setColor(Color.BLUE);
		g.fillPolygon(tri);
		
		Polygon p2 = new Polygon();
        p2.addPoint(x1 + 25, y1 + 73);
        p2.addPoint(x1 + 41, y1 + 73);
        p2.addPoint(x1 + 47, y1 + 58);
        p2.addPoint(x1 + 53, y1 + 73);
        p2.addPoint(x1 + 69, y1 + 73);
        p2.addPoint(x1 + 56, y1 + 83);
        p2.addPoint(x1 + 61, y1 + 98);
        p2.addPoint(x1 + 47, y1 + 88);
        p2.addPoint(x1 + 34, y1 + 98);
        p2.addPoint(x1 + 38, y1 + 83);
        g.setColor(Color.WHITE);
        g.fillPolygon(p2);
        
		
	}
}
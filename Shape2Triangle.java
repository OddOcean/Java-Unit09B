// Shape2Triangle.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape{//created using shape parent class
  private String shape = "Triangle";
  public void drawShape(Graphics g){//when called it will display the shape, name and number of sides
    g.setColor(Color.MAGENTA);
    
    int [] x = {510, 610, 710};
    int [] y = {250, 50, 250};
    
    g.fillPolygon(x, y, 3);//draws polygon using the points in lists x and y
    displayName(g);
    displayNumSides(g);
  }
  public void displayName(Graphics g){//writes shape variable on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString(shape, 420, 30);
  }
  public void displayNumSides(Graphics g){//writes number of sides the shape has on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString("A triangle has 3 sides", 420, 50);
  }
}

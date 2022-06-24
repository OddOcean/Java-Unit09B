// Shape4Circle.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape{//created using shape parent class
  private String shape = "Triangle";
  public void drawShape(Graphics g){//when called it will display the shape, name and number of sides
    g.setColor(Color.ORANGE);
    
    g.fillOval(510, 350, 200, 200);//draws a circle at 510, 350
    displayName(g);
    displayNumSides(g);
  }   
  public void displayName(Graphics g){//writes shape variable on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString(shape, 420, 320);
  }
  public void displayNumSides(Graphics g){//writes number of sides the shape has on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString("A circle has 0 sides", 420, 340);
  }
}

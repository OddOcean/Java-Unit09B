// Shape3Octagon.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape{//created using shape parent class
  private String shape = "Octagon";
  public void drawShape(Graphics g){//when called it will display the shape, name and number of sides
    g.setColor(Color.BLUE);
    
    int [] x = {100, 166, 233, 300, 300, 233, 166, 100};
    int [] y = {416, 350, 350, 416, 482, 550, 550, 482};
    
    g.fillPolygon(x, y, 8);//draws polygon using the points in lists x and y
    displayName(g);
    displayNumSides(g);
  }
  public void displayName(Graphics g){//writes shape variable on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString(shape, 20, 320);
  }
  public void displayNumSides(Graphics g){//writes number of sides the shape has on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString("A octagon has 8 sides", 20, 340);
  }
}


// Shape1Square.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape{//created using shape parent class
  private String shape = "Square";
  public void drawShape(Graphics g){//when called it will display the shape, name and number of sides
    g.setColor(Color.RED);
    g.fillRect(100, 50, 200, 200);
    displayName(g);
    displayNumSides(g);
  }
  public void displayName(Graphics g){//writes shape variable on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString(shape, 20, 30);
  }
  public void displayNumSides(Graphics g){//writes number of sides the shape has on canvas
    g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
    g.drawString("A square has 4 sides", 20, 50);
  }
}

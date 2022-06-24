import java.awt.*;
import java.util.*; 
import javax.swing.JFrame;


class Lab09B_Weygandt extends Canvas {
	/* We need to create the JFrame object that will contain the Canvas Object*/
  public static void main(String[] args) {
    JFrame frame = new JFrame("Lab 09 Interfaces");/*Creates the JFrame and gives it a title */
    Canvas canvas = new Lab09B_Weygandt();/*This class extends Canvas so it is itself a canvas class and inherits everything Canvas has, so the consructor call has to be the same name as the class we are in */
    canvas.setSize(1100, 800);/*Set dimensions of canvas changing these numbers will change the size of your canvas */
    canvas.setBackground(Color.white);/* Set the background color of the canvas */
    frame.add(canvas);/* add the canvas object to the frame object */
    frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
    frame.setVisible(true);/* display the thing*/
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//will end the application on close
        
  }

  public void paint(Graphics g){//makes a list with each shape object on it
    drawGrid(g);
    
    ArrayList<Shape> Shapes = new ArrayList<Shape>();
    
    Shape1Square square = new Shape1Square();
    Shape2Triangle triangle = new Shape2Triangle();
    Shape3Octagon octagon = new Shape3Octagon();
    Shape4Circle circle = new Shape4Circle();
    
    Shapes.add(square);
    Shapes.add(triangle);
    Shapes.add(octagon);
    Shapes.add(circle);
    
    for (Shape shp : Shapes){//prints each shape object from the list
      shp.drawShape(g);
    }
  }

	public void drawGrid(Graphics g){//makes 4 sections inside canvas
    g.drawRect(10,10,800,600);
	 g.drawLine(10,300,810,300);
	 g.drawLine(410,10,410,610);
	}
}
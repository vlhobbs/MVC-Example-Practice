import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SquareView extends JPanel{
    
	private static final long serialVersionUID = 1L;
	//for the moment this just prints out the info about square
    //later this will need awt and swing and will print the square
    //controller will update this view as needed
	private int side;
    private Color col;        
    private Square squareModel;

    public SquareView (Square square){
    	//sets the color to the constructor square
        this.col = square.getColor();
        this.side = square.getSideLength();
    }

    public void resetModel(int sides, Color color) {
    	//this sets the model's color to the view's color.
    	squareModel.setSideLength(sides);    
    	squareModel.setColor(color);
    	}
    
    public void resetView (Square sq){
    	//this sets the view colors to the model's color.
    	this.col = sq.getColor();
        this.side = sq.getSideLength();
    }

    public void paintComponent (Graphics g){
        super.paintComponent(g);
        // Get total height and width, divide by 2, start square there
        int x_pos = ((getWidth() / 2)-(side/2));
        int y_pos = ((getHeight() / 2)-(side/2));
        g.setColor(this.col);
        g.fillRect(x_pos, y_pos, this.side, this.side);
    }
    
    public void drawSquare() {

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(this);
        application.setSize(700,700);
        application.setVisible(true);
    }

    public void updateSquare() {
        repaint();
    }
    
	public void printSquareDetails(int sideLength, Color color) {
		System.out.println("Side length = " + sideLength + " and color is " + color + ".");
	}
	
}

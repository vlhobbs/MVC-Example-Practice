import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SquareView extends JPanel{
    //Eclipse insisted on adding this. Look at it later.
    private static final long serialVersionUID = 1L;
    private int side;
    private Color col;        
//    private Square squareModel;

    public SquareView (Square square){
    	//sets the color to the constructor square
        this.col = square.getColor();
        this.side = square.getSideLength();
    }
    
    public void resetView (Square sq){
    	//this sets the view colors to the model's color
    	//uses pull model of MVC
    	this.col = sq.getColor();
        this.side = sq.getSideLength();
    }

    public void paintComponent (Graphics g){
        super.paintComponent(g);
        // Get total height and width, divide by 2, subtract 1/2 of sidelength
	// in order to center square
        int x_pos = ((getWidth() / 2)-(side/2));
        int y_pos = ((getHeight() / 2)-(side/2));
        g.setColor(this.col);
        g.fillRect(x_pos, y_pos, this.side, this.side);
    }
    
    public void drawSquare() {

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(this);
	//replace integers w/ a variable
        application.setSize(700,700);
        application.setVisible(true);
    }

    public void updateSquare() {
	//calls function to repaint the square
        repaint();
    }
    
    //troubleshooting - prints square details
    public void printSquareDetails(int sideLength, Color color) {
	System.out.println("Side length = " + sideLength + " and color is " + color + ".");
	}	
}

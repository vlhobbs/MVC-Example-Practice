import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SquareController implements MouseListener {
	

    //This class contains model and view
    //Uses model update methods to get/update information
    //uses view method to update the view

    private Square model;
    private SquareView view;
        
    //Default constructor b/c I don't like not having one
    
    public SquareController(){
    	
        this.model = new Square();
        this.view = new SquareView(model);
        view.addMouseListener(this);
}


     //Constructor with private information
     public SquareController(Square model, SquareView view){
        this.model = model;
        this.view = view;
        view.addMouseListener(this);
     }

     //interface implementations for the MouseListener
     //for the moment I only need Clicked
    
     public void mousePressed(MouseEvent e) {
     }

     public void mouseReleased(MouseEvent e) {
     }

     public void mouseEntered(MouseEvent e) {
     }

     public void mouseExited(MouseEvent e) {
     }

     public void mouseClicked(MouseEvent e) {
    	 //troubleshooting - see if handler is reading
    	 //System.out.println("Mouse is clicked");
    	 Color current = model.getColor();
    	 //this will be better as a separate function but later
    	 if (current==Color.red){ //if red
    		 model.setColor(Color.blue);
    	 }
    	 else if (current==Color.blue){
    		 model.setColor(Color.green);
    	 }
    	 else if (current==Color.green) {
    		 model.setColor(Color.white);
    	 }
    	 else{ //anything but red or blue or green
    		 model.setColor(Color.red);
    	 }
    	 view.resetView(model);
    	 view.updateSquare();
     }

     //next step to add: KeyBinder to respond to left and right arrows
     //to change the size of the square
     
    
    
    //getters and setters call the model (Square) methods
    //then call the method to update the view
    //to make sure that they match
    
    public void setSquareSide (int newLength){
        model.setSideLength(newLength);
        view.resetView(model);
    }

    public int getSquareSide (){
        return model.getSideLength();
    }

    public void setSquareColor (Color newColor){
        model.setColor(newColor);
        view.resetView(model);
    }

    public Color getSquareColor (){
        return model.getColor();
    }

    //updateSquareView calls the method to show the information in view

    public void drawSquareView() {
    	view.updateSquare();
    	view.drawSquare();
    }
	
    //this is for troubleshooting purposes, prints out the information about the square to console
    public void showSquareDetails(){
        view.printSquareDetails(model.getSideLength(), model.getColor());
    }

}

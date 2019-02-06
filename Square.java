import java.awt.Color;
public class Square {

    //attributes are color and length of each side

    private Color color;
    private int sideLength;

    
    //Default constructor (no args)
	public Square(){
        this.color = Color.white;
        this.sideLength = 1;
    }
	
    //Constructor with default color
    public Square(int startSide) {
	this.color = Color.white;
	this.sideLength = startSide;
    }

    //Constructor with starting arguments just to make this easier
    public Square(Color startColor, int startSide){
        this.color = startColor;
        this.sideLength = startSide;
    }

    //get the current color
    public Color getColor(){
        return color;
    }

    //set the color
    public void setColor(Color newColor){
        this.color = newColor;
    }

    //get the current side length
    public int getSideLength(){
        return sideLength;
    }

    //set a new side length
    public void setSideLength(int newLength){
        this.sideLength = newLength;
    }
}


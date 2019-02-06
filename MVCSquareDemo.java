public class MVCSquareDemo {
    public static void main(String[] args){ 


      //Create square model 
      Square model  = new Square(200);

      //Create a view to give Square details
      SquareView view = new SquareView(model);

      //Create controller to update the view and print it out
      SquareController controller = new SquareController(model, view);

      //draw new square data
      controller.drawSquareView();
   }

}  
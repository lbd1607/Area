import javax.swing.JOptionPane;

/**
* Laura Davis CIS 260 903
* This program demonstrates a solution to the
* Rectangle Area programming challenge.
*/

public class Area
{
   public static void main(String[] args)
   {
      double length;    // The rectangle's length
      double width;     // The rectangle's width
      double area;      // The rectangle's area

      //calls getLength method
      length = getLength();
      
      //calls getWidth method
      width = getWidth();
      
      //calls areaMethod method
      area = areaMethod(length, width);

      //call printData method
      printData(length, width, area);
      
      System.exit(0);
   }//end main
   
   /**
    * Asks user for the length and returns
    * the length to the main method. 
    * 
    * @return
    */
   public static double getLength()
   {
	   String input;
	   double l;
	   
	   input = JOptionPane.showInputDialog(
	                 "Enter the rectangle's length.");
	   l = Double.parseDouble(input);
	   
	   return l;
   }//end of length
   
   /**
    * Asks the user for width and
    * returns width to the main method.
    * 
    * @return
    */
   public static double getWidth()
   {
	   String input;
	   double w;
	   
	   input = JOptionPane.showInputDialog("Enter the"
	   		+ "rectangle's width");
	   w = Double.parseDouble(input);
	   
	   return w;
   }//end of getWidth
   
   /**
    * Passes user inputs length and width
    * into a method that calculates the area.
    * This method returns the area to main
    * to be printed to the user with JOPtionPane.
    * 
    * @param length
    * @param width
    * @return
    */
   public static double areaMethod(double length, double width)
   {
	   double a;
	   
	   a = length * width;
	   
	   return a;
	   
   }//end of areaMethod
   
   /**
    * Length, width, and area are passed to this
    * method so the values can be printed.
    * 
    * @param l
    * @param w
    * @param a
    */
   public static void printData(double l, double w, double a)
   {
	      JOptionPane.showMessageDialog(null, "Length  = " + l + 
	              "\nWidth = " + w + 
	              "\nArea  = " + a);
   }//end printData
   
   
}//end class


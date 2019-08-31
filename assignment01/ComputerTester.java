package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester{
   public static void main(String[] args) {
      Computer c1 = new Computer("SAMSUNG", "i3-4005U", 8, 10000, true, 4.9);
      Computer c2 = new Computer("SK", "i5-4200U", 4, 256, true, 5.8);
      Computer c3 = new Computer("HP", "i7-4500U", 8, 500, false, 3.2);
      Computer c4 = new Computer("ISUS", "i3-5000U", 16, 1000, false, 6.7);
      
      
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c4);
      
      
            
    	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
      Computer c12 = new Computer("SAMSUNG", "i3-4005U", 8, 10000, true, 4.9);
      Computer c22 = new Computer("SK", "i5-4200U", 4, 256, true, 5.8);
      Computer c32 = new Computer("HP", "i7-4500U", 8, 500, false, 3.2);
      Computer c42 = new Computer("ISUS", "i3-5000U", 16, 1000, false, 6.7);
      
      
      output.println(c12);
      output.println(c22);
      output.println(c32);
      output.println(c42);
      
      
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
 }        
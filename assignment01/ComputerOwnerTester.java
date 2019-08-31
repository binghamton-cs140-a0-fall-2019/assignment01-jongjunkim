package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ComputerOwnerTester{
   public static void main(String[] args){
   
   DateAndPlaceOfBirth b1 = new DateAndPlaceOfBirth(1985,5,3,"Rochester", "New York", "USA");
   StreetUSAddress s1 = new StreetUSAddress("2 Grand Blvd", "unit 5", "Binghamton", "New York", "13905");
   Person p1 = new Person("Jongjun", "Kim" , "143-34-4453",b1, s1);
   
   Computer c1 = new Computer("SAMSUNG", "i3-4005U", 8, 10000, true, 4.9);
   Computer c2 = new Computer("SK", "i5-4200U", 4, 256, true, 5.8);
   Computer c3 = new Computer("HP", "i7-4500U", 8, 500, false, 3.2);
   Computer c4 = new Computer("ISUS", "i3-5000U", 16, 1000, false, 6.7);

   
   ComputerOwner co1 = new ComputerOwner(p1);
   
   co1.addComputer(c1);
   co1.addComputer(c2);
   co1.addComputer(c3);
   co1.addComputer(c4);
   
   System.out.println(co1);
   
   co1.removeComputer(0);
   co1.removeComputer(1);
   
   System.out.println(co1);
   
   try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
      
       DateAndPlaceOfBirth b12 = new DateAndPlaceOfBirth(1985,5,3,"Rochester", "New York", "USA");
      StreetUSAddress s12 = new StreetUSAddress("2 Grand Blvd", "unit 5", "Binghamton", "New York", "13905");
      Person p12 = new Person("Jongjun", "Kim" , "143-34-4453",b12, s12);
      
      Computer c12 = new Computer("SAMSUNG", "i3-4005U", 8, 10000, true, 4.9);
      Computer c22 = new Computer("SK", "i5-4200U", 4, 256, true, 5.8);
      Computer c32 = new Computer("HP", "i7-4500U", 8, 500, false, 3.2);
      Computer c42 = new Computer("ISUS", "i3-5000U", 16, 1000, false, 6.7);
   
      
      ComputerOwner co12 = new ComputerOwner(p12);
      
      co12.addComputer(c12);
      co12.addComputer(c22);
      co12.addComputer(c32);
      co12.addComputer(c42);
      
     output.println(co12);
      
      co12.removeComputer(0);
      co12.removeComputer(1);
      
     output.println(co12);
         
      
      
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
   
      
   
  
   
      
   
   
   }
}
package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester{
   
   public static void main(String[] args) {
   
   DateAndPlaceOfBirth b1 = new DateAndPlaceOfBirth(1985,5,3,"Rochester", "New York", "USA");
   DateAndPlaceOfBirth b2 = new DateAndPlaceOfBirth(1978,4,13,"Binghamton", "New York", "USA"); 
   DateAndPlaceOfBirth b3 = new DateAndPlaceOfBirth(1997,6,10,"Mineopolis", "Minessota", "USA");
   DateAndPlaceOfBirth b4 = new DateAndPlaceOfBirth(1997,6,10,"Seoul","Korea");
   DateAndPlaceOfBirth b5 = new DateAndPlaceOfBirth(1994,5,3,"Beijing", "China");
   
   System.out.println(b1);
   System.out.println(b2);
   System.out.println(b3);
   System.out.println(b4);
   System.out.println(b5);
   
   System.out.println(b1.olderThan(b2));
   System.out.println(b3.olderThan(b2));
   System.out.println(b5.youngerThan(b4));
   System.out.println(b4.hasSameBirthDateAs(b3));
   System.out.println(b5.hasSameBirthDayAs(b1));
   
   
   try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
               DateAndPlaceOfBirth b12 = new DateAndPlaceOfBirth(1985,5,3,"Rochester", "New York", "USA");
               DateAndPlaceOfBirth b22 = new DateAndPlaceOfBirth(1978,4,13,"Binghamton", "New York", "USA"); 
               DateAndPlaceOfBirth b32 = new DateAndPlaceOfBirth(1997,6,10,"Mineopolis", "Minessota", "USA");
               DateAndPlaceOfBirth b42 = new DateAndPlaceOfBirth(1997,6,10,"Seoul","Korea");
               DateAndPlaceOfBirth b52 = new DateAndPlaceOfBirth(1994,5,3,"Beijing", "China");
               
               output.println(b12);
               output.println(b22);
               output.println(b32);
               output.println(b42);
               output.println(b52);
               
               output.println(b12.olderThan(b22));
               output.println(b32.olderThan(b22));
               output.println(b52.youngerThan(b42));
               output.println(b42.hasSameBirthDateAs(b32));
               output.println(b52.hasSameBirthDayAs(b12));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
     
         
   }
}  

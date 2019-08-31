package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PersonTester{
   public static void main(String[] args){
   
   DateAndPlaceOfBirth b1 = new DateAndPlaceOfBirth(1985,5,3,"Rochester", "New York", "USA");
   StreetUSAddress s1 = new StreetUSAddress("2 Grand Blvd", "unit 5", "Binghamton", "New York", "13905");
   Person p1 = new Person("Jongjun", "Kim" , "143-34-4453",b1, s1);
   
   System.out.println(p1);
   
   
   try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
      
      DateAndPlaceOfBirth b12 = new DateAndPlaceOfBirth(1985,5,3,"Rochester", "New York", "USA");
      StreetUSAddress s12 = new StreetUSAddress("2 Grand Blvd", "unit 5", "Binghamton", "New York", "13905");
      Person p12 = new Person("Jongjun", "Kim" , "143-34-4453",b1, s1);
   
      output.println(p12);
      
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
   
    


   }
}
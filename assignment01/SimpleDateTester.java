package assignment01;
import java.util.Date;

public class SimpleDateTester{
   public static void main(String[] args){

   SimpleDate sd = new SimpleDate();
   SimpleDate sd1 = new SimpleDate();
   
   sd.of(1999,7,30);
   sd1.of(1997,6,10);
   
  System.out.println(sd1.before(sd));
   
   }
}
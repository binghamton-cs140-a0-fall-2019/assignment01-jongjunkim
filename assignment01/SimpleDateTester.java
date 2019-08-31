package assignment01;
import java.util.Date;

public class SimpleDateTester{
   public static void main(String[] args){

   SimpleDate sd = new SimpleDate();
   SimpleDate sd1 = new SimpleDate();
   
   sd.of(1996,1,30);
   sd1.of(1997,6,10);
   
   System.out.println(sd.before(sd1));
   
   }
}
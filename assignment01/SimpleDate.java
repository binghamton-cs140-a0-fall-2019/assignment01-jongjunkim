package assignment01;
import java.util.Date;

public class SimpleDate{

   private int year;
   private int month;
   private int day;

   public static SimpleDate of(int yr, int m, int d){
        
      var returnValue = new SimpleDate();
             
      returnValue.year = yr;
      returnValue.month = m;
      returnValue.day= d;
      
      return returnValue;
   }
   
   public boolean before(SimpleDate other){

      
      if(this.before(other)){
         return true;
      }else{
         return false;
      }   
   
   
   
   }
}
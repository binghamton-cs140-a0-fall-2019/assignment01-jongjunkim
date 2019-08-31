package assignment01;
import java.time.LocalDate;
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
   
      boolean isBefore = true;
   
      if(this.year < other.year){
        isBefore =  true;
        if(this.month < other.month){
            isBefore =  true;
            if(this.day < other.day){
               isBefore = true;
             }else{
               isBefore = false;
            }   
         }else{
            isBefore = false;
         }
      }else{
         isBefore = false;
      }   
       
     return isBefore; 
            
              
   
     
                
    }
}
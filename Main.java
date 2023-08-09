import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {



 public static void clock(){
   try {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
      LocalDateTime previousTime = LocalDateTime.now();
      while (true) {
          LocalDateTime currentTime = LocalDateTime.now();
          String formattedTime = currentTime.format(formatter);
          System.out.print("Current time: " + formattedTime);

          double timeDifferenceMillis = (double) java.time.Duration.between(previousTime, currentTime).toMillis();
          double speed = 1000.0 / timeDifferenceMillis; 

          String[] units = {"Hz", "kHz", "MHz", "GHz"};
          int unitIndex = 0;
          while (speed >= 1000.0 && unitIndex < units.length - 1) {
              speed /= 1000.0;
              unitIndex++;
          }

          System.out.printf("  %.2f %s\n", speed, units[unitIndex]);

          previousTime = currentTime;
          Thread.sleep(1000);
      }
  } catch (InterruptedException e) {
      e.printStackTrace();
  }
}
   public static void flipNHeads(int n){
      int l=0,c=0;
      while (true){
         if(l==n){
             System.out.println("It took " + c + " flips to flip " + n +" head in a row.");
         break;}
         
         Random random = new Random();
         int randomNumber = random.nextBoolean() ? 1 : 0;
    
         if(randomNumber==1){
         ++l;
         System.out.println("heads");
      }
      else{
      System.out.println("tails");
      l=0;}
++c;
      }
   } 
  
   public static void pluralize(String name, int c ){
  System.out.print("I own " + c + " ");
      if(c==0 || c>=2)
      System.out.println(name+"s.");
      else
      System.out.println(name+'.');}
   public static void main(String[] args) {
    
      int AnimalCount = 0;
pluralize("dog",AnimalCount);
flipNHeads(10);
clock();
   }
}
package array;
import java.util.Scanner;
class animal{
 public void cat(){
     System.out.println("Meowwwwwwwwwwwwww");
} 
public void dog(){
    System.out.println("Bhaoooooooooooo");
} 
public void monkey(){
    System.out.println("Ewwwwwwwwwwwwwwwwwwww");
}
}
public class Array {
   public static void main (String[] args){
        animal sc = new animal();
        Scanner input = new Scanner(System.in);
         System.out.println("Whose voice you want to listen");
         System.out.println("1. Cat , 2, Dog , 3. Monkey");
         int no = input.nextInt();
         if(no ==1){
             sc.cat();
         }
         else if(no ==2){
             sc.dog();
         }
         else if(no ==3){
             sc.monkey();
         }
       
   
   }
    
}

import java.util.Scanner;
public class MaxGonzales {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Hello!");
        System.out.println("");
        
        System.out.println("Please type in your number in the 0 index");
        
        System.out.println("");
        
        int num1 = num.nextInt();
        
        System.out.println("");
        
        System.out.println("Please type in your number in the 1 index");  
        
        System.out.println("");
        
        int num2 = num.nextInt();   
        
        System.out.println("");
         
        System.out.println("Please type in your number in the 2 index");
        
        System.out.println("");
         
         int num3 = num.nextInt();
        
         System.out.println("");
         
         if(num1 > num2 && num1 > num3){
             System.out.println("The index of the highest number is 0");
         }
         else if(num2 > num1 && num2 > num3){
             System.out.println("The index of the highest number is 1");
         }
         else if(num3 > num1 && num3 > num2){
             System.out.println("The index of the highest number is 2");
         }
         else if(num1==num2 && num1==num3 && num2==num1 && num2==num3 && num3 == num1 && num3 == num2){
             System.out.println("Everything is equal.");
         }
         else{
              System.out.println("You typed something invalid.");
         }     
         //This is a comment
        // this is another comment
}

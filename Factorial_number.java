import java.util.Scanner;
public class Factorial_number {
    public static void main(String args[]){  
        int i,fact=1;  
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number- ");
        int number = sc.nextInt(); 

        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
       } 
}

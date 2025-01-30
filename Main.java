import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  
    
    System.out.print("Enter an integer: ");  
    int number = scanner.nextInt();  
    System.out.println("The factorial of "+number+" is: "+ numbers(number));    


}
  static int numbers(int number){

    int i,fact=1;  
    for(i=1;i<=number;i++){    
        fact=fact*i;    
    }    


    return fact;

   }  


}

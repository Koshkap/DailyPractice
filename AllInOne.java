import java.util.Scanner;
public class AllInOne {
    public static void processNumbers(int num1, int num2, int num3) {
        
        int sum = sum(num1,num2,num3);
        int max = max(num1, num2,num3);
        double average = average(num1,num2,num3,sum);
        int min = min(num1,num2,num3);
        boolean allPositive = pos(num1,num2,num3);
        printAll( num1,  num2,  num3, sum, max, average,  min,  allPositive);

    }
    public static int sum(int num1, int num2, int num3) {
        // Calculate sum
        int sum = num1 + num2 + num3;
        return sum;
        }
        
        // Find max
        public static int max(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
      }
// Find min
      public static int min(int num1, int num2, int num3) {
      int min = num1;
      if (num2 < min) {
          min = num2;
      }
      if (num3 < min) {
          min = num3;
      }
      return min;
      }
        // Calculate average
        public static double average(int num1, int num2, int num3, int sum) {
        double average = sum / 3.0;
        return average;
        }
        //// Check if all numbers are positive
        /// 
        public static boolean pos(int num1, int num2, int num3) {
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
        }
        //Print results

        public static void printAll(int num1, int num2, int num3,int sum,int max,double average, int min, boolean allPositive) {
          System.out.println("Sum: " + sum);
          System.out.println("Max: " + max);
          System.out.println("Min: " + min);
          System.out.println("Average: " + average);
          System.out.println("All numbers are positive: " + allPositive);
          System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
        }
        static void myMethod() {
          Scanner myObj = new Scanner(System.in);
          System.out.print("Enter number 1: ");
          int num1 = myObj.nextInt();
          System.out.print("Enter number 2: ");
          int num2 = myObj.nextInt();
          System.out.print("Enter number 3: ");
          int num3 = myObj.nextInt();
          processNumbers(num1, num2, num3);
    
        }
    public static void main(String[] args) {
      myMethod();
    }

}

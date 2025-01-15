// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int three = 3;
    int five = 5;
    int fifteen = 15;
    int fifteenHundred = 1500;

    if (three % 15 == 0) {
      System.out.println("FizzBuzz");
    } else if (three % 3 == 0) {
      System.out.println("Fizz");
    } else if (three % 15 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println("No fizz No buzz");
    }
      
    if (five % 15 == 0) {
      System.out.println("FizzBuzz");
    } else if (five % 3 == 0) {
      System.out.println("Fizz");
    } else if (five % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println("No fizz No buzz");
    }
    if (fifteen % 15 == 0) {
      System.out.println("FizzBuzz");
    } else if (three % 3 == 0) {
      System.out.println("Fizz");
    } else if (fifteen % 15 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println("No fizz No buzz");
    }
    if (fifteenHundred % 15 == 0) {
      System.out.println("FizzBuzz");
    } else if (fifteenHundred % 3 == 0) {
      System.out.println("Fizz");
    } else if (fifteenHundred % 15 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println("No fizz No buzz");
    }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}

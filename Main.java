import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("what is your name?");
    String name = scan.next();
    System.out.println("what year is it?");
    int currentyear = scan.nextInt();
    System.out.println("what is your birth year?");
    int birthYear = scan.nextInt();

    int age = getAge(birthYear, currentyear);

    if (attendParty(age)) {
      System.out.println("Yay! You got the job!");

    } else {
      System.out.println("Maybe next year you will be able to get the job!");

    }
  }

  // method calculates age
  static int getAge(int birthYear, int currentYear) {
    int age = currentYear - birthYear;
    return age;
  }

  // method returns greeting
  static String greeting(String name) {
    String hello = "hello, welcome back. " + name;
    return hello;
  }

  // create a method that takes in at least 1 parameter and returns some type
  // call this new method within your main method
  static boolean attendParty(int age) {
    if (age >= 16) {
      return true;
    } else {
      return false;
    }
  }
}

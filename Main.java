import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int totalJobs = 0;
    System.out.println("what is your name?");
    String name = scan.next();
    System.out.println("what year is it?");
    int currentyear = scan.nextInt();
    System.out.println("what is your birth year?");
    int birthYear = scan.nextInt();
    int age = getAge(birthYear, currentyear);
    System.out.println("how many years of experience do you have?");
    int yearsOfExperience = scan.nextInt();
    if (becameRapManager(age, yearsOfExperience)) {
      System.out.println("Yay! You are qualified to be a music manager!");
      totalJobs = jobsAvailable(totalJobs); 

    } else {
      System.out.println("Maybe next year you will be able to get the spot!");

    }
  }

  // method calculates age
  static int getAge(int birthYear, int currentYear) {
    int age = currentYear - birthYear;
    return age;
  }

  // method returns greeting
  static String greeting(String name) {
    String hello = "hello, nice to meet you! " + name;
    return hello;
  }

  static boolean becameRapManager(int age, int experience) {
    // create a method that takes in at least 1 parameter and returns some type
    // call this new method within your main method
    // possibly change method name
    if (experience >= 3 && age > 20) {
      return true;
    } else {
      return false;
    }
  }

  static int jobsAvailable(int totalJobs) {
    totalJobs = totalJobs + 3;
    return jobsAvailable;

  }

}

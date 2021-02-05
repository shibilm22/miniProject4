import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int totalJobs = 3;
    //starting with three jobs 
    System.out.println("jobs available = " + totalJobs);
    //depending if you got the job or not it will either stay as 3 or subtract a 1 if you got the job
    System.out.println("Hello nice to meet you! What is your name?");
    //greeting for the user
    String name = scan.next();
    System.out.println("what year is it?");
    //this will be asked to calculate the age
    int currentyear = scan.nextInt();
    System.out.println("what is your birth year?");
    //this will be asked to calculate the age
    int birthYear = scan.nextInt();
    int age = getAge(birthYear, currentyear);
    System.out.println("how many years of experience do you have?");
    //this will allow the user to know if he or she is qualified 
    int yearsOfExperience = scan.nextInt();
    if (becameRapManager(age, yearsOfExperience)) {
      System.out.println("Yay! You are qualified to be a music manager!");
      //this will only show up IF age, and experience passed
      totalJobs = jobsAvailable(totalJobs);
      System.out.println("jobs available = " + totalJobs);
      //if qualified, the user will get a job and subtract the first amount of jobs by 1

    } else {
      System.out.println("Maybe next year you will be able to get the spot!");

    }
  }

  // method calculates age
  static int getAge(int birthYear, int currentYear) {
    int age = currentYear - birthYear;
    //this formula will calculate the age of the user.
    return age;
  }
  //method will allow you to find out if you got the job.
  static boolean becameRapManager(int age, int experience) {
    // call this new method within your main method
    if (experience >= 3 && age >= 20) {
      //you must have experience of 3 or more years and must be greater than or equal to 20 for age. 
      return true;
      //will return true if user passes the requierments
    } else {
      return false;
      //will return false if user does not pass the requierment
    }
  }
  //method will calculate the totalJobs
  static int jobsAvailable(int totalJobs) {
    totalJobs = totalJobs - 1;
    return totalJobs;
    //return the totalJobs depending if you got the job or not

  }

}

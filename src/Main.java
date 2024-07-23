import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      String animal = "zebra";
      String name = "James";
      String action = "running";
      int amntOfTime = 20;
      int daysRemaining = 30;
      String emotion = "sad";
      String hasFood = "has";
      double amountOfFood = 12.5;
      String isAttacked = "attacked";
      String anotherAnimal = "Grizzly Bear";
      String die = "die";
      String story = "Once upon a time, A " + animal + " named " + name + " was " + action + " across the Anderson Bridge for around " +
              amntOfTime + " minutes. He sadly only has " + daysRemaining + " days remaining left on Earth, and when he figured this out he was extremely " +
              emotion + ".\nHe is very lucky because he " + hasFood + " food in his inventory. Specifically he has " + amountOfFood + " barrels of hay in his inventory." +
              " \nDue to this, he kept on eating, which made him very immobile. When he had 2 days left on Earth, a huge " + anotherAnimal + " " + isAttacked + " him, which caused him to " + die +
              " in 2 minutes. \nHe lived a beautiful life, and rest in peace soldier.";

      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter the password: ");
      int check = 3;
      String password = userInput.nextLine();

        if (password.equals("JavaCoding")) {
          System.out.println(story);
        } else {
          while(!password.equals("JavaCoding")) {
            check = check - 1;
            if(check == 0){
              System.out.println("You are done. GoodBye!");
              break;
            }
          System.out.println("That's not correct. You have " + check + " more try's remaining");
            password = userInput.nextLine();
        }
      }

  }
}


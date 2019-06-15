package assistant;
import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Andrzej.");
        System.out.println("I was created in 2019.");
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, ".concat(name));
        System.out.println("Let me guess your age.\nSay me reminders of dividing your age by 3, 5 and 7.");
        int divByThree = scanner.nextInt();
        int divByFive = scanner.nextInt();
        int diveBySeven = scanner.nextInt();
        System.out.println("Your age is " + ((divByThree * 70 + divByFive * 21 +
                            diveBySeven * 15) % 105) + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");
        System.out.println("Let's test your programming knowledge.\nWhy do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (true) {
            int answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            }
            else
                System.out.println("Please, try again.");
        }


    }
}

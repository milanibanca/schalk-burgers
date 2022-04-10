package projects.learningJava;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome To Schalk Burger's \n1 - Create Burger \n2 - Healthy Burger\n3 - Deluxe Burger\nq - Quit\nPlease Enter Option: ");
        System.out.println();
        String res = scanner.next();
        while (true) {
            if (res.toLowerCase(Locale.ROOT).equals("q")) {
                break;
            }
            if(res.toLowerCase(Locale.ROOT).equals("1")){
                Burger burger = new Burger();
                break;
            }
            if(res.toLowerCase(Locale.ROOT).equals("2")){
                HealthyBurger healthyBurger = new HealthyBurger();
                break;
            }
            if(res.toLowerCase(Locale.ROOT).equals("3")){
                DeluxeBurger deluxeBurger = new DeluxeBurger();
                break;
            }
            System.out.printf("\n1 - Create Burger \n2 - Healthy Burger\n3 - Deluxe Burger\nPlease Enter Option: ");
            res = scanner.nextLine();

        }
        scanner.close();
    }


}

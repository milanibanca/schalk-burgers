package projects.learningJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HealthyBurger extends Burger {
    public HealthyBurger() {
        super("Healthy Burger");
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public BreadRoll setBreadRoll() {
        return new BreadRoll("Brown Rye",8);
    }

    @Override
    public List<Addition> setAdditions() {
        Addition addition = new Addition();
        addition.printAdditionsMenu();
        Scanner scanner = new Scanner(System.in);
        String chose;
        List<Addition> additions = new ArrayList<>();
        System.out.println("Enter the Addition you would like");
        chose = scanner.nextLine();
        int count = 0;
        while (chose.equals("q") == false) {
            additions.add(choseAddition(chose));
            count++;
            if (count >= 6) {
                break;
            }
            addition.printAdditionsMenu();
            System.out.println("Enter another Addition or Quit by pressing: q");
            chose = scanner.nextLine();
        }
        scanner.close();
        return additions;

    }
}

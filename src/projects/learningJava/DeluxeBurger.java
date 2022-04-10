package projects.learningJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeluxeBurger extends Burger{
    public DeluxeBurger(String name) {
        super(name);
    }
    public DeluxeBurger() {
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
            if (count >= 4) {
                break;
            }
            addition.printAdditionsMenu();
            System.out.println("Enter another Addition or Quit by pressing: q");
            chose = scanner.nextLine();
        }
        additions.add(new Addition("Chips",14));
        additions.add(new Addition("Drinks",17));
        scanner.close();
        return additions;

    }
}

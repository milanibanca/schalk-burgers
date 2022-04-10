package projects.learningJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Burger {
    private String name;
    private BreadRoll breadRoll;
    private Meat meat;
    private double price;
    private List<Addition> additions;

    public Burger(String name) {
        System.out.println(this.getClass().getSimpleName());
        int adds;
        this.name = name;
        this.breadRoll = setBreadRoll();
        this.meat = setMeat();
        this.additions = setAdditions();
        this.price = price + getBreadRoll().getPrice() + getMeat().getPrice() + additionTotal();
        System.out.printf("Burger Details:\nName : %s\nBread : %s\tR%.2f\nMeat : %s\tR%.2f\n",
                this.name, this.breadRoll.getName(), this.breadRoll.getPrice(), this.meat.getName(), this.meat.getPrice());
        for (int i = 0; i < this.additions.size(); i++) {
            System.out.printf("%s\tR%.2f\n", this.additions.get(i).getName(), this.additions.get(i).getPrice());
        }
        System.out.println();
        System.out.printf("Price : R%.2f", price);


    }

    public double additionTotal() {
        double ans = 0;
        for (int i = 0; i < this.additions.size(); i++) {
            ans += additions.get(i).getPrice();
        }
        return ans;
    }

    public Burger() {

    }

    public BreadRoll getBreadRoll() {
        return breadRoll;
    }

    public Meat getMeat() {
        return meat;
    }

    public BreadRoll setBreadRoll() {
        Scanner scanner = new Scanner(System.in);
        String chose;
        BreadRoll breadRoll = new BreadRoll();
        breadRoll.printBreadMenu();
        System.out.println("Enter the bread you would like.");
        chose = scanner.next();
        breadRoll = choseBread(chose);
        return breadRoll;

    }


    public Meat setMeat() {
        Scanner scanner = new Scanner(System.in);
        String chose;
        Meat meat = new Meat();
        meat.printMeatBurger();
        System.out.println("Enter the paddie you would like");
        chose = scanner.next();
        meat = choseMeat(chose);
        return meat;
    }


    public List<Addition> setAdditions() {
        Scanner scanner = new Scanner(System.in);
        List<Addition> additions = new ArrayList<>();
        Addition addition = new Addition();
        addition.printAdditionsMenu();
        String chose;
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
        scanner.close();
        return additions;

    }


    public Addition choseAddition(String chose) {

        switch (chose) {
            case "1":
                return new Addition("tomato", 5);
            case "2":
                return new Addition("lettuce", 2);
            case "3":
                return new Addition("pickels", 5);
            case "4":
                return new Addition("carrot", 4);
            case "5":
                return new Addition("bacon", 10);
            default:
                return null;
        }
    }

    public Meat choseMeat(String chose) {
        switch (chose) {
            case "1":
                return new Meat("Chicken", 15);
            case "2":
                return new Meat("Veggie", 10);
            case "3":
                return new Meat("Beef", 12);
            case "4":
                return new Meat("Vegan", 13);
            default:
                return null;
        }
    }

    public BreadRoll choseBread(String chose) {
        switch (chose) {
            case "1":
                return new BreadRoll("Normal", 5);
            case "2":
                return new BreadRoll("Brown Rye", 8);
            case "3":
                return new BreadRoll("Low Gi", 12);
            default:
                return null;
        }
    }


}

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

    public Burger(String name, BreadRoll breadRoll) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = setMeat();
        this.additions = setAdditions();
        this.price = price + getBreadRoll().getPrice() + getMeat().getPrice() + additionTotal();
        System.out.printf("Burger Details:\nName : %s\nBread : %s\tR%.2f\nMeat : %s\tR%.2f\n",
                this.name,this.breadRoll.getName(),this.breadRoll.getPrice(),this.meat.getName(),this.meat.getPrice());
        System.out.println("Your Additions");
        for(int i = 0 ; i < this.additions.size(); i ++){
            System.out.printf("%s\tR%.2f\n",this.additions.get(i).getName(),this.additions.get(i).getPrice());
        }


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

    public void setBreadRoll(BreadRoll breadRoll) {
        this.breadRoll = breadRoll;
    }

    public Meat getMeat() {
        return meat;
    }

    public Meat setMeat() {
        Scanner scanner = new Scanner(System.in);
        String chose;
        Meat meat = new Meat();
        meat.printMeatBurger();
        System.out.println("Enter the paddie you would like");
        chose = scanner.next();
        meat = choseMeat(chose);
//        scanner.close();
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Addition> getAdditions() {
        return additions;
    }

    public List<Addition> setAdditions() {
//        System.out.println("Burger Name : " + this.name);
        Scanner scanner = new Scanner(System.in);
        List<Addition> additions = new ArrayList<>();
        Addition addition = new Addition();
        addition.printAdditionsMenu();
        String chose;
        System.out.println("Enter the Addition you would like");
        chose = scanner.nextLine();
        int count = 0;
        while (true && chose.equals("q") == false) {
            additions.add(choseAddition(chose));
            count++;
            if (count >= 4) {
                break;
            }
            addition.printAdditionsMenu();
            System.out.println("Enter another Addition or Quit by pressing: q");
            chose = scanner.nextLine();
        }
//
//        System.out.println("Selected " + additions.size()+ " Additions: ");
//        for (int i = 0; i < additions.size(); i++) {
//            System.out.println(i + 1 + " " + additions.get(i).getName() + " R" + additions.get(i).getPrice());
//        }
//        System.out.println();
        scanner.close();
        return additions;

    }

    public Addition choseAddition(String chose) {

        switch (chose) {
            case "1":
                Addition tomato = new Addition("tomato", 5);
                return tomato;
            case "2":
                Addition lettuce = new Addition("lettuce", 2);
                return lettuce;
            case "3":
                Addition pickels = new Addition("pickels", 5);
                return pickels;
            case "4":
                Addition carrot = new Addition("carrot", 4);
                return carrot;
            case "5":
                Addition bacon = new Addition("bacon", 10);
                return bacon;
            default:
                return null;
        }
    }

    public Meat choseMeat(String chose) {
        switch (chose) {
            case "1":
                Meat chicken = new Meat("Chicken", 15);
                return chicken;
            case "2":
                Meat veggie = new Meat("Veggie", 10);
                return veggie;
            case "3":
                Meat beef = new Meat("Beef",12);
                return beef;
            case "4":
                Meat vegan = new Meat("Vegan",13);
                return vegan;
            default:
                return null;
        }
    }

    public void printBurgerAdditions() {
        Addition addition = new Addition();
        addition.printAdditionsMenu();
    }
}

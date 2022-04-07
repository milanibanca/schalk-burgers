package projects.learningJava;

public class Meat {
    private String name;
    private double price;

    public Meat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void printMeatBurger(){
        System.out.println("Meat Menu");
        Burger burger = new Burger();
        for (int i = 0; i < 4 ; i ++ ){
            String chose = Integer.toString(i + 1);
            System.out.printf("%s - %s R%.2f\n",i + 1,burger.choseMeat(chose).getName(),burger.choseMeat(chose).getPrice());
        }
    }

    public Meat() {
    }
}

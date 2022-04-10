package projects.learningJava;

public class BreadRoll {
    private String name;
    private double price;

    public BreadRoll(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public  BreadRoll(){

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void printBreadMenu(){
        System.out.println("Bread Menu");
        Burger burger = new Burger();
        for (int i = 0; i < 3; i ++){
            String chose = Integer.toString(i + 1);
            System.out.printf("%s - %s R%.2f\n", i + 1, burger.choseBread(chose).getName(), burger.choseBread(chose).getPrice());
        }
    }

}

package projects.learningJava;

public class Addition {
    private String name;
    private double price;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Addition(){

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void printAdditionsMenu(){
        System.out.println("Burger Addition Menu");
        Burger burger = new Burger();
        for (int i = 0; i < 5; i ++){
            String chose = Integer.toString(i + 1);
            System.out.printf("%s - %s R%.2f\n",i + 1, burger.choseAddition(chose).getName(),burger.choseAddition(chose).getPrice());
        }
    }
}

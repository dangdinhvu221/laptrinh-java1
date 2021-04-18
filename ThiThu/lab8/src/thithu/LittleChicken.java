package thithu;

public class LittleChicken extends Chicken{
    private double weight;

    public LittleChicken(){
        super();
    }

    public LittleChicken(double weight) {
        this.weight = weight;
    }

    public LittleChicken(String name, String color, int price, double weight) {
        super(name, color, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "LittleChicken{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public void output() {
        super.output();
        System.out.println("weight " + weight);
    }
}

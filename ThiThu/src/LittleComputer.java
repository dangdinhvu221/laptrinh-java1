public class LittleComputer extends Computer {
    private String color;

    public LittleComputer() {
        super();
    }

    public LittleComputer(String color) {
        this.color = color;
    }

    public LittleComputer(String name, int age, int price, String color) {
        super(name, age, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void input() {
        super.input();
        System.out.print("Nhập color: ");
        color = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println(toString());
    }
}

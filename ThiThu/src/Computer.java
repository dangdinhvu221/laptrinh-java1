import java.util.Scanner;

public class Computer {
    private String name;
    private int age, price;
    static Scanner sc = new Scanner(System.in);

    public Computer() {
        super();
    }

    public Computer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    public String Name(String name, Scanner sc) {
        System.out.println(name);
        return sc.nextLine();
    }

    public Integer NumBer(int number, Scanner sc) {
        System.out.println(number);
        return Integer.parseInt(sc.nextLine());
    }

    public void input() {
        name = Name("Nhập Name: ", sc);
        age = NumBer("Nhập Age: ", sc);
        price = NumBer("Nhập price: ", sc);
    }

    public void output() {
        System.out.println(toString());
    }
}

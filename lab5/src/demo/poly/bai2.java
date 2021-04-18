package demo.poly;

import java.util.ArrayList;

public class bai2 {
    static ArrayList<Double> list = new  ArrayList<>();

    public static void main(String[] args) {
        list.add(2.5);
        list.add(3.5);
        list.add(1,2.5);
        list.add(3, 8.5);
        list.get(2);
//        for (int i = 0; i <list.size() ; i++) {
//            Double ls = list.get(i);
//            System.out.println(ls);
//        }
//        for (Double x: list) {
//            System.out.println(x);
//        }
        list.forEach((n) -> System.out.println(n)); {
        };
    }
}

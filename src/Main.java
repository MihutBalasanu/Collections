import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("red");
        Garage<Car> g1 = new Garage<>(car);
        Cat cat = new Cat("pis");
        Garage<Car> g2 = new Garage<>(car);

        List<String> strings = new ArrayList<>();
        strings.add("string1");
        strings.add("string2");
        strings.add("string3");


        System.out.println(strings);
        System.out.println(strings.get(0));
        System.out.println(strings.size());

        // parcurgerea listei
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        for(String s : strings){
            System.out.println(s);
        }


    }
}

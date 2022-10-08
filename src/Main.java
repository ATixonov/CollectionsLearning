import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Tomas");
        cats[1] = new Cat("Jimmy");
        cats[2] = new Cat("Billy Zane");
        System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catsList = new ArrayList<>();
        for (Cat cat : cats) {
            catsList.add(cat);
        }
        catsList.add(new Cat("Jimmy 007"));
        Cat cat = catsList.get(0);
        System.out.println(cat);
        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("Me put in here"));

        System.out.println(catsList.toString());
        System.out.println(catsList.size());

        String str1 = new String("Hello world");
        String str2 = new String("My name is Future");
        String str3 = new String("I love Java");

        LinkedList<String> futureInfo = new LinkedList<>();
        futureInfo.add(str1);
        futureInfo.add(str2);
        futureInfo.add(str3);

        System.out.println(futureInfo);
        futureInfo.remove(1);
        System.out.println(futureInfo);

        LinkedList<Car> cars = new LinkedList<>();
        Car lada = new Car("Granta");
        Car volga = new Car("Syber");
        Car kamaz = new Car("Labaz");

        cars.addAll(Arrays.asList(lada, volga, kamaz));
        System.out.println(cars);

        cars.addFirst(new Car("Daewoo Nexia"));
        cars.addLast(new Car("Zaporozhec"));
        System.out.println(cars);

    }
}

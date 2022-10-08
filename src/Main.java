import java.util.*;

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


        List<Integer> list = new LinkedList<>();
        for (int i=0; i<5000000; i++){
            list.add(new Integer(i));
        }
        long start = System.currentTimeMillis();
        for (int i=0; i<100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }
        System.out.println("Time of work LinkedList ms "+(System.currentTimeMillis()-start));

        list = new ArrayList<>();
        for (int i=0; i<5000000; i++){
            list.add(new Integer(i));
        }
        start = System.currentTimeMillis();
        for (int i=0; i<100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }
        System.out.println("Time of work ArrayList ms "+(System.currentTimeMillis()-start));


        Set<String> country = new HashSet<>();
        country.add("Russia");
        country.add("Kazakhstan");
        country.add("Turkey");

        boolean isAdded = country.add("Turkey");
        System.out.println("Turkey is added "+isAdded);
        System.out.println("Set contains: "+ country.size());
        System.out.println(country);
        country.remove("Kazakhstan");
        System.out.println(country);


        HashSet<Cat> catHashSet = new HashSet<>(catsList);
        System.out.println(catHashSet);
        TreeSet<Cat> catTreeSet = new TreeSet<>(catsList);
        System.out.println(catTreeSet);


        Map<Integer, String> countryMap = new HashMap<>();
        countryMap.clear();
        countryMap.put(1, "Russia");
        countryMap.put(2, "Kazakhstan");
        countryMap.put(3, "Turkey");
        countryMap.put(4, "China");

        System.out.println(countryMap.keySet());
        countryMap.remove(2);

        for (Map.Entry<Integer, String> item: countryMap.entrySet()){
            System.out.printf("| Key: %d | Value: %s \n", item.getKey(), item.getValue());
        }

        String first = countryMap.get(2);
        System.out.println(first);

    }
}

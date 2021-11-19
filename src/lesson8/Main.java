package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(3);
        for (int i = 0; i < 10 ; i++) {
            map.put(random.nextInt(10), "a");
        }

        System.out.println(map);
        map.remove(5);
        System.out.println(map);

    }
}

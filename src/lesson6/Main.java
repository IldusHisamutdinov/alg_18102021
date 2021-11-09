package lesson6;
//программа для построения двоичного дерева
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, Integer> mapHome = new MyTreeMap<>();
        Random random = new Random();
        int m = 0; //всего деревьев
        int n = 100000;
        int number_min = -100;
        int number_max = 100;
        int h = 0; //глубина деревьев
        for (int i = 0; i <= n; i++) {
            int randomNumber = (random.nextInt(201) - 100);
            int result = number_min + (int) (Math.random() * ((number_max - number_min) + 1));
            mapHome.put(randomNumber, result);
            if (mapHome.heightTree() == 7) {
                mapHome.delete(randomNumber);
                mapHome.unbalanced();
                h = mapHome.heightTree();
                ++m;
                mapHome.deleteAll();
            }
        }
        System.out.println("Глубина деревьев " + h);
        System.out.println("всего деревьев " + m + ";" + " циклов " + n);
        System.out.println("несбалансированных деревьев " + mapHome.unbalanced() + " %");
    }
}

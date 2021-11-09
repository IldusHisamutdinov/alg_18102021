package lesson5;

import lesson5.MyHomework.KnapsackTask;
import lesson5.MyHomework.Subjects;

public class Main {
    public static void main(String[] args) {
      //  возведение числа в степень
        System.out.println(HomeRecStepNumber.recStepNumber(2, -2));
      // задача о рюкзаке
        Subjects[] kn = {new Subjects(100, 300),
                new Subjects(1, 300),
                new Subjects(1, 2300),
                new Subjects(2, 1300),
                new Subjects(2, 700)
        };
        KnapsackTask knapsack = new KnapsackTask(kn);
        int weight = 5;
        System.out.println(knapsack.knapsackTask(kn.length - 1, weight));

    }
}

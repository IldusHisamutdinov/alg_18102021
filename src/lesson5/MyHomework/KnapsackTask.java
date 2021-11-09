package lesson5.MyHomework;

public class KnapsackTask {
    private Subjects[] knapsack;

    public KnapsackTask(Subjects[] knapsack) {
        this.knapsack = knapsack;
    }

    public int knapsackTask(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (knapsack[i].weight > weight) {
            return knapsackTask(i - 1, weight);
        } else {
            return Math.max(knapsackTask(i - 1, weight), knapsackTask(i - 1, weight - knapsack[i].weight) + knapsack[i].price);
        }
    }
}


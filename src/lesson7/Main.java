package lesson7;
/*
Реализовать программу, в которой задается граф из 10 вершин.
Задать ребра и найти кратчайший путь с помощью поиска в ширину.
 */
public class Main {
    public static void main(String[] args) {
        int v1 = 1; // Начальная вершина
        int v2 = 10; // Конечная вершина
        Graph graph = new Graph(11);
        graph.addEdge(1, 2); // 1
        graph.addEdge(1, 3); // 2
        graph.addEdge(1, 4); // 3
        graph.addEdge(4, 6); // 4
        graph.addEdge(4, 7); // 5
        graph.addEdge(2, 6); // 6
        graph.addEdge(3, 6); // 7
        graph.addEdge(3, 5); // 8
        graph.addEdge(5, 8); // 9
        graph.addEdge(6, 8); // 10
        graph.addEdge(6, 9); // 11
        graph.addEdge(6, 10); // 12
        graph.addEdge(7, 10); // 13
        graph.addEdge(8, 9); // 14
        graph.addEdge(9, 10); // 15
        graph.addEdge(2, 7); // 16

        System.out.println("Всего рёбер " + graph.getEdgeCount());
        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, v1);
        System.out.println("Кратчайший путь от " + v1 + " до " + v2 + " " + bfp.pathTo(v2));
    }
}

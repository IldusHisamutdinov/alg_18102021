package lesson5;

public class HomeRecStepNumber {
    //возведение числа в степень с помощью рекурсии
    public static int recStepNum(int a, int b) {
        if (b <= 0) {
            return 1;
        }
        return recStepNum(a, b - 1) * a;
    }
    public static int recStepNumber(int a, int b) {
        int c = recStepNum(a, b);
        System.out.println(a + " в степень " + b + " равно "+ c);
        return 1;
    }
}

package lesson5;

public class HomeRecStepNumber {
    //возведение числа в степень с помощью рекурсии
    public static double recStepNum(double a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b > 0) {
            return recStepNum(a, b - 1) * a;
        } else {
            b = -b;
            return 1 / (recStepNum(a, b - 1) * a);
        }
    }

    public static boolean recStepNumber(double a, int b) {
        double c = recStepNum(a, b);
        System.out.println(a + " в степень " + b + " равно " + c);
        return true;
    }
}

import java.util.Scanner;

public class program {

    public static final String KAT_A = "Введите катет A: ";
    public static final String KAT_B = "Введите катет B: ";

    public static double hypotenuse(double a, double b) {
        double с = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return с;
    }

    public static double perimeter(double a, double b, double c) {
        double p = (a+b+c);
        return p;
    }

    public static double high(double a, double b, double c) {
        double h = (a*b)/c;
        return h;
    }

    public static double area(double c, double h) {
        double s = (h*c)/2;
        return s;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(KAT_A);
        double a = scanner.nextDouble();

        System.out.print(KAT_B);
        double b = scanner.nextDouble();

        double c = hypotenuse(a, b);

        double p = perimeter(a, b, c);

        double h = high(a, b, c);

        double s = area(c, h);

        System.out.printf("Для прямоугольного треугольника с катетами A = %1$.3f и B = %2$.3f периметр P = %3$.3f и площадь S = %4$.3f", a, b, p, s);
    }
}

// периметр a+b+c = p
// s = 1/2bh
//данны длины катетов а и б
//нужно найти гипотенузу и высоту
//h = (ab)/c
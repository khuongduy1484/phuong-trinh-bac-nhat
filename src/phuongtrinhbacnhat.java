import java.util.Scanner;
public class phuongtrinhbacnhat {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" phương trình có dạng  a*x + b = c");
        System.out.println("Enter a : ");
        a = scanner.nextDouble();
        System.out.println("Enter b : ");
        b = scanner.nextDouble();
        System.out.println("Enter c : ");
        c = scanner.nextDouble();
        if (a == 0) {
            if (b == c) {
                System.out.println("luôn đúng");
            } else {
                System.out.println("vo ly");
            }
        }
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Nghiệm của phương trình = " + x);

        }
    }
}





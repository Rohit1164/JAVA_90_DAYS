// import java.util.Scanner;

public class HelloWorld {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // 1 quetions
        // System.out.println("Hello, World!");

        // 2 quetions
        // int num1 = 200;
        // int num2 = 100;
        // System.out.println(num1 + num2);

        // 3 quetions
        // Scanner reader = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = reader.nextInt();

        // if (num % 2 == 0) {
        // System.out.println(num + " is even");
        // } else {
        // System.out.println(num + " is odd");
        // }

        // 4 quetions
        // if (num > num2) {
        // System.out.println(" Largest Number");
        // } else if (num <= 50) {
        // System.out.println(" Low Number");
        // } else if (num < 100) {
        // System.out.println(" Medium Number");
        // } else {
        // System.out.println(" Invalide Number");
        // }

        // 5 quetions
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // 6 quetions
        // int sum = 0;
        // for (int i = 1; i <= 100; i++) {
        // sum += i;
        // System.out.println(sum);
        // }

        // 7 quetions
        // int num = 2;
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(num * i);
        // }

        // 8 quetions
        // double fahrenheit = (num * 9 / 5) + 32;
        // System.out.println(num + " Celsius = " + fahrenheit + " Fahrenheit");

        // 9 quetions
        int Rate = 2000;
        int Time = 365;
        int Percantage = 2;

        double timeInYears = Time / 365.0;

        double si = (Rate * Percantage * timeInYears) / 100;

        System.out.println(si);
    }
}

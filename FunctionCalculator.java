import java.util.Scanner;
import static java.lang.Math.*;


public class FunctionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        double result	= log(sin(x) + exp(x) * (sqrt(x) / PI));

        String message = "f(x) = " + result;

        System.out.println(message);

    }
}


//Ввод-вывод:
//  0,5      f(x) = -0.16190946372347814

//Enter x: 3,6
//f(x) = 3.0755135564879423

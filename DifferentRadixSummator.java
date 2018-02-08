import java.util.Scanner;

public class DifferentRadixSummator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter X in Bin: ");
        String X1 = scan.nextLine();
        int X = Integer.parseInt(X1, 2);
        System.out.print("Enter Y in Oct: ");
        String Y1 = scan.nextLine();
        int Y = Integer.parseInt(Y1, 8);
        System.out.print("Enter Z in Hex: ");
        String Z1 = scan.nextLine();
        int Z = Integer.parseInt(Z1, 16);

        int sum = X + Y + Z;

        System.out.println("X + Y + Z = " + sum);



    }
}


//Пример ввода:
// Enter X in Bin: 1011
// Enter Y in Oct: 73
// Enter Z in Hex: ABC
//
//Вывод:
//X + Y + Z = 2818

// Ввод-Вывод
//    Enter X in Bin: 10
//        Enter Y in Oct: 234
//        Enter Z in Hex: 02FA
//        X + Y + Z = 920
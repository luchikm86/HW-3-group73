import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "${name}";

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        String rename = str.replace("${name}", name);

        scanner.close();

        String message = "Hi, my name is " + rename;

        System.out.println(message);
    }

}


// Ввод - вывод:
//Enter name: Max
//        Hi, my name is Max
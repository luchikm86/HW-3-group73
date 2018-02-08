import java.util.Scanner;


public class SimpleAboutMeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.close();

        String message = "I’m " + name + " " + surname + ", " + age + " years old";

        System.out.println(message);
    }
}

// Ввод:
// John
// Smith
// 30

//Вывод:
// I’m John Smith, 30 years old
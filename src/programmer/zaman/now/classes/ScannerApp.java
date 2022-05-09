package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name : ");
        String name = scanner.nextLine();

        System.out.print("age : ");
        int age = scanner.nextInt();

        System.out.println("your name is " + name + " and your age is " + age);
    }
}

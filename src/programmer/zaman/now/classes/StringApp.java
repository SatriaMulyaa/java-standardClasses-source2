package programmer.zaman.now.classes;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {
        String name = "Satria Mulya BRO";
        String upperCase = name.toUpperCase();
        String lowerCase = name.toLowerCase();

        System.out.println(name);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(name.length());

        String[] names = name.split(" ");
        for(var values:names){
            System.out.println(values);
        }

        System.out.println(name.charAt(0));
        char[] chars = name.toCharArray();
        for(var value:chars){
            System.out.println(value);
        }
    }
}

package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("||","[","]");
        joiner.add("one");
        joiner.add("two");
        joiner.add("three");
        String value = joiner.toString();
        System.out.println(value);
        System.out.println(((Object)value).getClass().getSimpleName());

        String[] names = {"one","two","three"};
        for(var name: names){
            joiner.add(name);
        }
        System.out.println(joiner.toString());
        System.out.println(((Object)names).getClass().getSimpleName());
        System.out.println(((Object)joiner).getClass().getSimpleName());

    }
}

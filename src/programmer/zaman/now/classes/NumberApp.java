package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String example = "10000";
        Integer integerValue = Integer.valueOf(example);
        System.out.println(integerValue);

        String example2 = "1000.0";
        Double doubleValue2 = Double.valueOf(example2);
        System.out.println(doubleValue2);
    }
}

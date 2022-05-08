package programmer.zaman.now.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
       BigInteger bgA = new BigInteger("10000000000000000000");
       BigInteger bgB = new BigInteger("10000000000000000000");
       BigInteger bgc =  bgA.add(bgB);
        System.out.println(bgc);
    }
}

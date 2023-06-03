package E12ObjectAndClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class A03BigFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(read.readLine());
        BigInteger sum = BigInteger.valueOf(1);

        for (int i = 2; i <= number; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}

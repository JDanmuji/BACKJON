package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");

        BigInteger num1 = new BigInteger(num[0]);
        BigInteger num2 = new BigInteger(num[1]);

        System.out.println(num1.add(num2));


    }
}

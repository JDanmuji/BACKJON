package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class B_1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] numList = br.readLine().split(" ");

        int y = 0;
        int m = 0;

        for(int i = 0; i < num; i++) {
            y += Integer.parseInt(numList[i]) < 30 ? 10 : ((Integer.parseInt(numList[i])/30) * 10)+10;
            m += Integer.parseInt(numList[i]) < 60 ? 15 : ((Integer.parseInt(numList[i])/60) * 15)+15;

        }

        if(y > m) {
            System.out.println("M " + m);
        } else if( y < m ) {
            System.out.println("Y " + y);
        } else {
            System.out.println("Y M " + m);
        }

    }
}

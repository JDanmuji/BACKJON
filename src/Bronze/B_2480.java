package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dice = br.readLine().split(" ");
        int a = Integer.parseInt(dice[0]);
        int b = Integer.parseInt(dice[1]);
        int c = Integer.parseInt(dice[2]);

        if(a == b && b == c)
            System.out.print(10000 + a*1000);
        else if(a == b || a == c)
            System.out.print(1000 + a*100);
        else if(b == c)
            System.out.print(1000 + b*100);
        else
            System.out.print((Math.max(Math.max(a, b), c)*100));

    }

}

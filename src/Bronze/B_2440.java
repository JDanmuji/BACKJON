package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2440 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {

            for (int j = num; i <= j; j--) {
                System.out.print("*");
            }


            System.out.println();

        }
    }
}

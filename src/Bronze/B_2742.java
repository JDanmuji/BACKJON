package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2742 {


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());

            for (int i = num; 0 < i; i--) {
                System.out.println(i);
            }
        }

}

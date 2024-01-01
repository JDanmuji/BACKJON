package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10200 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());
            String findNum;
            int count = 0;


            String[] numList = br.readLine().split(" ");


            findNum = br.readLine();

            for(String j : numList) {
                if(j.equals(findNum)) {
                    count++;
                }
            }


            System.out.println(count);
        }

}

package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2442 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num; i++) {

            for(int j = 1; j <= num; j++) {

                if( j == (num-(2*i-1)/2)) {
                    for(int k = 1; k <= (2*i-1); k++) {
                        System.out.print("*");
                    }
                    // 대칭 뒤에 공백 안 생기게 해야됨 (오류 발생)
                } else if(j < (num-(2*i-1)/2)) {
                    System.out.print(" ");
                }


            }

            System.out.println();
        }
    }
}

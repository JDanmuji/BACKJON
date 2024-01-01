package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10101 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] triangle = new int[3];
        int count = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int sum = 0;

        for(int i = 0; i < triangle.length; i++) {
            triangle[i] = Integer.parseInt(br.readLine());

        }


        for(int num:triangle){

            if(count == 0) {
                num1 = num;
            }

            if(count == 1) {
                num2 = num;
            }

            if(count == 2) {
                num3 = num;
            }

            sum += num;
            count++;


        }


        if((num1 == num2 ) && (num2 == num3)) {
            System.out.println("Equilateral");
        } else if (sum == 180) {

            if(((num1 == num2 ) || (num2 == num3) || (num1 == num3))) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

        } else {
            System.out.println("Error");
        }


    }
}

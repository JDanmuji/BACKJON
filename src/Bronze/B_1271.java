package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_1271 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] numBox = br.readLine().split(" ");

            //  런타임 에러 발생(NumberFormatException)
            // 테스트 하던 과정 중 기존 정수형(int, long) 외에도 굉장히 큰 숫자가 들어간 것으로 추측
            // BigInteger 로 정수형 입력 받음
            BigInteger quotient = new BigInteger(numBox[0]);
            BigInteger remainder = new BigInteger(numBox[numBox.length-1]);

            System.out.println(quotient.divide(remainder));
            System.out.println(quotient.remainder(remainder));


        }
    }


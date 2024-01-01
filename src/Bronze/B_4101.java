package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_4101 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = 1;
            int num1 = 0;
            int num2 = 0;

            String numLine =  br.readLine();

            List<String> numList = new ArrayList<>();


            while (!numLine.substring(0, 1).equals("0")) {

                numList.add(numLine);
                numLine =  br.readLine();
            }



            for(String line:numList) {

                String[] numBox =line.split(" ");

                for(String num:numBox) {

                    if(count == 1) {
                        num1 = Integer.parseInt(num);
                    }

                    if(count == 2) {
                        num2 = Integer.parseInt(num);
                        System.out.println(num1 > num2 ? "Yes" : "No");
                        count = 1;
                        num1 = 0;
                        num2 = 0;
                        break;
                    }

                    count++;
                }
            }







        }

}

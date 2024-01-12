package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class B_1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
          int numList[] = new int[2]; 

        if (num >= 10) {
            numList[0] = num/10;
            numList[1] = num%10;  
           // int numList[] = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        } else {
            numList[0] = 0;
            numList[1] = num;  
        }
        //int numList1[] = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        //int numList2[] = new int[2];

        int temp = 0;
        String result = "0";
        int count = 0;
        boolean check = true;



        while(check) {

                
                temp = numList[0] + numList[1];
                result = Integer.toString(numList[1] >= 10 ? numList[1]%10 : numList[1]) +  Integer.toString(temp >= 10 ? temp%10 : temp); 
            
                numList[0] =  numList[1] >= 10 ? numList[1]%10 : numList[1];
                numList[1] =  temp > 10 ? temp%10 : temp;
        
                count++;

                
            if(Integer.parseInt(result) == num) {
                check = false;
            }

               
              
        }

        System.out.println(count);
    }
}

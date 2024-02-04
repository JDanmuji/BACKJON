import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int len = Integer.parseInt(br.readLine());
   //     int numList[] = new int[len];
        List<Integer> numList1 = new ArrayList<Integer>();

        for(int i = 0; i < len; i++) {
            numList1.add(Integer.parseInt(br.readLine()));
        }

        

        Collections.sort(numList1);

        for(int num : numList1) {
            System.out.println(num);
        }

        
    }



}
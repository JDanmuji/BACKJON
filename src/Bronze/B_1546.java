package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1546 {

     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count  = Integer.parseInt(br.readLine());
        int mList[] = new int[count];
        double result = 0.0;


        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            mList[i] = Integer.parseInt(st.nextToken());

        }

        int max = Arrays.stream(mList).max().getAsInt();
        
        for(int k = 0; k < count; k++) {
            
           result += ((double)  mList[k] / (double) max) * 100;
       //  System.out.println(((double)  mList[k] / (double) max) * 100);
        }

      System.out.printf("%.2f", result/(double) count );

  
    }
    
}

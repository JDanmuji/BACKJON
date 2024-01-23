package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_4344 {

      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        double countAvg[] = new double[count];
        StringTokenizer tk = new StringTokenizer("");
        
        //int testNum = 0;
        int sumCount = 0;
        int sum = 0;
        double result = 0.0;
        int check = 0;

       // double ratio = 0.0;

        for (int i = 0; i < count; i++) {
            tk = new StringTokenizer(br.readLine());
            
            sumCount = Integer.parseInt(tk.nextToken());
            int list[] = new int[sumCount];
            for (int j = 0; j < sumCount; j++) {
                list[j] = Integer.parseInt(tk.nextToken());      
            }

            for(int k : list) {
              //  System.out.println("k = "+ k);
                sum += k;
            }
           // System.out.println("sum = "+ sum);

            result = sum/ (double) sumCount;

         
          //  System.out.println("result = "+ result);

            for(int k : list) {
                if (result < k) {
                    check++;
                }
            }
        //    System.out.println("check = "+ check);
            result = ((100/(double) sumCount)* (double)check);
         //   System.out.println("result = "+ result);
            countAvg[i] = result;
            
            sum = 0;
            check = 0;
            result = 0.0;
        }
        
        
        for(double gg : countAvg ){
            System.out.printf("%.3f", gg);
            System.out.println("%");
            
        }
    }
    
}

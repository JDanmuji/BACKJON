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
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int countH = 0;
        int countW = 0;
        int resultH = 0;
        int resultW = 0;
        int result = 0;

        char[][] castle = new char[height][width];
                

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                castle[i][j] = (char) br.read();
            }
            br.readLine();
        }
       
        for(int i = 0; i < height; i++) {
            
            for(int j = 0; j < width; j++) {
               if (castle[i][j] == '.') {
                countW++;
               }
            }

            if (countW == width) {
                resultW++;
            }

            countW = 0;

        }


        
        for(int i = 0; i < width; i++) {
            
            for(int j = 0; j < height; j++) {
               if (castle[j][i] == '.') {
                    countH++;
               }
            }

            if (countH == width) {
                resultH++;
            }

            countH = 0;

        }
  

      
        System.out.println(resultW == resultH ? resultW : resultW + (resultW - resultH));
      
    }



}
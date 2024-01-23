package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2869 {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String numList[] = br.readLine().split(" ");
    
        int up = Integer.parseInt(numList[0]);
        int down = Integer.parseInt(numList[1]);
        int length = Integer.parseInt(numList[2]);
        
        // 높이에서 down 으로 기준으로 
        int day = (length - down) / (up - down);
        
        if((length - down)  % (up - down) != 0) day++;




        System.out.println(day);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Stream;

public class B_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String text = br.readLine();

        text = text.toUpperCase();
       // System.out.println(text);
        int count[] =  new int[26];
        int num = 0;
        int max = 0;
        //boolean check = false;
        int result = 0;

        for(int i = 0; i < text.length(); i++) {
            num = text.charAt(i) - 'A';
           
            count[num]++;
        }

        for(int j = 0; j < count.length; j++) {
            if(max < count[j]) {
                max = count[j];
                result =  j + 'A';
                
            } else if (max == count[j]){
                result = '?';
            }
        }
    
        System.out.println((char)result);
    }

}
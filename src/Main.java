import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String data = br.readLine();

        String numList[] = data.split(" ");

        int x = Integer.parseInt(numList[0]);
        int y = Integer.parseInt(numList[1]);
        int w = Integer.parseInt(numList[2]);
        int h = Integer.parseInt(numList[3]);


        int result1 =  Math.min((w-x), (h-y));
        int result2 =  Math.min((x-0), Math.min((y-0), Math.min((w-0), (h-0)));

        System.out.println(Math.min(result1, result2));

    }
}
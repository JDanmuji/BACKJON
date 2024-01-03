package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String data = br.readLine();

        String numList[] = data.split(" ");

        int x = Integer.parseInt(numList[0]);
        int y = Integer.parseInt(numList[1]);
        int w = Integer.parseInt(numList[2]);
        int h = Integer.parseInt(numList[3]);

        // 1 ≤ w, h ≤ 1,000
        //1 ≤ x ≤ w-1
        //1 ≤ y ≤ h-1
        //x, y, w, h는 정수
        int result1 =  Math.min((w-x), (h-y));
        int result2 =  Math.min((x-0), Math.min((y-0), Math.min((w-0), (h-0))));



        System.out.println(Math.min(result1, result2));

    }
}

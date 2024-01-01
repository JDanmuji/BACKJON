package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4999 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int je = br.readLine().replaceFirst(".$", "").length();
        int doctor = br.readLine().replaceFirst(".$", "").length();

        // 같은 경우도 생각
        System.out.println(je >= doctor ? "go" : "no");


    }
}

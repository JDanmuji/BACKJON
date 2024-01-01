package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_4470 {


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> contents = new ArrayList<>();
            int count = Integer.parseInt(br.readLine());
            for(int i = 0; i < count; i++) {
                String content = br.readLine();

                contents.add(content);
            }

            count = 1;

            for(String data:contents){

                System.out.println(count + ". " + data );
                count++;

            }




        }

}

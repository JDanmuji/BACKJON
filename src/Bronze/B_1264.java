package Bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_1264 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String line; // 한 줄씩 입력받을 임시 변수
        int count = 0;
        String[] textToTextArray;
        List<String> newList = new ArrayList<>();

        while (scanner.hasNextLine()) { // 입력이 더 존재하는 동안

            line = scanner.nextLine();
            if (line.equals("#")) { // 마지막 입력
                break;
            }
            newList.add(line.toLowerCase()); // 한 줄씩 입력 받음


        }



        for (String text : newList) {

            textToTextArray = text.split("");

            for(String data : textToTextArray) {

                count = ( data.equals("a") || data.equals("e") || data.equals("i") || data.equals("o") || data.equals("u") ) ? count + 1 : count;
            }

            System.out.println(count);
            count = 0;
        }


    }
}

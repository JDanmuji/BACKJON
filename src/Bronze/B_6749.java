package Bronze;

import java.util.Scanner;

public class B_6749 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line; // 한 줄씩 입력받을 임시 변수
        int count = 1;

        int[] ageList = new int[2];


        while (scanner.hasNextLine()) { // 입력이 더 존재하는 동안

            line = scanner.nextLine();

            if (count == 1) ageList[0] = Integer.parseInt(line);
            if (count == 2) ageList[1] = Integer.parseInt(line);


            count++;

            if(count == 3) break;


        }


        int num = ageList[1] - ageList[0];
        System.out.println(ageList[1] + num);



    }

}

package Bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_2083 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String info = null;
        String junior = "Junior";
        String senior = "Senior";
        String className = null;
        String name = null;

        List<String[]> newList = new ArrayList<>();


        while (scanner.hasNextLine()) { // 입력이 더 존재하는 동안

            info = scanner.nextLine();
            if (info.contains("#")) { // 마지막 입력
                break;
            }

            String[] lineInfo = info.split(" ");
            newList.add(lineInfo); // 한 줄씩 입력 받음


        }

        for (String[] line : newList) {


            name = line[0];

            className = ((Integer.parseInt(line[1]) < 18) && (Integer.parseInt(line[2]) < 80)) ? junior : senior;




            System.out.println(name + " " +  className);


        }

    }

}

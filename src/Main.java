import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String info;


        List<String[]> newList = new ArrayList<>();


        while (scanner.hasNextLine()) { // 입력이 더 존재하는 동안

            info = scanner.nextLine();
            if (info.contains("#")) { // 마지막 입력
                break;
            }

            String[] lineInfo = info.split(" ");
            newList.add(lineInfo); // 한 줄씩 입력 받음


        }

        for(Object object : newList) {
            String element = (String) object;
            System.out.println(element);
        }

    }
}
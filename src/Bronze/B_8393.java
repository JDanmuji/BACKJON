package Bronze;

import java.util.Scanner;

public class B_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++) {
            count+=i;
        }

        System.out.println(count);
    }
}

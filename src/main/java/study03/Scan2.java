package study03;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 문장이랑 숫자를 각각 입력 받는 방법
        String name = scan.nextLine();
        int age = scan.nextInt();

        System.out.println("이름 " + name);
        System.out.println("나이 " + age);
    }
}

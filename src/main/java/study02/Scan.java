package study02;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        // 입력받을 스캐너를 만든다. new : 새로운, System in : 시스템 안으로 데이터를 입력 받는다
        Scanner scan = new Scanner(System.in);

        // String : 문장이라는 뜻
        // str : 입력받은 '문장의 이름'
        // tony.nextLine() : 한 줄을 입력 받는다
        String str = scan.nextLine();

        // str 을 출력한다
        System.out.println(str);
    }
}

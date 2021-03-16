package study01;

public class Hello {

    public static void main(String[] args) {

        // 컴퓨터는 큰 따옴표(")가 있으면 '문장' 이라고 생각한다
        // 큰 따옴표가(")가 없으면 숫자라고 생각한다
        //숫자에도 종류가 있다. ( 정수, 실수, 음수)
        System.out.println(-100);

        // 컴퓨터는 문장이랑 문자를 구별한다. 작은 따옴표 (') 문자, 큰 따옴표 (") 문장
        System.out.println('C');

        // 특수 문자는 역슬래시(\)를 사용한다. 큰 따옴표 : \"
        // \n을 사용하면 엔터를 칠 수 있다.
        // \t : 탭, \b는 : 백스페이스
        System.out.println(" \" ");

    }
}

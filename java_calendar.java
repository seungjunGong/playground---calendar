import java.util.Scanner;

public class java_calendar {
    public static void main(String[] args) {
        // System.out.println("일 월 화 수 목 금 토");
        // System.out.println("--------------------");
        // System.out.println(" 1  2  3  4  5  6  7");
        // System.out.println(" 8  9 10 11 12 13 14");
        // System.out.println("15 16 17 18 19 20 21");
        // System.out.println("22 23 24 25 26 27 28");
        System.out.println("두 수를 입력하세요. ");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        String[] num = number.split(" ");

        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        int add = num1 + num2;
        System.out.println("두 수의 합은 " + add + "입니다.");
        scan.close();
    }
    
}

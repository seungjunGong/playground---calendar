import java.util.Scanner;

public class java_calendar {
    public static void main(String[] args) {
        System.out.println("반복횟수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        System.out.println("월을 입력하세요.");
        int[] num = new int[count];
        for(int i = 0; i < count; i++){
            num[i] = scan.nextInt();
        }
        for(int k =0; k < count; k++){
            System.out.println(num[k] + "은" + Monthdate.date(num[k]) + "까지 있습니다.");
        }
        Printsamplecalendar.printcalender();
        
        scan.close();
    }
    
}

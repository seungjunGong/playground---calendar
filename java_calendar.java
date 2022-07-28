import java.util.Scanner;

public class java_calendar {
    public static void main(String[] args) {
        System.out.println("반복횟수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        String  PROMPT= ">";
        
        for(int i = 0; i < count; i++){
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            int num = scan.nextInt();
            if(num == -1){
                break;
            }
            System.out.println(num + "은" + Monthdate.date(num) + "까지 있습니다.");
        }
        System.out.println("Have a nice day!");
        Printsamplecalendar.printcalender();
        
        scan.close();
    }
    
}

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("년도를 입력하세요.(exit -1)");
            System.out.print("YEAR> ");
            int year = scan.nextInt();
            if(year == -1){
                System.out.println("bye~");
                break;
            }
            System.out.println("달을 입력하세요.");
            System.out.print("MONTH> ");
            int month = scan.nextInt();

            if(month > 12 || month < 1){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            scan.nextLine();
            System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
            System.out.print("WEEKDAY> ");
            String weekday = scan.nextLine();
        
            Printcalendar.print(year, month, weekday);
        }
        scan.close();
    }   
}

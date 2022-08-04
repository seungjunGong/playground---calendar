import java.util.Scanner;

public class Calendar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("년도를 입력하세요.");
        System.out.print("YEAR> ");
        int year = scan.nextInt();
       
        System.out.println("달을 입력하세요.");
        System.out.print("MONTH> ");
        int month = scan.nextInt();
      
        scan.nextLine();
        System.out.println("첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)");
        System.out.print("WEEKDAY> ");
        String weekday = scan.nextLine();

        Printcalendar.print(year, month, weekday);

        
        

        scan.close();
    }
}

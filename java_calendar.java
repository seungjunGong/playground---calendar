import java.util.Scanner;

public class java_calendar {
    public static void main(String[] args) {
        String  PROMPT= ">";
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("년을 입력하세요.");
            System.out.print(PROMPT);
            int year = scan.nextInt();
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            int month = scan.nextInt();
            
            if(month == -1){
                break;
            }
            Printcalendar.printcalender(year, month);
        }
        System.out.println("Bye~");
        
        scan.close();
    }
    
}

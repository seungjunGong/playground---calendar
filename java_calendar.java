import java.util.Scanner;

public class java_calendar {
    public static void main(String[] args) {
        String  PROMPT= ">";
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            int num = scan.nextInt();
            Printsamplecalendar.printcalender(num);
            if(num == -1){
                break;
            }
        }
        System.out.println("Bye~");
        
        scan.close();
    }
    
}

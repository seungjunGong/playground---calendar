public class Printcalendar {
    public static void printcalender(int year, int month){
        
        System.out.println("일 월 화 수 목 금 토 일");
        System.out.println("--------------------");
        System.out.printf("    <<%4d년%3d월>>\n", year, month);
        for(int i = 1; i <= Monthdate.date(month); i++){
            System.out.printf("%3d", i);
            if(i % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }     
}

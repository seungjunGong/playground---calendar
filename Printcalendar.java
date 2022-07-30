public class Printcalendar {
    public static void printcalender(int year, int month){
        
        System.out.println("일 월 화 수 목 금 토 일");
        System.out.println("--------------------");
        System.out.printf("    <<%4d년%3d월>>\n", year, month);
        if(year % 4 == 0 || year % 400 == 0){
            if(month == 2){
                month = 13;
            }
        }
        for(int i = 1; i <= Monthdate.date(month); i++){
            System.out.printf("%3d", i);
            if(i % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }     
}

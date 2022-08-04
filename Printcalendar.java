public class Printcalendar {
    public static void print(int year, int month, String weekday){
        String[] day = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
        int blank = 0;
        System.out.printf("    <<%4d넌 %d월>>\n", year, month);
        System.out.printf(" SU MO TU WE TH FR SA\n");
        System.out.println("----------------------");
        for(int i=0; i<7;i++){
            if(weekday.equals(day[i])){
                blank = i;
            }
        }
        //print blank space
        for(int i=0; i < blank; i++){
            System.out.print("   ");
        }
        //print first line
        int count = 7 - blank;
        for(int i=1; i <= count; i++){
            System.out.printf("%3d", i);
        }
        System.out.println();
        
        //print from second line to last
        for(int i = (8-blank); i <= Monthdate.date(year, month); i++){
                System.out.printf("%3d", i);
                if((i-count) % 7 == 0){
                    System.out.println();
                }
        }
        System.out.println();
        System.out.println();
    }
}
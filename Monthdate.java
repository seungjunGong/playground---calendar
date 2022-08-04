public class Monthdate {
    public static int date(int year, int month){
        int[] monthdata = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            monthdata[1] = 29;
        }
        return monthdata[month-1];
    }
    
}

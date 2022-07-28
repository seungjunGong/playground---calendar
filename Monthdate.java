public class Monthdate {
    public static int date(int d){
        int day = 0;
        int[] maxday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 0; i < 12; i++){
            if(d == (i+1)){
                day = maxday[i];
            }
        }
        return day;
    }
}

public class Monthdate {
    public static int date(int d){
        int day = 0;
        if(d == 1){
            day = 31;
        }
        else if(d == 2){
            day = 28;
        }
        else if(d == 2){
            day = 28;
        }
        else if(d == 3){
            day =31;
        }
        else if(d == 5){
            day =31;
        }
        else if(d == 6){
            day =30;
        }
        else if(d == 7){
            day =31;
        }
        else if(d == 8){
            day =31;
        }
        else if(d == 9){
            day =30;
        }
        else if(d == 10){
            day =31;
        }
        else if(d == 11){
            day =30;
        }
        else if(d == 12){
            day = 31;
        }
        else {day = 0;}
        return day;
    }
}

package Obj.Nature;

import java.lang.Math;


public class Time {

    private static int hour = (int) (Math.random() * 24);

    private static String time = ((0 <= hour) && (hour <= 9)) || ((21 <= hour) && (hour <= 23)) ? "night" : "day";

    public static class timeOptions{

        @Override
        public String toString() {
            return "За бортом " + hour + ":00";
        }
        public void changeTime(int t){
            hour = t;
        }
        public boolean isNight(){
            if(time == "night")
                return true;
            else
                return false;
        }
    }
}


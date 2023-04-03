package com.codewars.sample;

public class HumanReadableTime {
    public static String makeReadable(int inputSeconds) {

        int seconds = 0;
        int minutes= 0;
        int hours= 0;

        if(inputSeconds > 3600 ){
             hours =inputSeconds/3600 ;
            inputSeconds  =inputSeconds%3600 ;
        }
        if(inputSeconds <= 3599 && inputSeconds >= 59){

            minutes =inputSeconds/60 ;
            inputSeconds  =inputSeconds%60 ;
        }
        if( inputSeconds <= 59){
            seconds = Math.max(inputSeconds, 0);
        }
        return String.format("%02d:%02d:%02d", hours,minutes,seconds);
    }
}

import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = 0;
        for(int i = 1; i<a ; i++){
            if(i==2){
                day+=29;
            }else{
                if(i<=7){
                    if(i%2==0){
                        day+=30;
                    }else{
                        day+=31;
                    }
                }else{
                    if(i%2 == 0){
                        day+=31;
                    }else{
                        day+=30;
                    }
                }
            }
        }
        day += b;
        switch(day % 7){
            case 1:
                answer ="FRI";
                break;
            case 2:
                answer="SAT";
                break;
            case 3:
                answer="SUN";
                break;
            case 4:
                answer="MON";
                break;
            case 5:
                answer="TUE";
                break;
            case 6:
                answer="WED";
                break;
            case 0:
                answer="THU";
                break;
        }
        return answer;
    }
}
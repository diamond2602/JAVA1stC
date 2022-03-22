package loops.forloop;

public class DigitalClock {
    public static void main(String[] args) {
        //print hours and minutes for 12 hours of a day
        //ex. 0:0 0:1 ... 0:59 1:0 1:1 1:2 ....... 11:59


        OUTER:
        for (int hour=0; hour<12; hour++) {
         inner:
            for (int min=0; min<=59; min++){

               if(min>=10&&min <=12){continue;}

                if (min>=30) {
                    break OUTER;}
                for (int seconds=0; seconds<=59; seconds++){
                   System.out.println(hour+":" +min +":" +seconds);
                   if (seconds==10)
                   break;
                  }
            }
        }





    }
}

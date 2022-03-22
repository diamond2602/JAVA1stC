package loops.forloop;

public class MonthoOfYear {
    public static void main(String[] args) {
        /*
        print out months for the years between 2020 to 2023
        2020 --> 1,2,3...12
         */

        for (int year=2020; year<=2023; year++) {
            System.out.println(year);
            for (int month = 1; month <= 12; month++) {
                System.out.print(month+" ");
                switch (month){
                    case 1:
                        System.out.println("jan");
                        for (int m=1; m<30; m++){
                            System.out.print(m+ " ");
                        }System.out.println();
                        break;

                    case 2:
                        System.out.println("feb");
                        break;
                    case 3:
                        System.out.println("mar");
                        break;
                    case 4:
                        System.out.println("apr");
                        break;
                    case 5:
                        System.out.println("may");
                        break;
                    case 6:
                        System.out.println("jun");
                        break;
                    case 7:
                        System.out.println("jul");
                        break;
                    case 8:
                        System.out.println("aug");
                        break;

                    case 9:
                        System.out.println("sep");
                        break;
                    case 10:
                        System.out.println("oct");
                        break;
                    case 11:
                        System.out.println("nov");
                        break;
                    case 12:
                        System.out.println("dec");
                        break;

                }


            }
            System.out.println();
        }
    }
}

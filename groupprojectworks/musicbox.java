package groupprojectworks;
import java.util.Locale;
import java.util.Scanner;
public class musicbox {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner second = new Scanner(System.in);

      System.out.println("Please enter type of music: + Pop / Country / Classical" );
        String userChoice = input.next().toLowerCase();
        String pop = "Pop";
        String country = "Country";
        String classical = "Classical";
int pop$=4;


        if(userChoice.equalsIgnoreCase(pop)) {

            System.out.println("Which song would you like to listen: + Bad Guy / Talk / Please me / 7 Ring / Without Me ");

            String userChoiceSong = second.nextLine().toLowerCase();

            String song1 = "Bad Guy";
            String song2 = "Talk";
            String song3 = "Please Me";
            String song4 = "7 Ring";
            String song5 = "Without Me";


            if (userChoiceSong.equalsIgnoreCase(song1) || userChoiceSong.equalsIgnoreCase(song2) || userChoiceSong.equalsIgnoreCase(song3) ||
                    userChoiceSong.equalsIgnoreCase(song4) || userChoiceSong.equalsIgnoreCase(song5))  {

                System.out.println("please enter the " + pop$ + "$ for this song");
                int usermoney=second.nextInt();
                 if (usermoney==4&&userChoiceSong.equalsIgnoreCase(song1)){
                     System.out.println("song " +song1 + " is playing now");
                 }

            }else{
                System.out.println("sorry, we don't have this song");
            }
        }










    }




}
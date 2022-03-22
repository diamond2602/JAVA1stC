package groupprojectworks;
import java.util.Scanner;
public class musicboxmustafa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner second = new Scanner(System.in);

        System.out.println("Please enter type of music: + Pop / Country / Classical");
        String userChoice = input.next().toLowerCase();
        String pop = "Pop";
        String country = "Country";
        String classical = "Classical";
        int popCost = 4;
        int countryCost = 3;
        int classicalCost = 2;


        if (!userChoice.equals("pop") && !userChoice.equals("country") && !userChoice.equals("classical")) {


            System.out.println(userChoice + " music category is not available");
        }


        if (userChoice.equalsIgnoreCase(pop)) {

            System.out.println("Which song would you like to listen: + Bad Guy / Talk / Please me / 7 Ring / Without Me ");

            String userChoiceSong = second.nextLine().toLowerCase();

            String song1 = "Bad Guy";
            String song2 = "Talk";
            String song3 = "Please Me";
            String song4 = "7 Ring";
            String song5 = "Without Me";


            if (userChoiceSong.equalsIgnoreCase(song1) || userChoiceSong.equalsIgnoreCase(song2) || userChoiceSong.equalsIgnoreCase(song3) ||
                    userChoiceSong.equalsIgnoreCase(song4) || userChoiceSong.equalsIgnoreCase(song5)) {

                System.out.println(userChoiceSong.toUpperCase());
                System.out.println("PLease enter " + popCost + " dollar to listen your song");
                int popCostEnter = input.nextInt();


                while (popCostEnter < popCost) {
                    System.out.println("you are short");
                    System.out.println("Please enter " + (popCost - popCostEnter) + " more dollar to listen");
                    System.out.println("How much money you want to add?");
                    popCostEnter += input.nextInt();
                }


                for (int i = 0; popCostEnter < popCost; i++) {
                    System.out.println(popCostEnter + " is not enough, please try again");


                }
                if (popCostEnter > popCost) {

                    System.out.println("You have entered " + (popCostEnter - popCost) + " dollar more. Please wait for the change");
                    System.out.println(userChoiceSong + " is playing.Enjoy with the song");
                } else {

                    System.out.println(userChoiceSong + " is playing.Enjoy with the song");
                }


            } else {

                System.out.println(userChoiceSong + " is not available");


            }

        }


        if (userChoice.equalsIgnoreCase(country)) {

            System.out.println("Which song would you like to listen: + Meant to Be / Haven / Simple / One Number Away / Get Along ");

            String userChoiceSong = second.nextLine().toLowerCase();

            String countrySong1 = "Meant to Be";
            String countrySong2 = "Haven";
            String countrySong3 = "Simple";
            String countrySong4 = "One NUmber Away";
            String countrySong5 = "Get Along";


            if (userChoiceSong.equalsIgnoreCase(countrySong1) || userChoiceSong.equalsIgnoreCase(countrySong2) || userChoiceSong.equalsIgnoreCase(countrySong3) ||
                    userChoiceSong.equalsIgnoreCase(countrySong4) || userChoiceSong.equalsIgnoreCase(countrySong5)) {

                System.out.println(userChoiceSong.toUpperCase());
                System.out.println("PLease enter " + countryCost + " dollar to listen your song");
                int countryCostEnter = input.nextInt();


                while (countryCostEnter < countryCost) {
                    System.out.println("you are short");
                    System.out.println("Please enter " + (countryCost - countryCostEnter) + " more dollar to listen");
                    System.out.println("How much money you want to add?");
                    countryCostEnter += input.nextInt();
                }


                for (int i = 0; countryCostEnter < countryCost; i++) {
                    System.out.println(countryCost + " is not enough, please try again");


                }
                if (countryCostEnter> countryCost) {

                    System.out.println("You have entered " + (countryCostEnter - countryCost) + " dollar more. Please wait for the change");
                    System.out.println(userChoiceSong + " is playing.Enjoy with the song");
                } else {

                    System.out.println(userChoiceSong + " is playing.Enjoy with the song");
                }

            }


            else {

                System.out.println(userChoiceSong + " is not available");



            }


        }

        if (userChoice.equalsIgnoreCase(classical)) {

            System.out.println("Which song would you like to listen: + Four Seasons / Fur Elise / Finlandia / Vocalise / The Planets ");

            String userChoiceSong = second.nextLine().toLowerCase();

            String classicalSong1 = "Four Seasons";
            String classicalSong2 = "Fur Elise";
            String classicalSong3 = "Finlandia";
            String classicalSong4 = "Vocalise";
            String classicalSong5= "The Planets";


            if (userChoiceSong.equalsIgnoreCase(classicalSong1) || userChoiceSong.equalsIgnoreCase(classicalSong2) || userChoiceSong.equalsIgnoreCase(classicalSong3) ||
                    userChoiceSong.equalsIgnoreCase(classicalSong4) || userChoiceSong.equalsIgnoreCase(classicalSong5)) {

                System.out.println(userChoiceSong.toUpperCase());
                System.out.println("PLease enter " + classicalCost + " dollar to listen your song");
                int classicalCostENter = input.nextInt();


                while (classicalCostENter < classicalCost) {
                    System.out.println("you are short");
                    System.out.println("Please enter " + (classicalCostENter- classicalCost) + " more dollar to listen");
                    System.out.println("How much money you want to add?");
                    classicalCostENter += input.nextInt();
                }


                for (int i = 0; classicalCostENter < classicalCost; i++) {
                    System.out.println(countryCost + " is not enough, please try again");


                }
                if (classicalCostENter> classicalCost) {

                    System.out.println("You have entered " + (classicalCostENter - classicalCost) + " dollar more. Please wait for the change");
                    System.out.println(userChoiceSong + " is playing.Enjoy with the song");
                } else {

                    System.out.println(userChoiceSong + " is playing.Enjoy with the song");
                }

            }


            else {

                System.out.println(userChoiceSong + " is not available");



            }


        }



    }



}
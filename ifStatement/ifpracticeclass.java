package ifStatement;

public class ifpracticeclass {
    public static void main(String[] args) {
        int applnumber=5;
        int orangenumber=10;
        // ==, >, <, !=, <=, >=


            System.out.println("I am about to create and IF block");
        if (applnumber==orangenumber){
            System.out.println("I am so lucky today!");
        }
        if (applnumber!=orangenumber){
            System.out.println("I so HAPPY today");
        }
        if (applnumber<=orangenumber){
            int sum=applnumber+orangenumber;
            System.out.println("you have " + sum+ " fruits");
        }

        System.out.println("so far so good");
        if (orangenumber<applnumber){
            System.out.println(orangenumber*applnumber + " is in the the false conditional block. That is why it will not show on the console");
        }



    }

}

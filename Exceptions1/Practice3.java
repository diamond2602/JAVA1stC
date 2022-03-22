package Exceptions1;

public class Practice3 {
    public static void main(String[] args) {
        // throw==used to create a new exception

       double myMoney= 100;
       double costOfItem$=200;

       if(myMoney>costOfItem$){
           throw new NullPointerException();
       }

      // myMethod();
    }

   // static void myMethod(){
   //     System.out.println("this is my method to blow up memory");
   //     myMethod();
  //  }
}

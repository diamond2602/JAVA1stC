package OOP.FinalPractice;

/*or here'final' */public final class TShirt extends Shirt{

    String name="HHHH";
    //   public void wash(){  --> you can not override Final method

  //      System.out.println("You can wash this TShirt");
  //  }


    @Override
    public boolean fit(char size) {
        return true;
    }
}

package OOP.Inheritance2_withStaticMethods;

public class Notebook extends Book{

   int numberOfPages;

    public static int getNumberOfPages() {
        return 500;
    }

    public static void main(String[] args) {
        Book book= new Book();
        System.out.println(book.getNumberOfPages());//404

        Notebook notebook=new Notebook();
        System.out.println(notebook.getNumberOfPages());//500

    }
}



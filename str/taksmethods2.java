package str;

public class taksmethods2 {
    public static void main(String[] args) {
        /*===Task==
String str = " Zero to Ten  ";
- change 'Ten' with/to 'HERO'
- make all of the string uppercase
- remove all spaces
- get only first three letter
- print the length of those three letters as ==> "The length of final version is: +  <length>"*/

        String str = " Zero to Ten  ";
         str=str.replace("Ten", "HERO");
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
        str=str.trim();
        System.out.println(str);
        str=str.replace(" ", "");
        System.out.println(str);
        str=str.substring(0, 3);
        System.out.println(str);
        int x=str.length();
        System.out.println("The length of final version is: " +x);
// method chaingin ---> you can use method after method

        str=" Zero to Ten";
        int a=str.replace("Ten", "HERO").toUpperCase().trim().replace(" ","").substring(0,3).length();
        System.out.println(a);
//chaining



    }
}

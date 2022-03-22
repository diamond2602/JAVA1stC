package str;

public class methods6 {
    public static void main(String[] args) {
        String name="   Techtorial Academy  is located in Des Plaines  ";
        //trim() --> it will remove spaces before and after string
        String updatedname=name.trim();
        System.out.println(updatedname);
        System.out.println(name);

        //subString()

       String part1= updatedname.substring(4);
        System.out.println(part1);
        String part2=updatedname.substring(4,12);// char  at eh first index is included but character
        // athe second index is not included ion the substring
        System.out.println(part2);
    }
}

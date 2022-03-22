package str;

public class methods3 {
    public static void main(String[] args) {
        String brand="Nike";
        boolean bl1=brand.startsWith("N");//true
        System.out.println(bl1);
        boolean bl2=brand.startsWith("n");
        System.out.println(bl2);

        System.out.println(brand.startsWith("Nike"));//true

        System.out.println(brand.startsWith("nike"));

        System.out.println(brand.endsWith("e"));
        System.out.println(brand.endsWith("Nike"));
        System.out.println(brand.endsWith("u"));
        System.out.println(brand.endsWith("nike"));



    }
}

package str;

public class methods5 {

    public static void main(String[] args) {
        String word="Sunday";
        // replace()
        String updatedword=word.replace('a', '$');
        System.out.println(updatedword);
        String updatedword1=word.replace("Sun", "Satur");
        System.out.println(updatedword1);
        System.out.println(word.replace("day", "*"));

        System.out.println(word.replace("sun", "Satur"));

        String code="Java";
        System.out.println(code.replace('e', '%'));



    }
}

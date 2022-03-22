package primitives;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;




public class remainderpractice2 {

    public static void main(String[]args){

    // find product of digits from given number
    // 456  --> 4*5*6 = 120 sout("the product is = " +<product>

    int mynumber = 456;
    int digit3 = mynumber % 10;
    mynumber=mynumber/10;
    int digit2 = mynumber % 10;
    mynumber=mynumber/10;
    int digit1 = mynumber % 10;

        System.out.println("the product is =" + (digit1 * digit2*digit3));
       int product = digit1*digit2*digit3;
        System.out.println("the proucts is ==" +product);
}
}
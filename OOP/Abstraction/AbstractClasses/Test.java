package OOP.Abstraction.AbstractClasses;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
       // Student student = new Student("vv", 45); you can not instantiate(create) object from Abstract class

        Map map = new LinkedHashMap();
        Student student= new OnlineStudent();
      //  Student student1=new CampusStudent(); you can not instantiate(create) object from Abstract class
        OnlineStudent student1=new OnlineStudent();
JrJoe jrJoe= new JrJoe();
        jrJoe.attend();

    }
}

package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfo {



    /*
    StudentInfo
-------------
FirstName: David
LastName: Pena
Age: 25
Gender: M
City: Chicago
FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: HighPark
FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka
FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago
     */


    public static void main(String[] args) {
        HashMap <String, String> student1= new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");

        HashMap <String, String> student2= new HashMap<>();
        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "Niles");

        HashMap <String, String> student3= new HashMap<>();
        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        HashMap <String, String> student4= new HashMap<>();
        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        List <HashMap<String, String>> studentlist= new ArrayList<>();
        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);

        studentlist.set(1, student1);

        System.out.println(studentlist);

        HashMap<String,HashMap<String, String>> map= new HashMap<>();

        // from the list find all students who are  living in Chicago

        for (HashMap <String, String> studentInfoMap: studentlist){
            if (studentInfoMap.get("City").equals("Chicago")){
                System.out.println(studentInfoMap.get("FirstName")+ " is living in Chicago");
            }
        }
        printStudentInfo(studentlist);
    }
    public static void printStudentInfo(List<HashMap<String, String>> list){
        for ( HashMap <String, String> studentInfoMap: list){
            if (studentInfoMap.get("City").equals("Chicago")){
                System.out.println(studentInfoMap.get("FirstName" )+" is living in Chicago");
            }
        }
    }
}
package Array;

import java.util.*;

public class Person {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ashwani");
        al.add("Aman");
        al.add("Ankit");
        al.add("Sameer");
        al.add("Sidharth");
        al.add("Anuj");
        al.add("Umesh");
        al.add("Deepak");
        al.add("Deepanshu");
        al.add("Deevesh");
        for(String s:al) {
            System.out.println("The Name of Persons are: "+s);
        }
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        String StuName, ClassNo;
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name");
        StuName = sc.nextLine();
        System.out.println("Enter Class Number");
        ClassNo = sc.nextLine();
        System.out.println("Enter age");
        age = sc.nextInt();

        System.out.println("Your Data");
        System.out.println("Student Name\t:" + StuName);
        System.out.println("Class Number\t:" + ClassNo);
        System.out.println("Age\t:" +age);
    }
}
        
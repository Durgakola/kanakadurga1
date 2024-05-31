package education;

import java.util.Date;

public class StudentTest {
    public static void main(String[] args) {
//        Student student1=new Student();
//        student1.name="kanakadurga";
//        student1.dob=new Date(24-05-2000);
//        student1.phoneNumber="9391976191";
//        student1.pincode="522409";
//        student1.street="kphbcolony 5th phase";
//        student1.city="hydarabad";
//        student1.flatNo="345-78";
//        student1.fatherName="dileep chakravarthi";
//
//        Student student2=new Student();
//        student2.name="saraswathi";
//        student2.dob=new Date(2-04-2002);
//        student2.phoneNumber="7032941921";
//        student2.pincode="522409";
//        student2.street="kphb 2nd phase";
//        student2.city="hydarabad";
//        student2.flatNo="300-43";
//        student2.fatherName="dileep chakravarthi";
        String s1="A";
        String s2="B";
        String s3=new String();


        Student arunStudent=new Student();
        
        Student rakeshStudent=new Student();
        arunStudent.name="Arun";
        rakeshStudent.name="Rakesh";

        arunStudent.schoolName="DPS";


        System.out.println("Arun Student "+arunStudent.schoolName);
        System.out.println(" rakeshStudent Student "+rakeshStudent.schoolName);

        System.out.println("Arun Student "+arunStudent.name);
        System.out.println(" rakeshStudent Student "+rakeshStudent.name);


    }
}

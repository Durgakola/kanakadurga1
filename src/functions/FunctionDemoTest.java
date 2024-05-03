package functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemoTest {

   BiFunction<String,String,String> concatFunction= (firstName,lastName) ->{
       String fullName=firstName+lastName;
       System.out.println(" Name "+fullName);
       return fullName;

    };

    public String concatName(String firstName,String lastName) {
        String fullName=firstName+lastName;
        System.out.println(" Name "+fullName);
        return fullName;
    }

//    BiFunction<String,String,Integer> countFunction=
//            (firstName,lastName) ->{
//        String fullName=firstName+lastName;
//        System.out.println(" Name "+fullName);
//
//        return fullName.length();
//
//    };

    BiFunction<String,String,Integer> countFunction=
            (firstName,lastName) ->{
                String fullName=firstName+lastName;
                int firstNamelength=firstName.length();
                int lastNamelength=lastName.length();
                System.out.println(" Name "+fullName);

                return firstNamelength+lastNamelength;

            };


    Function<String,String> toUpperFunc=(fullName) ->{
        return fullName.toUpperCase();
    };

    public static void main(String[] args) {

        FunctionDemoTest demoTest=new FunctionDemoTest();
        demoTest.concatName("Neoteric","Method");

        demoTest.concatFunction.apply("Neoteric","Method");

       int length= demoTest.countFunction.apply("Neoteric","Method");
        System.out.println("Length "+length);

        String outputName= demoTest.toUpperFunc.apply("Neoteric");
        System.out.println("Function :"+outputName);



    }
}

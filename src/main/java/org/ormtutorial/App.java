package org.ormtutorial;

import org.ormtutorial.dto.StudentDto;
import org.ormtutorial.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        StudentDto studentDto = ctx.getBean("studentDto", StudentDto.class);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go){
            System.out.println("PRESS 1 to add new student data");
            System.out.println("PRESS 2 to get single student data");
            System.out.println("PRESS 3 to get All students data");
            System.out.println("PRESS 4 to update the student data");
            System.out.println("PRESS 5 to delete the student data");
            System.out.println("PRESS 6 to Exit the ");
            try {
                int input = Integer.parseInt(br.readLine());
                switch (input){
                    case 1:
                        // add new student data
                        System.out.println("Enter the student Id : ");
                        int sId = Integer.parseInt(br.readLine());

                        System.out.println("Enter the student Name : ");
                        String sName = br.readLine();

                        System.out.println("Enter the student city : ");
                        String sCity = br.readLine();

                        System.out.println("Enter the student standards : ");
                        int sStd = Integer.parseInt(br.readLine());

                        Student student = new Student();
                        student.setStudentId(sId);
                        student.setStudentName(sName);
                        student.setStudentCity(sCity);
                        student.setStudentStd(sStd);
                        int r = studentDto.insert(student);
                        System.out.println("Data is inserted successfully " + r);
                        break;
                    case 2:
                        // get single student data
                        break;
                    case 3:
                        // get All students data
                        break;
                    case 4:
                        // update the student data
                        break;
                    case 5:
                        // delete the student data

                        break;
                    case 6:
                        go= false;
                        break;
                }
            }catch (Exception e){
                System.out.println("Invalid Input : try with another value !!");
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Thank you for using my application");
        System.out.println("See you very soon");
    }
}

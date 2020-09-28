package student;

import java.util.Scanner;

public class StudentInterFace {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);

        String name;
        int score;

        while (true) {
            //Input first Studnet's data
            System.out.print("Enter name for first student (min 1 letter) ");
            name = scan.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s --> ", i, stu1.getName());
                score = scan.nextInt();
                stu1.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                scan.nextLine();
            }
        }
        scan.nextLine(); //clear scanner buffer
        System.out.println("\n-----------------------\n");
        while (true) {
            //input the second student's data
            //Input the first student's data
            {
                System.out.println("Enter name for second student: ");
            }
            name = scan.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s --> ", i, stu2.getName());
                score = scan.nextInt();
                stu2.setScore(i, score);
            }
            String errormsg = stu2.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                scan.nextLine();
            }

        }
        System.out.println("\n-----------------------\n");
        //output the student's information
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("\n-----------------------\n");
        if(stu1.getHighScore()>stu2.getHighScore()){
            System.out.println(stu1.getName() + " had the higest mark.");
        }
        else
            System.out.println(stu2.getName() + " had the highest mark");
        if(stu1.getAverage()>stu2.getAverage()){
            System.out.println(stu1.getName() + " had the better average.");
        }
        else
            System.out.println(stu2.getName() + " had the better average");
        System.out.println("\n-----------------------\n");
    }
}

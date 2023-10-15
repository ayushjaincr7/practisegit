package Oop;


public class L1_intro {
    public static void main(String[] args) {

        // store 5 roll nos
        // int[] numbers = new int[5];

        // store 5 name
        // String[] names = new String[5];


        // data of 5 students: {rollno, name, marks}
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];


        // Student[] students = new Student[5];x

        

        Student ayush = new Student(15, "Ayush", 85.5f);
        // ayush.rno = 12;
        // ayush.name = "Ayush Jain";
        // ayush.marks = 40;
        System.out.println(ayush.marks);
        // System.out.println(ayush.salary);
        ayush.greeting();
        ayush.changeName("iphone");;
        ayush.greeting();
        Student random = new Student(ayush);
        random.greeting();
        Student random2 = new Student();
        random2.greeting();

        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        one.greeting();
        two.greeting();

    }

  
}
  // Create a class
class Student {
        int rno;
        String name;
        float marks = 90;

        // we need  a way to add the values of the above
        // properties object by object

        void greeting(){
            System.out.println("Hello! My name is: "+ this.name);
        }

        void changeName(String newName){
            this.name = newName;
        }
        //  constructor overloading
        // Student(){
        //     this.rno = 0;
        //     this.name = "";
        //     this.marks = 0.0f;
        // }

        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
        Student (Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student(){
            this (13, "default person", 100.0f);
        }
    }

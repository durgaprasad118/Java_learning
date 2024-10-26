package com.dp.introduction;

public class Main {
  public static void main(String[] args) {
    // store rollNumbers
    int[] rollNumbers = new int[5];
    String[] names = new String[5];

    // suppose we need to store data of students : { name, marks, rollNumber}
    // we can create a string array for names
    // a float array for marks
    // a int array for rollNumbers
    // so the best way is to create a class ( a named group of properties and
    // functions)
    // Class is a template of an object ( logical construct)
    // an object is an instance of class ( physical reality => occupies memory)
    // object has - state (value), identity (where the value is stored in memory)
    // and behaviour()
    // new is used to create Objects
    // we use dot operator to access the value.

    // this is declaring and by default the value of object is null
    // this happens at compile time
    Student Kunal;

    // dynamically allocates the memory and returns the reference to it
    // this happens at run time ( the time when memory is allocated)
    // new allocates the memory dynamically

    Kunal = new Student("durga", 1, 34);
    // by default gives 0 or null (for string) and 0.0 for float

    // Kunal.changeName("Durga Prasad");
    Kunal.greet();
    // Kunal.naaames ="Dp";
    // Kunal.marks = 20;
    // Kunal.rollNum = 1;
    //
    // System.out.println(Kunal.rollNum);
    // System.out.println(Kunal.marks);
    // System.out.println(Kunal.naaames);

    // updating in the fly
    // constructor (defines what happens when object is created) other than dot
    // notation.
    // we intialize while creating an object

    // CONSTRUCTOR : is a special function that runs when an object is created and
    // allocates some variables.
    // by default it gives the default values llike null, 0, 0.0

    // this - which object are you referring to
    // we need a keyword to access the object
    // whenever we create an object a constructor is called
    Student rahul = new Student();
    Student one = rahul;

    one.name ="Benq";
    System.out.println(rahul.name);
  }

}
//lhs(reference i.e. bus) is looked by compiler & rhs (object i.e. new Bus()) is looked by jvm
class Student {
  int rollNum;
  float marks;
  String name;

  void greet() {
    System.out.println("hi from " + this.name);
  }

  void sayMarks() {
    System.out.println(this.marks);
  }

  void changeName(String name) {
    this.name = name;
  }

//  Student() {
//    this.marks = 0;
//    this.name = "dp";
//    this.rollNum = 0;
//  }

  Student(){
    this("kunal Kushwaha",2,12);
  }
  // Student dp = new Student("dp",12,23);
  //this will be replaced with dp
  Student(String nam, int num, int m) {
    this.marks = m;
    this.name = nam;
    this.rollNum = num;
  }
}

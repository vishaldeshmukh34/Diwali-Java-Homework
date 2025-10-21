// 1. Define a class Student with variables rollNo, name, and marks. Create an object to display the
// details.

class Student {
    
    String name ;
    String rollNo ;
    String marks ;
    
    public void Info(){
        System.out.println("Student Name :- "+name);
        System.out.println("Student RollNo :- " +rollNo);
        System.out.println("Student marks :- " +marks);
    }
    
    
    public static void main(String[] args) {
        
        Student obj =  new Student();
        obj.name = "vishak";
        obj.rollNo = "34";
        obj.marks = "79";
        obj.Info();
        
        
        
    }
}
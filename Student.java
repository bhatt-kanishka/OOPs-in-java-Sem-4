
/*1.2.  Write a Java program to print the details of a student. */
class Student{
    String name;
    int sapid;
    String program;
    float sgpa;

    void display(){
        System.out.println("Name of the student : "+name);
         System.out.println("Age of the student : "+sapid);
          System.out.println("Program of the student : "+program);
           System.out.println("SGPA of the student : "+sgpa);     
           System.out.println("_-_-_-_-******-_-_-_-_-_-_");
    
}
    public static void main(String[] args){
        Student s1=new Student();
        
        s1.name="kanishka";
        s1.sgpa= 7.98f;
        s1.sapid=590017366;
        s1.program="Btech Cse";

       s1.display();
        
    }}
    



import java.util.ArrayList;
import  java.util.Iterator;
import  java.util.List;
import java.util.Scanner;

class Student{
    List<String> names = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void store_name(){
           
        int no_stu;
           System.out.println("Enter the number of students : ");
           no_stu=sc.nextInt();

           for(int i=0 ; i<no_stu ;i++){
            System.out.println("Enter name of student"+(i+1));
            names.add(sc.next());
           }
           System.out.println("students are : "+names);




         

           while(true){

              System.out.println(" \n**Enter 1 to add Student **  \n**Enter 2 to remove Student** \n**Enter 3 to see updated Student record** \n **Press zero '0' to exit **\n");

            int choice = sc.nextInt();

           if(choice==1){
           
            System.out.println("Enter the number of students to add ");
            int no_stu_add = sc.nextInt();

            for(int i=0 ;i<no_stu_add ; i++){
                System.out.println("Enter the name of the student you want to add : "+(i+1));
                names.add(sc.next());
            }
            //System.out.println(names);
        }

        else if(choice==2){
            System.out.println("Enter the name of the student whose name is to be deleted : ");
            String del_name = sc.next();

            Iterator<String> it = names.iterator();
            
            while(it.hasNext()){
                String current = it.next();

               if(current.equals(del_name)){
                it.remove();
                System.out.println("Student " + del_name +" has been deleted from the student account");
               }
            }

        }
        
        
        else if(choice==3){
            System.out.println("updated list of students is : "+names);
        }

        else if(choice==0){
             System.out.println("You have succesfully exited the program");
              break;
        }
    }

           }}


    

public class Stu_data_Collection {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.store_name();
    }
    
}

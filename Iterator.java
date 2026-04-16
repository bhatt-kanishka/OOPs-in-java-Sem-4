//import java.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



class Iterate{
   
List<Object> data = new LinkedList<>();
Scanner k = new Scanner(System.in);

void create(){
    int data_entries;
    System.out.println("Enter the number of items to be stored in linked list : ");
    data_entries = k.nextInt();

 System.out.println("Enter the items :");
    for(int i=0 ; i<data_entries ; i++){
    data.add(k.next());

}
}

void show(){
    System.out.println("data stored in link list is : " + data);
}
}

public class Iterator {
    public static void main(String[] args) {
        Iterate obj = new Iterate();
           obj.create();
            obj.show();
        
    }
    
}
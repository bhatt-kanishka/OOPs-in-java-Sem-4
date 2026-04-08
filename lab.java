import java.util.Scanner;

class Array_creation {
   
    int[][] array;
    int[] h_a_c;
    int row, col;

    String[] performer ={"kb" ,"vb" ,"sb"};
    String[] quater = {"q1" ,"q2" ,"q3"};

    void create() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows of the array");
        row = sc.nextInt();

        System.out.println("Enter the no. of columns of the array");
        col = sc.nextInt();

        System.out.println("Enter the elements in the array");
        array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    void display() {

    System.out.print("        ");
    for(int j = 0; j < col; j++){
        System.out.print(quater[j] + "     ");
    }
    System.out.println();

    for(int i = 0; i < row; i++){

        System.out.print(performer[i] + "     ");

        for(int j = 0; j < col; j++){
            System.out.print(array[i][j] + "      ");
        }

        System.out.println();
    }
}

    void hap(){
        int[] avg = new int[row] ;

        for(int i=0 ; i<row ; i++){
            int sum =0;

           for(int j=0 ;j<col ; j++){
            sum+=array[i][j];
        }
           
        avg[i] = sum/col;
           }
        int max_avg = avg[0];
        
        for(int i=0 ; i<row ; i++){
        System.out.println("Average of row " + performer[i] + " is: " + avg[i]);
        
        if(avg[i]>max_avg){
            max_avg = avg[i];
            
        }
    }

        System.out.println("Maximum average performance is of : "+performer[0]);
    }

    void quater(){
        int[] avg = new int[col];

           for(int j=0 ; j<col ; j++){
                int sum = 0;
                
                for(int i=0 ; i<row ; i++){
                 sum += array[i][j]; 
            }
            avg[j] = sum/row;
        }
            int max_avg = avg[0];
            for(int j=0 ; j<col ; j++){
            System.out.println("Average of  " + quater[j] + " is: " + avg[j]);
           }

            for(int j=0 ; j<col ; j++){
                if(avg[j]>max_avg){
                    max_avg = avg[j];
                }
            }
            System.out.println("Maximum average is: " + max_avg);
        }



  void best_performer(){

    int bestRow = 0;
    int maxTotal = 0;

    for(int i = 0; i < row; i++){

        int sum = 0;

        for(int j = 0; j < col; j++){
            sum += array[i][j];
        }

        if(sum > maxTotal){
            maxTotal = sum;
            bestRow = i;
        }
    }

    System.out.println("Best performer is: " + performer[bestRow] +
                       " with total score: " + maxTotal);
}
}


public class Lab {
    public static void main(String[] args) {
        Array_creation obj = new Array_creation();

        System.out.println("Name- kanishka  , batch-4 , specilation-core ,sap-590017366");

        obj.create();
        obj.display();
        obj.hap();
        obj.quater();
        obj.best_performer();
    }
}
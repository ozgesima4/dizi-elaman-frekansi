
package tekraredençiftsayilar;

//import java.util.Arrays;

public class TekraredenÇiftsayilar {

    public static void main(String[] args) {
        int array[]={5,10,5,10,20};
      //  Arrays.sort(array);
       
        int counter;
        for (int i = 0; i <array.length ; i++) {
             counter=0;
             for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j]){
                    counter++;
                }
            
            }     System.out.println(array[i]+"den "+counter+"tane var.");
           
        }
    }
    
}

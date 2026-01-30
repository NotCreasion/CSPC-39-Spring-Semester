/*    
    Group Members:    
    - Ariel Penaloza    
    - Estefania Reyes Carrasco    
    - Manuel Perez    
    - Angie Alvarez    
    Date: 01-29-2026    
    */    

    import java.util.Scanner;    

    public class algorithmPractice {    

    public static void specialSort (int[] arr) {    
        final int NUM_BERS = 10 ; // number of elements for the algorithm    
        int [] userVals = new int [NUM_BERS]; // user numbers    
    
        int n = arr.length;    
        int mid = n/2;    
        int tempVal; //temp variable for swapping    
    
    //Sort first hald in ascending order     
    //using Selection Sort    
        for( int i = 0; i < mid -1; i++) {     
        int minldx = i;    
        for ( int j = i + 1; j < mid; j++) {    
          if ( arr[j] < arr[minldx]) {    
            minldx = j;    
            }    
          }    
          int temp = arr[minldx];    
          arr[minldx] = arr[i];    
          arr[i] = temp;    
          }    
      // Sort second hald in descending order     
      //using selection Sort    
      for ( int i = mid; i< n-1; i++) {     
      int maxldx = i;    
      for (int j = i +1; j < n; j ++) {    
        if ( arr[j] > arr[maxldx]) {    
          maxldx = j;    
          }    
        }    
        int temp = arr[ maxldx];    
        arr[maxldx] = arr[i];    
        arr[i] = temp;    
        }    
      }    
    
    public static void main(String[] args) {    
      Scanner scnr = new Scanner(System.in);    
        // Printing the numbers    
        int [] unorderedArray = {15,12,5,8,2,95,65,16,23,35};    
    
    } //ends main    
    } //ends class    

public class BubbleSort{
    public static void bubbleSort(int[] arr){
       int n=arr.length;
       boolean swapped;

       int cntPass=0;

       //outer loop for passes:
       for(int i=0;i<n-1;i++){
           swapped=false;   // tracking if any swaps occured in this pass
          
           //Inner loop for comparisions and swaps:
           for (int j=0;j<n-1-i;j++){ // by iterating to n-1-j we are reducing the search activity space for each completyed pass
                                      // when the biggest elements will be put on it's correct position 
             
            //comparing adjacent elements:
            if (arr[j]>arr[j+1]){
                  // Swap if they are in wrong order:
                  int tmp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=tmp;
                  swapped=true;
            }

           }

           // If no swaps occured array is already sorted:
           if(!swapped){
            break;
           }
           cntPass++;
       }
       System.out.println("Number of passes required to sort the array: "+cntPass);
    }

    public static void main(String[] args) {
        //int[] arr = {64, 34, 25, 12, 22};
        int[] arr={64,34,22,11,9,1,-89,-97};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array after bubble sorting:");
        printArray(arr);
    }

    // Utility method to print array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
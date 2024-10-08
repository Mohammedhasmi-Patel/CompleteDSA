public class InsertionSort {

  /*
   Worst Case:O(n^2)
   Best Case:O(n)
   Average Case:O(n^2)
   */
  static void insertionSort(int []array){
    int n = array.length;
    for(int i=1;i<n;i++){
      for(int j=i;j>0;j--){
        if(array[j]<array[j-1]){
            int temp = array[j];
            array[j] = array[j-1];
            array[j-1] = temp;
        }
        else{
          break;
        }
      }
    }
  }

  // decreasing order 
  static void insertionSortDecreasing(int [] array){
    int n = array.length;
    for(int i=1;i<n;i++){
         for(int j=i;j>0;j--){
          if(array[j]>array[j-1]){
            int temp = array[j];
            array[j] = array[j-1];
            array[j-1] = temp;
           }
          else{
            break;
          }
        }
    }
  }
  public static void main(String[] args) {
    int[] arr = {3,1,2,4,5};
    insertionSortDecreasing(arr);
    for (int i : arr) {
      System.out.print(i+" ");
    }
    
  }
}

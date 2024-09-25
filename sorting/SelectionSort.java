public class SelectionSort {

  // selection sort 
  static void selectionSort(int []array){
     int j=0; 
     for(int i=0;i<array.length-1;i++){
      int min = i;
      for( j=i+1;j<array.length;j++){
        if(array[j]<array[min]){
           min = j;
        }
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
     }
  }
  public static void main(String[] args) {
    int [] array = {10,8,2,3,1,4};
    selectionSort(array);
    for (int i : array) {
      System.out.print(i+" ");
    }
  }
}

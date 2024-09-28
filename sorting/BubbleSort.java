public class BubbleSort {


  // this is code of bubble s
  static void bubbleSort(int [] array){
    int n = array.length;
    for(int i=1;i<n;i++){
      boolean flag = false;
      for(int j=0;j<n-i;j++){
           if(array[j]>array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
           }
      }
      if(!flag){
        break;
      }
    }
  }
  public static void main(String[] args) {
    int [] array = {6,4,12,3,1};
    bubbleSort(array);
    for (int i : array) {
      System.out.print(i+" ");
    }
  }
}

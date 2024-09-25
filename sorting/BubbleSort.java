public class BubbleSort {


  // this is code of bubble sort
  static void bubbleSort(int [] array){
    for(int i=0;i<=array.length;i++){
        boolean flag = false;
        for(int j=i+1;j<array.length;j++){
          if(array[j]<array[i]){
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            flag = true;
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

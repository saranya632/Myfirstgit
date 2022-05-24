class BubbleSortExample {
  public static void main(String []args) {
    int num, i, j, temp;

   int[] array={25,19,53,6,87};
   num=array.length;
    for (i = 0; i < ( num - 1 ); i++) {
      for (j = 1; j < num - i ; j++) {
        if (array[j-1] < array[j]) 
        {
          temp = array[j-1];
          array[j-1] = array[j];
          array[j] = temp;
        }
      }
    }
 
    System.out.println("Sorted list of integers:");
 
    for (i = 0; i < num; i++) 
      System.out.println(array[i]);
  } 
}



package Seminar.CodeGeex;
//Stealth mode //Code sẽ được tự động tạo khi nhập yêu cầu, ấn TAB để acp code
public class Demo_1 {
   //Write Bubble sort function
   public static void bubbleSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++)
         for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
   }  
   //Write Selection sort function
   public static void selectionSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) {
         int min = i;
         for (int j = i + 1; j < n; j++)
            if (arr[j] < arr[min])
               min = j;
         int temp = arr[min];
         arr[min] = arr[i];
         arr[i] = temp;
      }
   }
   //Write Insertion sort function
   public static void insertionSort(int[] arr) {
      int n = arr.length;
      for (int i = 1; i < n; i++) {
         int key = arr[i];
         int j = i - 1;
         while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
         }
         arr[j + 1] = key;
      }
   }
   
}
 


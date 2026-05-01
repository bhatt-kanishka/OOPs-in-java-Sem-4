import java.util.*;
class RotateArray {
 public static void rotateLeft(int arr[], int k) {
  int n = arr.length;
  k = k % n;
  for (int i = 0; i < k; i++) {
   int temp = arr[0];
   for (int j = 0; j < n - 1; j++) {
    arr[j] = arr[j + 1];
   }
   arr[n - 1] = temp;
  }
 }

 public static void rotateRight(int arr[], int k) {
  int n = arr.length;
  k = k % n;
  for (int i = 0; i < k; i++) {
   int temp = arr[n - 1];
   for (int j = n - 1; j > 0; j--) {
    arr[j] = arr[j - 1];
   }
   arr[0] = temp;
  }
 }

 public static void main(String[] args) {
  System.out.println("Name: Kanishka Bhatt, Batch: 4, SAP ID: 590017366");
  int arr[] = {1, 2, 3, 4, 5};
  rotateLeft(arr, 2);
  System.out.println("Output of the code for left rotation is: " + Arrays.toString(arr));
  rotateRight(arr, 2);
  System.out.println("Output of the code for right rotation is: " + Arrays.toString(arr));
 }
}
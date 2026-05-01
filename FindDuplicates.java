class FindDuplicates {
 public static void main(String[] args) {
  System.out.println("Name: Kanishka Bhatt, Batch: 4, SAP ID: 590017366");
  int arr[] = {1, 2, 3, 1, 3, 6, 6};

  System.out.println("Output of the code for duplicate elements is:");
  for (int i = 0; i < arr.length; i++) {
   int index = Math.abs(arr[i]);
   if (arr[index] >= 0) {
    arr[index] = -arr[index];
   } else {
    System.out.println("Duplicate: " + index);
   }
  }
 }
}
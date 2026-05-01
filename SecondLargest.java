class SecondLargest {
 public static void main(String[] args) {
  System.out.println("Name: Kanishka Bhatt, SAP ID: 590017366, Batch: 4");
  int arr[] = {10, 20, 4, 45, 99};
  int first = Integer.MIN_VALUE;
  int second = Integer.MIN_VALUE;

  for (int num : arr) {
   if (num > first) {
    second = first;
    first = num;
   } else if (num > second && num != first) {
    second = num;
   }
  }

  System.out.println("Output of second largest element is: " + second);
 }
}
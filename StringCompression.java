class StringCompression {
 public static void main(String[] args) {
  System.out.println("Name: Kanishka Bhatt, Batch: 4, SAP ID: 590017366");
  String str = "aaabbcc";
  String result = "";
  int count = 1;

  for (int i = 0; i < str.length(); i++) {
   if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    count++;
   } else {
    result += str.charAt(i) + "" + count;
    count = 1;
   }
  }

  System.out.println("Output of the code for string compression is: " + result);
 }
}
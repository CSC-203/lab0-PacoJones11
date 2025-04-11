public class Lab00
{
   public static void main(String[] args)
   {
      //initialize variables and print
      int x = 5;
      String y = "hello";
      float z = 9.8f;
      System.out.println("x:" + x + "y:" + y + "z:" + z);

      //print numbers in a list
      int[] nums = {3, 6, -1, 2};
      for (int num : nums) {
         System.out.println(num);
      }

      int numFound = charCount(y, 'l');
      System.out.println("Found: " + numFound);

      for (int i = 1; i < 12; i++) {
         System.out.println(i + " ");
      }

      System.out.println();

   }

   public static int charCount(String s, char c) {
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == c) {
            count++;
         }
      }
      return count;
   }
}

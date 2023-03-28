/**
 * class: WeekendAssignment
 * @author: Hugo Padilla
 * @date: March 27, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * Description: In this Java class, I will be incorporating multiple methods into one overall Class, WeekendAssignment.
 * In addition to this, I will be testing to ensure that all of my methods work coherently within the Class.
 */
public class WeekendAssignment{
    // I will start with the main method for organization, so my test cases are clearly visible, and the used methods will follow below.
    // I make my expected result post with the actual to console for easier reference.
    // I also make the inputs actual variables, so that way there are multiple test cases if you would wish.
    public static void main (String[] args){
        WeekendAssignment wa = new WeekendAssignment();
        // test reverseDoubleChar
        String input1 = "hello";
        String actual1 = wa.reverseDoubleChar(input1);
        System.out.println("reverseDoubleChar(\"" + input1 + "\"): " + actual1 + " // Expected result: olleehh");
    
        String input2 = "test";
        String actual2 = wa.reverseDoubleChar(input2);
        System.out.println("reverseDoubleChar(\"" + input2 + "\"): " + actual2 + " // Expected result: tsettss");
    
        // test sumDigits
        int input3 = 1234;
        int actual3 = wa.sumDigits(input3);
        System.out.println("sumDigits(" + input3 + "): " + actual3 + " // Expected result: 10");
    
        int input4 = 0;
        int actual4 = wa.sumDigits(input4);
        System.out.println("sumDigits(" + input4 + "): " + actual4 + " // Expected result: 0");
    
        // test birthdayName
        String input5 = "Hugo";
        String actual5 = wa.birthdayName(input5);
        System.out.println("birthdayName(\"" + input5 + "\"): " + actual5 + " // Expected result: Happy Birthday Hugo!");
    
        String input6 = "Dr. Park";
        String actual6 = wa.birthdayName(input6);
        System.out.println("birthdayName(\"" + input6 + "\"): " + actual6 + " // Expected result: Happy Birthday Dr. Park!");
    
        // test missingFront
        String input7 = "Hello";
        String actual7 = wa.missingFront(input7);
        System.out.println("missingFront(\"" + input7 + "\"): " + actual7 + " // Expected result: lo");
    
        String input8 = "test";
        String actual8 = wa.missingFront(input8);
        System.out.println("missingFront(\"" + input8 + "\"): " + actual8 + " // Expected result: t");
    
        // test swapEnds
        String input9 = "Hello";
        String actual9 = wa.swapEnds(input9);
        System.out.println("swapEnds(\"" + input9 + "\"): " + actual9 + " // Expected result: oellH");
    
        String input10 = "t";
        String actual10 = wa.swapEnds(input10);
        System.out.println("swapEnds(\"" + input10 + "\"): " + actual10 + " // Expected result: t");
    
        // test everyOther
        String input11 = "Hello";
        String actual11 = wa.everyOther(input11);
        System.out.println("everyOther(\"" + input11 + "\"): " + actual11 + " // Expected result: Hlo");
    
        String input12 = "test";
        String actual12 = wa.everyOther(input12);
        System.out.println("everyOther(\"" + input12 + "\"): " + actual12 + " // Expected result: ts");
    
        // test nonStart
        String input13a = "Hello";
        String input13b = "There";
        String actual13 = wa.nonStart(input13a, input13b);
        System.out.println("nonStart(\"" + input13a + "\", \"" + input13b + "\"): " + actual13 + " // Expected result: ellohere");
    }
    // I will be following the order provided in the Assignment details.

    // reverseDoubleChar - Mirrors a word, as well as, having twice the amount of normal letters.
    public String reverseDoubleChar(String word){
        String result = ""; // Using another string variable for output. 
        for(int i = word.length()-1; i >= 0; i--)
      {
        result += word.charAt(i) + "" + word.charAt(i); 
      }
      return result; 
    }
    // sumDigits - Takes the numerical sum of each individual digit of an integer.
    public int sumDigits(int n) {
        if (n == 0) {
          return 0;
        } else {
          int sum = 0;
          while (n > 0) {
            sum += n % 10;
            n /= 10;
          }
          return sum;
        }
      }
    // birthdayName - Takes an individuals name and adds it after "Happy Birthday"
    public String birthdayName(String name){
    return ("Happy Birthday " + name + "!");
    }
    // missingFront - Returns an input string without the inital 3 letters.
    public String missingFront(String str){
    return str.substring(3,str.length());
    }
    // swapEnds - Swaps the first and last letter of a string.
    public String swapEnds(String str) {
        if (str.length() <= 1) {
          return str;
        } else {
          char first = str.charAt(0);
          char last = str.charAt(str.length() - 1);
          String middle = str.substring(1, str.length() - 1);
          return last + middle + first;
        }
    }
    // everyOther - Takes a string and only outputs 'every other' letter.
    public String everyOther(String str) {
        String result = ""; // Declaring a new string for the output to go.
        for (int i = 0; i < str.length(); i += 2) {
          result += str.charAt(i);
        }
        return result;
    }
    // nonStart - Combines two strings without their inital character.
    public String nonStart(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
          return ""; // If there aren't enough characters, return nothing.
        } else {
          return a.substring(1) + b.substring(1);
        }
    }
    // fibonacci - Returns the nth number of the fibonacci series.
    public int fibonacci(int n) {
        if (n < 0) {
          throw new IllegalArgumentException("Cannot be a negative number."); // Failure Result
        } else if (n == 0) {
          return 0;
        } else if (n == 1) {
          return 1;
        } else {
          int a = 0;
          int b = 1;
          for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
          }
          return b;
        }
    }
    // luckySum - combines three integers, but stops if one contains '13'
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
          return 0;
        } else if (b == 13) {
          return a;
        } else if (c == 13) {
          return a + b;
        } else {
          return a + b + c;
        }
    }
    // hasPalindrome - Checks if the following string is a palindrome.(Mirrored statement is same as original)
    public boolean hasPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
          // Odd character palindromes.
          int left = i - 1;
          int right = i + 1;
          while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            return true;
          }
          // Even character palindromes.
          left = i;
          right = i + 1;
          while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            return true;
          }
        }
        return false;
    }
    // powerOfTwo - If the square root of the number is even, return true.
    public boolean powerOfTwo(int n) {
        if (n == 0) {
          return false;
        } else {
          do {
            if (n == 1) {
              return true;
            } else if (n % 2 != 0) {
              return false;
            }
            n /= 2;
          } while (true);
        }
    }
}
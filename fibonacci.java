import java.util.Scanner;
import java.util.Arrays;

public class fibonacci {


    public static void main (String[] args) {

       runProgram();

    }

    public static int getTerms () {

      System.out.println("How many terms should be in the Fibonacci sequence?");
      Scanner sc = new Scanner(System.in);
      int terms = sc.nextInt();
      return terms;
      
    }

    public static int [] createSequence(int terms) {

      int fibonacci[] = new int[terms];

      fibonacci[0] = 1;
      fibonacci[1] = 2;

      for (int i = 2; i < terms; i ++) {

        fibonacci[i] = sumNums(fibonacci[i-2], fibonacci[i-1]);

      }

       return fibonacci;

    }

    public static int sumNums(int a, int b) {

        int sum = a + b;
        return sum;

    }

    public static String convertArray (int [] array) {

      String result = Arrays.toString(array);
      return result;

    }

    public static int sumArray (int [] array) {

      int sum = 0;

      for (int value : array) {
        sum += value;
        }

      return sum;
      
    }

    public static void runProgram () {

      int input [] = createSequence(getTerms());

      System.out.println("The sequence was: " + convertArray(input));
      System.out.println("The total of that sequence was: " + sumArray(input));

    }

} 
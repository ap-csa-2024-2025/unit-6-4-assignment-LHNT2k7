import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      String elem = arr[i];
      if ( targetLength == elem.length())
      {
        count ++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int = 0, i < arr.length; i++)
    double hai = arr[i];
    if(target == hai)
    {
      return i
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    // replace with your code
    return false;
  }

  public static String findMode(String[] arr)
  {
    // replace with your code
    return null;
  }
}

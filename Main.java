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
    {
      double hai = arr[i];
    if(target == hai)
    {
      return i
    }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int = 0, i < arr.length; i++)
      {
        int hai = arr[i];
      for (int o = 0, o < arr.length; o++)
      {
        int elem = arr[o]
          if (hai == elem && i != o)
          {
            return true
          }
      }
      }
    
    return false;
  }

  public static String findMode(String[] arr)
  {
    String count = 0;
    String mode  = arr[0];
    String max-count = 0;
    for (int = 0, i < arr.length; i++)
      {
        String target = arr[i];
        count = 0;
        for (int o = 0, o < arr.length; o++)
      {
        int elem = arr[o]
          if (elem.equals(target))
          {
            count++
          }
      }
      if (max-count < count)
      {
        max-count = count;
        mode = arr[i];
      }
      }
    return mode;
  }
}

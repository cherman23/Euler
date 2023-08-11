/* Useful utilities in
 * project euler problems
 */

public class Utils
{

  public static boolean isPrime(long n)
  {
    if (n == 0) {return false;}

    if( (n > 2 && n % 2 == 0) || n == 1)
    {
      return false;
    }

    for (int i = 3; i <= (int)Math.sqrt(n); i += 2)
    {
      if (n % i == 0)
      {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindrome(int num)
  {
    int palindrome = num;
    int reverseNum = 0;

    while (palindrome > 0)
    {
      int remainder = palindrome % 10;
      reverseNum = reverseNum * 10 + remainder;
      palindrome = palindrome / 10;
    }

    if (num == reverseNum)
    { return true; }

    return false;
  }

  public static long numberOfFactors(long num)
  {
    long count= 0;
    long temp = (long) Math.sqrt(num);

    for (long i = temp; i >= 1; i--)
    {
      if (num % i == 0) {count++;}
    }
    count *= 2;

    return count;
  }

  public static boolean isAbundant(int num)
  {
    int numOne = 0;

    for (int j = num-1; j > 0; j--)
    {
      if (num%j == 0)
      {
        numOne+=j;
      }
    }
    if (numOne > num) {return true;}

    return false;
  }

  public static long factorial(long num)
  {
    if (num <= 2) {
        return num;
    }
    return num * factorial(num - 1);
  }

  public static boolean isCircularPrime(int num)
  {
    int numLen = Integer.toString(num).length();

    int num2 = num;

    if (isPrime(num2))
    {
      if (num2 > 9)
      {
        for (int i = 0; i < numLen-1; i++)
        {
          int x = num2%10 * powerOf(10, numLen - 1);
          int y = num2/10;

          num2 = x+y;
          if (!isPrime(num2)) {return false;}
        }
      }
      return true;
    }
    return false;
  }

  public static int powerOf(int x, int y)
  {
    int temp = x;

    for (int i = 1; i < y; i++)
    {
      x=x*temp;
    }

    return x;
  }
}

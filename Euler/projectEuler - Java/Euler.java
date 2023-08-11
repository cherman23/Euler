/* Solutions to
 * project Euler
 * problems
*/
import java.util.ArrayList;
import java.math.BigInteger;

public class Euler
{

// problem001 COMPLETE
  public static int problem001()
  {
    int x = 0;

    for (int i = 1; i < 1000; i++)
    {
      if (i%3 == 0 || i%5 == 0)
      {
        x += i;
      }
    }
    return x;
  }

// problem002 COMPLETE
  public static int problem002()
  {
    // creating int for sum
    int sum = 0;

    // creating arraylist and adding first two ints so that it doesnt bug
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(0);
    nums.add(1);

    // loop up to 4000000 because that is max of the problem
    for (int i = 1; nums.get(i) <= 4000000; i++)
    {
      // temp variable for assigning fib nums
      int temp;

      // ability to go back one digit in ArrayList is reason for use
      nums.add(nums.get(i) + nums.get(i-1));

      temp = nums.get(i);

      // if the fib number is even
      // add the number
      if (temp%2 == 0)
      {
        sum += temp;
      }
    }
    return sum;
  }

// problem003 COMPLETE
  public static long problem003()
  {
    // What is the largest prime factor of the number 600851475143?
    long num = 600851475143l; // number we are searching through
    long count = 0; // this will be set to the largest prime factor
    long x = (long) Math.sqrt(num); // factor trees work through sqrt's

    long startTime = System.nanoTime();

    for (long i = x; i >= 1; i--) // iterate around the sqrt
    {
      if (num % i == 0) // if the number is a factor
      {
        count = num/i; // count is the cofactor
        if (Utils.isPrime(count) == true)
        {
          break; // breaks so it returns the biggest factor
        }
        count = i; // count is the facotr
        // checks this one because if it is not bigger than the sqrt
        // then it must be below the sqrt
        if (Utils.isPrime(count) == true)
        {
          break; // breaks so it returns biggest prime factor
        }
      }
    }
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Execution time in nanoseconds: " + timeElapsed);
    System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    return count; // return biggest factor
  }

// problem004 COMPLETE
  public static int problem004()
  {
    // problem to find largeset palindrome of a product of a
    // number under 1000
    int temp = 0;
    int max = 0;

    // loop through each number under 1000
    for (int i = 1; i <= 999; i++)
    {
      // multiply every number by every other number under 1000
      for (int j = 1; j <= 999; j++)
      {
        temp = i * j;
        // if the number is a isPalindrome
        // compare the number the largest palindrome
        // that came before it
        if (Utils.isPalindrome(temp) == true)
        {
          // assign the largest palindrome
          if (temp > max) {max = temp;}
        }
      }
    }
    // return the largest palindrome
    return max;
  }

// problem005 COMPLETE
  public static int problem005()
  {
    // find the smallest number divisible by 1-20
    int smallest = 0;
    // increase i until i is found
    for (int i = 1; i < 2147483647; i++)
    {
      // if the number is divisible by 1-20 then it is asigned and breaks away
      if (i % 2 == 0)
      {
        if (i % 3 == 0)
        {
          if (i % 4 == 0)
          {
            if (i % 5 == 0)
            {
              if (i % 6 == 0)
              {
                if (i % 7 == 0)
                {
                  if (i % 8 == 0)
                  {
                    if (i % 9 == 0)
                    {
                      if (i % 10 == 0)
                      {
                        if (i % 11 == 0)
                        {
                          if (i % 12 == 0)
                          {
                            if (i % 13 == 0)
                            {
                              if (i % 14 == 0)
                              {
                                if (i % 15 == 0)
                                {
                                  if (i % 16 == 0)
                                  {
                                    if (i % 17 == 0)
                                    {
                                      if (i % 18 == 0)
                                      {
                                        if (i % 19 == 0)
                                        {
                                          if (i % 20 == 0)
                                          {
                                            // assign the smallest number to
                                            // smallest
                                            smallest = i;
                                            break;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    // return smallest
    return smallest;
  }

// problem006 COMPLETE
  public static double problem006()
  {
    double sumSquare = 0;
    double squareSum = 0;
    double x = 2;


    // find the sum square
    // find the square sum
    for (double i = 1; i <= 100; i++)
    {
      squareSum+=i;
      sumSquare+= Math.pow(i, x);
    }
    squareSum = Math.pow(squareSum, x);

    // return the difference
    return squareSum - sumSquare;
  }

// problem007 COMPLETE
  public static double problem007()
  {
    int count = 0;
    double largest = 0;

    // iterate through each number
    // if a number is prime then add to counter
    // once the counter == 10001
    // break away and return that number
    for (long i = 0l; i < 9223372036854775807l; i++)
    {
      if (Utils.isPrime(i) == true)
      {
        count++;
        if (count == 10001)
        {
          largest = i;
          break;
        }
      }
    }
    return largest;
  }

// problem008 COMPLETE
  public static long problem008()
  {
    // max product
    long maxProduct = 0;
    // temp for comparison
    long temp = 0;
    // array of all 1000 integers
    // i manually typed the commas bc i am lazy
      // it took about 5 minutes
    long[] nums = {7,3,1,6,7,1,7,6,5,3,1,3,3,0,6,2,4,9,1,9,2,2,5,1,1,9,6,7,4,4,2,6,5,7,4,7,4,2,3,5,5,3,4,9,1,9,4,9,3,4,
9,6,9,8,3,5,2,0,3,1,2,7,7,4,5,0,6,3,2,6,2,3,9,5,7,8,3,1,8,0,1,6,9,8,4,8,0,1,8,6,9,4,7,8,8,5,1,8,4,3,
8,5,8,6,1,5,6,0,7,8,9,1,1,2,9,4,9,4,9,5,4,5,9,5,0,1,7,3,7,9,5,8,3,3,1,9,5,2,8,5,3,2,0,8,8,0,5,5,1,1,
1,2,5,4,0,6,9,8,7,4,7,1,5,8,5,2,3,8,6,3,0,5,0,7,1,5,6,9,3,2,9,0,9,6,3,2,9,5,2,2,7,4,4,3,0,4,3,5,5,7,
6,6,8,9,6,6,4,8,9,5,0,4,4,5,2,4,4,5,2,3,1,6,1,7,3,1,8,5,6,4,0,3,0,9,8,7,1,1,1,2,1,7,2,2,3,8,3,1,1,3,
6,2,2,2,9,8,9,3,4,2,3,3,8,0,3,0,8,1,3,5,3,3,6,2,7,6,6,1,4,2,8,2,8,0,6,4,4,4,4,8,6,6,4,5,2,3,8,7,4,9,
3,0,3,5,8,9,0,7,2,9,6,2,9,0,4,9,1,5,6,0,4,4,0,7,7,2,3,9,0,7,1,3,8,1,0,5,1,5,8,5,9,3,0,7,9,6,0,8,6,6,
7,0,1,7,2,4,2,7,1,2,1,8,8,3,9,9,8,7,9,7,9,0,8,7,9,2,2,7,4,9,2,1,9,0,1,6,9,9,7,2,0,8,8,8,0,9,3,7,7,6,
6,5,7,2,7,3,3,3,0,0,1,0,5,3,3,6,7,8,8,1,2,2,0,2,3,5,4,2,1,8,0,9,7,5,1,2,5,4,5,4,0,5,9,4,7,5,2,2,4,3,
5,2,5,8,4,9,0,7,7,1,1,6,7,0,5,5,6,0,1,3,6,0,4,8,3,9,5,8,6,4,4,6,7,0,6,3,2,4,4,1,5,7,2,2,1,5,5,3,9,7,
5,3,6,9,7,8,1,7,9,7,7,8,4,6,1,7,4,0,6,4,9,5,5,1,4,9,2,9,0,8,6,2,5,6,9,3,2,1,9,7,8,4,6,8,6,2,2,4,8,2,
8,3,9,7,2,2,4,1,3,7,5,6,5,7,0,5,6,0,5,7,4,9,0,2,6,1,4,0,7,9,7,2,9,6,8,6,5,2,4,1,4,5,3,5,1,0,0,4,7,4,
8,2,1,6,6,3,7,0,4,8,4,4,0,3,1,9,9,8,9,0,0,0,8,8,9,5,2,4,3,4,5,0,6,5,8,5,4,1,2,2,7,5,8,8,6,6,6,8,8,1,
1,6,4,2,7,1,7,1,4,7,9,9,2,4,4,4,2,9,2,8,2,3,0,8,6,3,4,6,5,6,7,4,8,1,3,9,1,9,1,2,3,1,6,2,8,2,4,5,8,6,
1,7,8,6,6,4,5,8,3,5,9,1,2,4,5,6,6,5,2,9,4,7,6,5,4,5,6,8,2,8,4,8,9,1,2,8,8,3,1,4,2,6,0,7,6,9,0,0,4,2,
2,4,2,1,9,0,2,2,6,7,1,0,5,5,6,2,6,3,2,1,1,1,1,1,0,9,3,7,0,5,4,4,2,1,7,5,0,6,9,4,1,6,5,8,9,6,0,4,0,8,
0,7,1,9,8,4,0,3,8,5,0,9,6,2,4,5,5,4,4,4,3,6,2,9,8,1,2,3,0,9,8,7,8,7,9,9,2,7,2,4,4,2,8,4,9,0,9,1,8,8,
8,4,5,8,0,1,5,6,1,6,6,0,9,7,9,1,9,1,3,3,8,7,5,4,9,9,2,0,0,5,2,4,0,6,3,6,8,9,9,1,2,5,6,0,7,1,7,6,0,6,
0,5,8,8,6,1,1,6,4,6,7,1,0,9,4,0,5,0,7,7,5,4,1,0,0,2,2,5,6,9,8,3,1,5,5,2,0,0,0,5,5,9,3,5,7,2,9,7,2,5,
7,1,6,3,6,2,6,9,5,6,1,8,8,2,6,7,0,4,2,8,2,5,2,4,8,3,6,0,0,8,2,3,2,5,7,5,3,0,4,2,0,7,5,2,9,6,3,4,5,0};

  // search through every consecutative 13 integers
  // multiply the 13 digits
  // if temp is larger than max
    // set max to temp
    // continue till finished
  for (int i = 0; i < nums.length-13; i++)
  {
    temp = nums[i]*nums[i+1]*nums[i+2]*nums[i+3]*nums[i+4]*nums[i+5]*nums[i+6]*nums[i+7]*nums[i+8]*nums[i+9]*nums[i+10]*nums[i+11]*nums[i+12];

    if (temp > maxProduct)
    {
      maxProduct = temp;
    }
  }

  return maxProduct;
  }

// problem009 COMPLETE
  public static double problem009()
  {
    // a + b + c = 1000
    // a < b < c
    // a^2 + b^2 = c^2

    double result = 0;

    // search through each number under 1000
      // for varibles a, b and c
    // if they follow the rules of a pythagorean triple
      // if they follow the rule of a+b+c = 1000
        // set result to their product
    // return the result

    for (double a = 0; a < 1000l; a++)
    {
      for (double b = 0; b < 1000l; b++)
      {
        for (double c = 0; c < 1000l; c++)
        {
          if (a < b && b < c)
          {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            {
              if (a+b+c == 1000)
              {
                 result = a*b*c;
                 break;
              }
            }
          }
        }
      }
    }
    return result;
  }

// problem010 COMPLETE
  public static long problem010()
  {
    // search for all primes under 2000000
    // if a number is prime using isPrime method
    // add total
    // return total
    long total = 0;

    for (long i = 0l; i < 2000000l; i++)
    {
      if (Utils.isPrime(i) == true)
      {
        total += i;
      }
    }
    return total;
  }

// problem011 COMPLETE
  public static long problem011()
  {
    // number for largest product
    long maxProduct = 0;
    // number for comparisons
    long temp = 0;


    // 2D array would probably work best for this bc of up and down
    long[][] numArray = { {8,2,22,97,38,15,0,40,0,75,4,5,7,78,52,12,50,77,91,8},
  {49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,4,56,62,0},
  {81,49,31,73,55,79,14,29,93,71,40,67,53,88,30,3,49,13,36,65},
  {52,70,95,23,4,60,11,42,69,24,68,56,1,32,56,71,37,2,36,91},
  {22,31,16,71,51,67,63,89,41,92,36,54,22,4,40,28,66,33,13,80},
  {24,47,32,60,99,3,45,2,44,75,33,53,78,36,84,20,35,17,12,50},
  {32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
  {67,26,20,68,2,62,12,20,95,63,94,39,63,8,40,91,66,49,94,21},
  {24,55,58,5,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
  {21,36,23,9,75,0,76,44,20,45,35,14,0,61,33,97,34,31,33,95},
  {78,17,53,28,22,75,31,67,15,94,3,80,4,62,16,14,9,53,56,92},
  {16,39,5,42,96,35,31,47,55,58,88,24,0,17,54,24,36,29,85,57},
  {86,56,0,48,35,71,89,7,5,44,44,37,44,60,21,58,51,54,17,58},
  {19,80,81,68,5,94,47,69,28,73,92,13,86,52,17,77,4,89,55,40},
  {4,52,8,83,97,35,99,16,7,97,57,32,16,26,26,79,33,27,98,66},
  {88,36,68,87,57,62,20,72,3,46,33,67,46,55,12,32,63,93,53,69},
  {4,42,16,73,38,25,39,11,24,94,72,18,8,46,29,32,40,62,76,36},
  {20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,4,36,16},
  {20,73,35,29,78,31,90,1,74,31,49,71,48,86,81,16,23,57,5,54},
  {1,70,54,71,83,51,54,69,16,92,33,48,61,43,52,1,89,19,67,48} };


    // double for loop to check the largest product
      // can be up, down, left, right, or diagonal
    for (int i = 0; i < numArray.length; i++)
    {
      for (int j = 0; j < numArray[0].length; j++)
      {
        // right
        if (j + 3 <= numArray.length-1)
        {
          temp = numArray[i][j] * numArray[i][j+1] * numArray[i][j+2] * numArray[i][j+3];
          if (temp > maxProduct)
          {
            maxProduct = temp;
          }
        }

        // left
        if (j - 3 >= 0)
        {
          temp = numArray[i][j] * numArray[i][j-1] * numArray[i][j-2] * numArray[i][j-3];
          if (temp > maxProduct)
          {
            maxProduct = temp;
          }
        }

        // up
        if (i - 3 >= 0)
        {
          temp = numArray[i][j] * numArray[i-1][j] * numArray[i-2][j] * numArray[i-3][j];
          if (temp > maxProduct)
          {
            maxProduct = temp;
          }
        }

        // down
        if (i + 3 <= numArray[0].length-1)
        {
          temp = numArray[i][j] * numArray[i+1][j] * numArray[i+2][j] * numArray[i+3][j];
          if (temp > maxProduct)
          {
            maxProduct = temp;
          }
        }

        // diagonal right
        if (i + 3 <= numArray[0].length-1 && j + 3 <= numArray.length-1)
        {
          temp = numArray[i][j] * numArray[i+1][j+1] * numArray[i+2][j+2] * numArray[i+3][j+3];
          if (temp > maxProduct)
          {
            maxProduct = temp;
          }
        }

        // diagonal left
        if (i + 3 <= numArray[0].length-1 && j - 3 >= 0)
        {
          temp = numArray[i][j] * numArray[i+1][j-1] * numArray[i+2][j-2] * numArray[i+3][j-3];
          if (temp > maxProduct)
          {
            maxProduct = temp;
          }
        }
      }
    }

    // return largest product
    return maxProduct;
  }

// problem012 COMPLETE
  public static long problem012()
  {
    // create the variable that will be triangluar
    long max = 0;
    // create variable that will add to triangular
    long i = 0;

    // loop through triangular numbers until one has more than 500 factors
    while (Utils.numberOfFactors(max) < 500l)
    {
      i++;
      max += i;
    }

    // return triangular number that has more than 500 factors
    return max;
  }

// problem013 COMPLETE
  // SOLVED IN PYTHON

// problem014 COMPLETE
  static long counter = 0;
  public static long problem014()
  {
    long numSequence = 0; // create long with largest sequence
    long longestChain = 0; // longest chain of recursion
    long tempChain = 0;
     // temp variable to compare to longestChain
    // 4. iterate through every number under 1 million
    for (long i = 1l; i < 1000000; i++)
    {
      // 5. call the sequence method that returns a length of terms in long
      tempChain = Euler.sequence(i);
      counter = 0;
      // 6. if temp is larger than longestChain then set longest to temp
      if (tempChain > longestChain)
      {
        longestChain = tempChain;
        numSequence = i;
      }
    }
    // return the int with the largest sequence
    return numSequence;
  }
// part of problem014
    public static long sequence(long num)
    {
      // 1. create long count variable
      // 2. follow the rules with recursion
      // 3. base case is wwhen it reaches 1
      // 4. add one to length of sequence every time recursion happens
      if (num == 1)
      {
        counter++;
      }
      else if (num % 2 == 0)
      {
        counter++;
        sequence(num/2);
      }
      else if (num % 2 == 1)
      {
        counter++;
        sequence(num*3 + 1);
      }

      return counter;
    }

// NEED TO DO 15-26

// problem016 COMPLETE
  public static long problem016()
  {
    // array gotten from python due to python not having size limitations
    long i = 0;

    int[] nums = {1,0,7,1,5,0,8,6,0,7,1,8,6,2,6,7,3,2,0,9,4,8,4,2,5,0,4,9,0,6,0,0,0,1,8,1,
      0,5,6,1,4,0,4,8,1,1,7,0,5,5,3,3,6,0,7,4,4,3,7,5,0,3,8,8,3,7,0,3,5,1,0,5,1,1,2,4,9,3,
      6,1,2,2,4,9,3,1,9,8,3,7,8,8,1,5,6,9,5,8,5,8,1,2,7,5,9,4,6,7,2,9,1,7,5,5,3,1,4,6,8,2,
      5,1,8,7,1,4,5,2,8,5,6,9,2,3,1,4,0,4,3,5,9,8,4,5,7,7,5,7,4,6,9,8,5,7,4,8,0,3,9,3,4,5,
      6,7,7,7,4,8,2,4,2,3,0,9,8,5,4,2,1,0,7,4,6,0,5,0,6,2,3,7,1,1,4,1,8,7,7,9,5,4,1,8,2,1,
      5,3,0,4,6,4,7,4,9,8,3,5,8,1,9,4,1,2,6,7,3,9,8,7,6,7,5,5,9,1,6,5,5,4,3,9,4,6,0,7,7,0,
      6,2,9,1,4,5,7,1,1,9,6,4,7,7,6,8,6,5,4,2,1,6,7,6,6,0,4,2,9,8,3,1,6,5,2,6,2,4,3,8,6,8,
      3,7,2,0,5,6,6,8,0,6,9,3,7,6};

    for (int a = 0; a < nums.length; a++)
    {
      i += nums[a];
    }

    return i;
  }

// problem018 IN PROGRESS


  // problem027 COMPLETE
  public static long problem027()
  {

    // 1. create a and b variables (can be ints)
      // |a| < 1000, |b| <= 1000
    long n = 0;

    long bestA = 0;
    long bestB = 0;
    // 2. create maximum and temp variable for comparison
    long maxNumOfPrimes = 0;

    // 3. iterate through each value of a, b, and n
      // n^2 + an + b
      // for a and b for loops are okay
        // record length of consecutative values of n
          // start n at zero and increment until value isnt prime
          // use while loop and isPrime method
        // assign to max number of primes to temp
        // outside of while loop, if that is bigger than maxNumOfPrimes
          // assign maxNumOfPrimes to temp
    for (long a = -999; a < 1000; a++)
    {
      for (long b = -1000; b <= 1000; b++)
      {
        n = 0;
        while (Utils.isPrime(Math.abs(n*n + (a*n) + b)) == true)
        {
          n++;
        }
        if (n > maxNumOfPrimes)
        {
          maxNumOfPrimes = n;
          bestA = a;
          bestB = b;
        }
      }
    }
    // return maximum values
    return bestA * bestB;
  }

  // problem085 IN PROGRESS
  public static long problem085()
  {
    long i = 0;
    long j = 0;
    long rectangle = 0;
    long factorNum = 0;

    while (factorNum < 2000000)
    {
      i++;
      while (j > 0)
      {
        j++;
        rectangle = i*j;
        factorNum = Utils.numberOfFactors(rectangle);
      }
    }
    return rectangle;
  }

  //problem021 SOLVED
  public static int problem021()
  {
    // create function for amicable numbers
    // create two ints to store the added up factors
    // create create array list for all amicable number
      // check to see if a number is already in the array list before adding
    int numOne;
    int numTwo;
    ArrayList<Integer> amicableNums = new ArrayList<>();
    int result = 0;

    for (int i = 1; i < 10000; i++)
    {
      numOne = 0;
      numTwo = 0;
      // find all factors
      // add them
      //store that in numOne
      // check to see if numOne is under 10000
      // find all factors of numOne and store in numTwo
      // if numTwo == i then add it to the arraylist
      for (int j = i-1; j > 0; j--)
      {
        if (i%j == 0)
        {
          numOne+=j;
        }
      }

      if (numOne < 10000 && numOne != i)
      {
        for (int j = numOne-1; j > 0; j--)
        {
          if (numOne%j == 0)
          {
            numTwo+=j;
          }
        }
      }

      if (i == numTwo)
      {
        if (amicableNums.contains(i) == false)
        {
          amicableNums.add(i);
        }
        if (amicableNums.contains(numTwo) == false)
        {
          amicableNums.add(numTwo);
        }
      }
    }
    for (int i = 0; i < amicableNums.size(); i++)
    {
      System.out.println(amicableNums.get(i));
      result += amicableNums.get(i);
    }

    return result;
  }

//problem 23 IN PROGRESS
  public static int problem023()
  {

    int sumOfAbundantNums = 0;
    int sum = 0;
    int result = 0;
    ArrayList<Integer> Abundantnums = new ArrayList<>();
    ArrayList<Integer> nums = new ArrayList<>();

    // find the abundant numbes
    for (int i = 0; i <= 28123; i++)
    {
      if (Utils.isAbundant(i))
      {
        Abundantnums.add(i);
      }
    }

    for (int i = 0; i <= 28123; i++)
    {
      nums.add(i);
    }

    for (int i = 0; i < Abundantnums.size(); i++)
    {
      for (int j = i; j < Abundantnums.size(); j++)
      {
        sumOfAbundantNums = Abundantnums.get(i) + Abundantnums.get(j);

        // create an array list of all numbers through 28123
        // loop through sumOfAbundantNums
        // remove that one from list of all numbers

        if (nums.contains(sumOfAbundantNums))
        {
          nums.remove(nums.indexOf(sumOfAbundantNums));
        }
      }
    }

    for (int i = 0; i < nums.size(); i++)
    {
      result+=i;
    }

    return result;
  }

  public static int problem035()
  {
    int counter = 0;

    for (int i = 0; i < 1000000; i++)
    {
      if (Utils.isCircularPrime(i))
      {
        counter++;
        System.out.println(i);
      }
    }
    return counter;
  }
}

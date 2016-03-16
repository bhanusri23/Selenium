/* Program using while loop tp print sum of first 100 integers */

import java.lang.Math; 
public class ScoreDemo
{
  public static void main(String[] args)
  {
   int i = 1, sum = 0;
    while(i <= 100)
    {
    	sum = sum+i;
      	i++;
    }
      
    System.out.println(" The summation of first hundred numbers is "+sum);
    
    
    }
  }



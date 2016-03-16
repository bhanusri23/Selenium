/* Program using For Loop for Summation of first hundred numbers. */


import java.lang.Math; 
public class ScoreDemo
{
  public static void main(String[] args)
  {
   int  sum = 0;
    
    for( int i = 1; i <= 100; i++)
    {
    	sum = sum + i;
    }
     
    System.out.println(" The summation of first hundred numbers is "+sum);
    
    }
  }



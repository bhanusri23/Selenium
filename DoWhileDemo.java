/* Program using Do-While Loop for Summation of first hundred numbers. */

import java.lang.Math; 
public class ScoreDemo
{
  public static void main(String[] args)
  {
   int i = 1, sum = 0;
    do{
    sum = sum+i;
      	i++;
    }
    while(i <= 100);
     
    System.out.println(" The summation of first hundred numbers is "+sum);
    
    
    }
  }



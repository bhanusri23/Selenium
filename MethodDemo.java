/* Program to find sum of first 50, 100 and 200 integers. */

import java.lang.Math; 
public class ScoreDemo
{
  public static void main(String[] args)
  {
     sum(50);
    sum();
    sum(200);
  
    
  }
  
   public static void sum()
   {
     int sum = 0;
     for(int i =1; i <= 100; i++)
     {
       sum = sum + i;
     	
     }
     System.out.println(sum);
   }
  
  public static void sum(int n)
   {
     int sum = 0;
     for(int i =1; i <= n; i++)
     {
       sum = sum + i;
     	
     }
      System.out.println("The sum is "+sum);
   }
}


   

/* Program to know the distiction of the student based on below criteria
1. 40 - 50  III Division
2. 50 - 60  II Division
3. >= 60 Distinction
4. Otherwise Failed. */


import java.lang.Math; 
public class ScoreDemo
{
  public static void main(String[] args)
  {
     int m =40 , p = 40, c = 40;
    double avg = (m + p+ c) / 3;
    if(m >= 40 && p >= 40 && c >= 40)
    {
    	System.out.println("Pass");
    
      		if(avg >= 60)
              System.out.println("I Div");
                                 
            else if(avg >= 50)
               System.out.println("II Div");
            else
              System.out.println("III Div");
              
      }
      else
        System.out.println("Failed");
    
    
    }
  }




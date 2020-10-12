package studentmark;

import java.util.Scanner;

public class Mark {
	
	
  private static Scanner sc;

public static void main(String[]args)
  {
	  sc = new Scanner(System.in);
	  int s1=0,s2=0,s3=0,s4=0,s5=0;
	  int total;
	  float avg;
	  
	  System.out.println("enter subject1"+s1);
	  s1=sc.nextInt();
	  System.out.println("enter subject2"+s2);
	  s2=sc.nextInt();
	  System.out.println("enter subject3"+s3);
	  s3=sc.nextInt();
	  System.out.println("enter subject4"+s4);
	  s4=sc.nextInt();
	  System.out.println("enter subject5"+s5);
	  s5=sc.nextInt();
	  total=s1+s2+s3+s4+s5;
	  System.out.println("total"+total);
      avg=total/5;
      System.out.println("average"+avg);
      if(avg >= 90)
      {
    	  System.out.println("gradeA");
    	  if(avg >= 80)
    	  {
    		  System.out.println("gradeB");
    		  if(avg >= 70)
    		  {
    			  System.out.println("gradeC");
    			  if(avg >= 60)
    			  {
    				  System.out.println("gradeD");
    			  }
    			  else
    			  {
    				  System.out.println("Fail");
    			  }
    		  }
    		  
          }
      }
      
  
  }
   
}
	  
	  
	  
	  
	  
	  
	  
	 
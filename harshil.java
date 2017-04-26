import java.util.Scanner;
class harshil

{
   
  public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
         System.out.println("Hello There!!! \n");
    System.out.println("Here I have developed a program in which it will show the primenumbers between the number you enter.");
      
          String  primeNumbers = "";
               System.out.println("Enter the Number Here:");
      
     
     int n = scanner.nextInt();
     
     for (i = 1; i <= n; i++)  	   
      { 		 		  
         
       
       int counter=0; 		  
        
       for(num =i; num>=1; num--)
         
       {
	      if(i%num==0)
	    {
		
          counter = counter + 1;
	    }
	 }
	 
       if (counter ==2)
	 {
	    
	       primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      
     
     
    System.out.println("Here's your result  :");
      System.out.println(primeNumbers);
    System.out.println("Thanks For Using My Program");
   }
}
public class star_paramid
{ 
    public static void printTriagle(int n) 
    {
        for (int i=0; i<n; i++) 
        { 
            for (int j=n-i; j>1; j--) 
            { 
                System.out.print(" "); 
            } 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
    } 
      
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printTriagle(n); 
    } 
}
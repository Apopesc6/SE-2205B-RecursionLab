package recursion;

public class RecursiveFactorial
{

    /**
     * The basic recursive factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long basic(long n)
    {
        // IMPLEMENT THIS METHOD 
        // AND RETURN SOMETHING APPROPRIATE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        


        if (n <= 1) {   //cant get this to work
            return 1;
        }

         
        return n* basic(n-1);
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
        
    }
    
    
    
    /**
     * The tail recursive version of factorial.
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long tailRecursive(long n)
    {
        // IMPLEMENT THIS METHOD USING THE RECURSIVE HELPER FUNCTION
        // AND RETURN SOMETHING APPROPRIATE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
        
        return helper (n,1);
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        
    }

    /**
     * The tail recursive helper function for factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @param  partial   The partial result that is being built up.
     * @return     n factorial.
     */

    private long helper(long n, long partial)
    {
        // IMPLEMENT THIS TAIL RECURSIVE METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
        if (n<=1){ 
            return partial;
        }
        return helper(n-1,n*partial);
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  
      
        //return result;
    }

}

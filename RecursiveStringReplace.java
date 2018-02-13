package recursion;
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to, int i)
    {
        String result = null;

        // IMPLEMENT THIS RECURSIVE METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
  if (s.length() < 1) {
            return s;                    // HAD TO CHANGE THE FUNCTION CALL IN THE TEST REPLACE CONTROLLER TO result = rs.replace("", 'a', 'b',0);
                                        // I JUST ADDED THE INTEGER 0 AT THE END OF THE CALL SO IT STARTS AT THE BEGINNING OF MY STRING
        }
  
        if (i < s.length()){
            if (s.charAt(i) == from) {
                s = s.substring(0, i) + to + s.substring(++i);
                return replace(s, from, to, i+1);//calling replace()
            }
            else {
                return replace(s,from,to,i+1);
            }
        }
        return s;
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<        

        
    }


}

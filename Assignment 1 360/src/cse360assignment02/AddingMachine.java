/* This class adds, subtracts, allows users to see the total of added numbers, and clear
 * the memory of added numbers
 */

package cse360assignment02;

public class AddingMachine 
{
  private int total;
  private String log = "0";
  
  /* Constructor for AddingMachine
   * This method sets the value of total to 0
   */
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
  }
  
  /* Returns the variable total
   * 
   * @return total
   */
  public int getTotal () 
  {
    return total;
  }
  
  /* This method adds the given parameter to the total variable.
   * The method also increments the variable log  
   * 
   * @param value 	an int to be added
   */
  public void add (int value) 
  {
	  //Add param to total
	  total = total + value;
	  
	  //Concat to log
	  log += " + " + value;
  }

  /* This method subtracts the given parameter from the variable total
   * The method also increments the variable log
   * 
   * @param value 	an int to be subtracted
   */
  public void subtract (int value) 
  {
	  //Subtract param from total
	  total = total - value;
	  
	  //Concat to log
	  log += " - " + value;
  }

  /* This method returns the log
   * 
   * @return log 	the variable log or list of computations
   */
  public String toString () 
  {
    return log;
  }

  /* This method clears the log and total variables
   */
  public void clear() 
  {
	  //Clear the log
	  log = "0";
	  //Clear total
	  total = 0;
  } 
}




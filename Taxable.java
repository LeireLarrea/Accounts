
/**
 * Simple interface which must be implemented by all classes 
 * whishing to implement the behaviours for value() and payTax().
 * 
 * @author Leire Larrea Casado (E1662175) 
 * @version 1.0 (January 2017)
 */
public interface Taxable
{
   /** 
    * Performs an arbitrary action in response to 'value'.
    */
   abstract public double value();
   
   /** 
    * Performs an arbitrary action in response to 'payTax'.
    */
   abstract public double payTax(int taxRate);
}

import ou.*;

/**
 * The class CurrentAccountFrog is a subclass of Frog 
 * with the additional instance variable account and the catchFly method overriden.
 * 
 * @author Leire Larrea Casado (E1662175) 
 * @version 1.0 (January 2017)
 */

public class CurrentAccountFrog extends Frog implements Taxable
{
   // instance variables 
   private CurrentAccount account;

   /**
    * Constructor for objects of class CurrentAccountFrog
    */
   public CurrentAccountFrog()
   {
      super();
      account = new CurrentAccount();
      
   }

   /**
    * Constructor for objects of class CurrentAccountFrog 
    * that takes aHolder, aNumber, aBalance, aLimit, aPin arguments 
    * to initialise a CurrentAccount object and assigns it to the variable account.
    */
   public CurrentAccountFrog(String aHolder, String aNumber, double aBalance, double aLimit, String aPin)
   {
      account = new CurrentAccount(aHolder, aNumber, aBalance, aLimit, aPin);
   }
   
   /**
    * Causes the receiver to jump, then croak, then move right, then 
    * increment flyCount 
    * and also 
    * credits the accounts balance by 100, then sets its colour to yellow, 
    * then jumps once more and then sets its colour to green.
    */
   @Override
   public void catchFly()
   {
      super.catchFly();
      this.account.credit(100);
      this.yellow();
      this.jump();
      this.green();
   }
   
   /**
    * Returns the taxable value (position) of the receiver as a Double.
    */
   public double value()
   {
      return this.getPosition();
   }
   
   /**
    * Decrements the receivers taxable value (position) by the formal argument taxRate
    * and returns the taxable value (position) of the receiver as a Double.
    */
   public double payTax(int taxRate)
   {
      this.setPosition(this.getPosition() - taxRate);
      return taxRate;
   }
}

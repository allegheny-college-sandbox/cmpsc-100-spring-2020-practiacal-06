package practicalsix;

/** Solves the pizza party problem.
 * 
 * @author Solutions Repository
 */
public class PizzaParty {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Create fractions
    Fraction totalPizza = new Fraction(4,4);
    Fraction pizzaLeft = new Fraction(3,4);
    Fraction pizzaGiven = new Fraction(1,3);
    
    // Do the multiplication of numerator and denominator
    int newNumer = (pizzaLeft.getNumer() * pizzaGiven.getNumer());
    int newDenom = (pizzaLeft.getDenom() * pizzaGiven.getDenom());
    
    // Modify totalPizza
    totalPizza.setNumer(newNumer);
    totalPizza.setDenom(newDenom);
    
    // Use the getDecimalValue method
    System.out.println("We have " + totalPizza + " (" + totalPizza.getDecimalValue()
                       + ") of a pizza remaining.");
  }
}
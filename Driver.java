public class Driver {
  public static void main(String[] args) {
    // create movies for rental
    Movie theLordOfTheRings = new Movie("The Lord of the Rings", Movie.REGULAR);
    Movie theLionKing = new Movie("The Lion King", Movie.CHILDREN);
    Movie theFabelmans = new Movie("The Fabelmans", Movie.NEW_RELEASE);

    // create rentals
    Rental rental1 = new Rental(theLordOfTheRings, 2);
    Rental rental2 = new Rental(theFabelmans, 3);
    Rental rental3 = new Rental(theLionKing, 4);

    // create customer
    Customer customer = new Customer("Ben Christie");

    customer.addRental(rental1);
    customer.addRental(rental2);
    customer.addRental(rental3);

    // print receipt
    System.out.print(customer.statement());
  }
}

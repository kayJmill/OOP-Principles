package helperPackage;

// This class declares a double instance variable. It has a parameterized constructor that accepts different variables. 
// This particular class demonstrates parametrized consturctors 



public class Textbook extends Book {
    private double price;

    public Textbook(String passedTitle, String passedAuthorName, String
   passedPublisher, int passedYear, double passedPrice) {
    super(passedTitle, passedAuthorName, passedPublisher, passedYear);
    setPrice(passedPrice);
    print();
    }

    public double getPrice() {
    return price;
    }

    public void setPrice(double price) {
    this.price = price;
    }

    public void print() {
    System.out.printf("Text Book: %s, %s, %s (%d) - $%.2f.%n", getTitle(),
   getAuthorName(), getPublisher(), getYear(), getPrice());
    }
}
 
    



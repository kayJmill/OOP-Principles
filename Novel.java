package helperPackage;
// Novel classe extends the Book Class, inheriting its properties and behvaiors
public class Novel extends Book {
    private int numberOfPages;
    
    
    public Novel(String passedTitle, String passedAuthorName, String passedPublisher, int passedYear, int passedNumberOfPages) {
        super(passedTitle, passedAuthorName, passedPublisher, passedYear); // call to the superclass constructor
        setNumberOfPages(passedNumberOfPages); // Setting the number of pages using the setter method
        print();
    }
    
    public int getNumberOfPages() { // Getter Method 
        return numberOfPages;
    }
    
    public void setNumberOfPages(int numberOfPages) { // Setter Method
        this.numberOfPages = numberOfPages;
    }
    
    public void print() {
        System.out.printf("Novel: %s, %s, %s (%d) - %d Pages .%n", getTitle(), getAuthorName(), getPublisher(), getYear(), getNumberOfPages());
        
    }

}

package helperPackage;

// This particular class implements the previously established "Printable". This class declares three String instance variables along with...
// an int variable. This class has a parameterized constructor that accepts certain variables
// This is the second level of abstraction (Abstract Class)

public abstract class Book implements Printable {
    private String title;
    private String authorName;
    private String publisher;
    private int year;

    public Book(String passedTitle, String passedAuthorName, String passedPublisher, int passedYear) {
        setTitle(passedTitle);
        setAuthorName(passedAuthorName);
        setPublisher(passedPublisher);
        setYear(passedYear);
    }

    // Accessor Methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

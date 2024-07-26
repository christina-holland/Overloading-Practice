public class Book {
    //Creating the attributes for the book
    private String title;
    private int pages;
    private int publicationYear;

    //Creating the constructor with all attributes
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    //Creating the default constructor
    public Book() {
        this.title = "Unknown";
        this.pages = 0;
        this.publicationYear = 0;
    }

    //Creating the constructor with the title attribute only
    public Book(String title) {
        this.title = title;
        this.pages = 0;
        this.publicationYear = 0;
    }

    //Creating the constructor with the pages attribute only
    public Book(int pages) {
        this.title = "Unknown";
        this.pages = pages;
        this.publicationYear = 0;
    }

    //Creating the constructor with the publication year only
    public Book(int publicationYear, boolean isPublicationYear) { // Added boolean flag to differentiate
        this.title = "Unknown";
        this.pages = 0;
        this.publicationYear = publicationYear;
    }

    //Getter for the title
    public String getTitle() {
        return title;
    }

    //Getter for the number of pages
    public int getPages() {
        return pages;
    }

    //Getter for the publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    //Setter for the title
    public void setTitle(String title) {
        this.title = title;
    }

    //Setter for the number of pages
    public void setPages(int pages) {
        this.pages = pages;
    }

    //Setter for the publication year
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    //Overriding the toString method to display the book details
    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + pages + ", Publication Year: " + publicationYear;
    }
}

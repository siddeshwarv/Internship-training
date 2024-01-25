public class Book{
    private String title;
    private String author;
    private double rating;
    private double price;
    public Book(String title,String author,double rating,double price){
        this.title =  title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }
    public Book(Book book){
        this.title = book.title;
        this.author = book.author;
        this.rating = book.rating;
        this.price = book.price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
        Book book3 = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99);
        Book copyBook1 = new Book(book1);
        Book copyBook2 = new Book(book3);
        System.out.println(book1.getAuthor());
        System.out.println(book3.getRating());
    
    }
    

}
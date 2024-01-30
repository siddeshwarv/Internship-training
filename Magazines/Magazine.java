package Magazines;
public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publisherYear;
    public Magazine(String title,String publisher,int issueNumber,int publisherYear){
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublisherYear(publisherYear);
    }
    
    public Magazine(Magazine m){
        setTitle(m.title);
        setPublisher(m.publisher);
        setIssueNumber(m.issueNumber);
        setPublisherYear(m.publisherYear);
    }
    
    
   
    public static boolean isNullOrBlank(String input){
        return (input == null || input.isBlank());
    } 
    

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        this.title = title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        if(publisher == null || publisher.isBlank()){
            throw new IllegalArgumentException("Publisher cannot be null or blank");
        }
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if(issueNumber <= 0 ){
            throw new IllegalArgumentException("Issue Number must be greater than 0.");
        }
        this.issueNumber = issueNumber;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        if(publisherYear<0){
            throw new IllegalArgumentException("Publisher Year cannot be less tha 0.");
        }
        this.publisherYear = publisherYear;
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Movie {
    private String name;
    private String production;
    private double rating;
    public Movie(String name,String production,double rating){
        this.name=name;
        this.production=production;
        this.rating=rating;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return this.production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    
}

public class Store {
    private static ArrayList<Movie> movies;

    public static void main(String[] args) {
        Movie[] mmovies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindlers List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for(int i=0;i<mmovies.length;i++){
            movies.add(mmovies[i]);
        }
    
        printStore();
        getMovie(2);
        setMovie(3,new Movie("dsfa","asdfa",3.4));


        }
        public static void printStore(){
            for(int i=0;i<movies.size();i++){
                Movie m = movies.get(i);
                System.out.println("Name: "+m.getName()+" Production: "+m.getProduction()+"Rating: "+m.getRating());
            }

        }
        public static Movie getMovie(int index) {
            return movies.get(index);
        }
        public static void setMovie(int index, Movie movie) {
            movies.get(index).setName(movie.getName());
            movies.get(index).setProduction(movie.getProduction());
            movies.get(index).setRating(movie.getRating());; 
        }
    
    
        public void addMovie(Movie movie) {
            // TODO
            movies.add(new Movie("pawan kalya","bjjdkl",4.2));

        }
    
}

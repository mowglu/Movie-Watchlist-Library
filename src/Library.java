import java.util.ArrayList;
import java.util.*;

public class Library {
    private List<Movie> aMovielist = new ArrayList<Movie>();
    private List<Watchlist> aListofWatchlist = new ArrayList<Watchlist>();

    public void addMovie(Movie pMovie){
        aMovielist.add(pMovie);
    }
    public void addWatchlist(Watchlist pWatchlist){
        aListofWatchlist.add(pWatchlist);
    }
    public void removeMovie(int indexToRemove){
        aMovielist.remove(indexToRemove);
    }
    public void removeWatchlist(int indexToRemove){
        aListofWatchlist.remove(indexToRemove);
    }
}

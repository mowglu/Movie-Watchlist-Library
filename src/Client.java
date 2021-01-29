import java.util.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Executing the main method...");
        ReqdInfo reqdInfo1 = new ReqdInfo("Tenet","English","EVO");
        Information information1 = new Information(reqdInfo1);
        information1.addCustomInfo("","");
        Movie movie1 = new Movie("T.MP4",information1);
        information1.addCustomInfo("","hello");
        Information information2 = movie1.getInfo();

        information2.addCustomInfo("","");
        information2.removeCustomInfo(0);
        information2.removeCustomInfo(0);
        information1.addCustomInfo("bruuh","hello");
        information1.removeCustomInfo(0);
        information1.removeCustomInfo(0);
        information1.changeCustomInfo("a","b",0);

        ReqdInfo reqdInfo3 = new ReqdInfo("Interstellar","French","YIFY");
        Information information3 = new Information(reqdInfo3);
        information3.addCustomInfo("c","d");
        Movie movie2 = new Movie("I.MKV",information3);
        ReqdInfo reqdInfo4 = new ReqdInfo("The Prestige","Italian","YIFY");
        Information information4 = new Information(reqdInfo4);
        Movie movie3 = new Movie("P.MKV",information4);
        List<Movie> movielist = new ArrayList<>();
        movielist.add(movie1);
        movielist.add(movie2);
        movielist.add(movie3);

        Watchlist watchlist1 = new Watchlist("MyFirstWatchlist",movielist);
        watchlist1.changeName("CoolWatchList");
        List<Movie> movielist2;

        movielist2 = watchlist1.removeFirst();

        Watchlist watchlist2 = new Watchlist("MySecond",movielist2);
        watchlist2.removeFirst();

        Movie movie4 = watchlist1.accessMovie(0);
        System.out.println(movie4.getVideoFormat());
        System.out.println(movie4.isValid());
        System.out.println(watchlist1.accessMovie(0));

        watchlist1.getInfo();

        Library library1 = new Library();
        library1.addWatchlist(watchlist1);
        library1.addMovie(movie1);
    }
}

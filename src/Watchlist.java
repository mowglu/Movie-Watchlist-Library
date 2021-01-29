import java.util.*;

public class Watchlist {
    private String aWatchlistName;
    private List<Movie> aMovielist = new ArrayList<>();

    public Watchlist(String pWatchlistName,List<Movie> pMovielist){
        aWatchlistName = pWatchlistName;
        aMovielist = pMovielist;
    }

    public String changeName(String nameToChange){
        aWatchlistName = nameToChange;
        return aWatchlistName;
    }

    public List<Movie> removeFirst(){
        aMovielist.remove(0);
        List<Movie> copyMovielist = new ArrayList<>();
        for(Movie c : aMovielist)
            copyMovielist.add(c);
        return copyMovielist;
    }

    public Movie accessMovie(Integer indexToAccess){
        // Nothing is changeable in movie, so this is safe
        return aMovielist.get(indexToAccess);
    }

    public void getInfo(){
        int numTotalValid = 0;
        List<String> PublishingStudioList_Dupl = new ArrayList<>();
        List<String> LanguageList_Dupl = new ArrayList<>();

        for(Movie c : aMovielist){
            if (c.isValid())
                numTotalValid += 1;
            Information c_info = c.getInfo();
            ReqdInfo req_info = c_info.aReqdInfo;
            PublishingStudioList_Dupl.add(req_info.aPublishingStudio);
            LanguageList_Dupl.add(req_info.aLanguage);
        }
        List<String> PublishingStudioList = new ArrayList<>(new HashSet<>(PublishingStudioList_Dupl));
        List<String> LanguageList = new ArrayList<>(new HashSet<>(LanguageList_Dupl));
        System.out.println(PublishingStudioList);
        System.out.println(LanguageList);
        System.out.println(numTotalValid);
    }
}

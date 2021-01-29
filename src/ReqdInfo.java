public class ReqdInfo {
    final private String aTitle;
    //Two attributes below protected because they need to be accessible by watchlist
    final protected String aLanguage;
    final protected String aPublishingStudio;

    public ReqdInfo(String pTitle, String pLanguage, String pPublishingStudio) {
        aTitle = pTitle;
        aLanguage = pLanguage;
        aPublishingStudio = pPublishingStudio;
    }
}

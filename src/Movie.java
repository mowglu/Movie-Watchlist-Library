import java.io.*;
import java.util.*;

public class Movie {
    // File path characterizing a unique movie. The file path cannot change once an object is created
    final private String aFilePath;
    private File aMovieFile;
    // Video format can ONLY be one of the following choices
    final private videoFormat aVideoFormat;
    private enum videoFormat {MP4, MOV, WMV, AVI, FLV, MKV}
    // Attribute of information - holding private and custom information classes in themselves
    private Information aInformation;

    private String checkformat(String pFilePath) {
        //must be longer than or equal to 5
        assert pFilePath.length() >= 5;
        // List of invalid file/directory characters excluding \
        List<String> invalidList = Arrays.asList("/", ":","*","\"","<",">","|");
        // For initial drive substring (For example C:\\, the : doesn't count as invalidity)
        pFilePath = pFilePath.substring(0,3).replace(":\\","\\")+pFilePath.substring(3);
        for (String invalidChar:invalidList) {
            if(pFilePath.contains(invalidChar)){
                throw new AssertionError("This is an invalid file path");
            }
        }
        return pFilePath.substring(pFilePath.length() - 4);
    }

    public Movie(String pFilePath, Information pInformation){
        aFilePath = pFilePath;
        aMovieFile = new File(pFilePath);
        String ext = checkformat(pFilePath);
        switch (ext) {
            case ".MP4":
                aVideoFormat = videoFormat.MP4;
                break;
            case ".MOV":
                aVideoFormat = videoFormat.MOV;
                break;
            case ".WMV":
                aVideoFormat = videoFormat.WMV;
                break;
            case ".AVI":
                aVideoFormat = videoFormat.AVI;
                break;
            case ".FLV":
                aVideoFormat = videoFormat.FLV;
                break;
            case ".MKV":
                aVideoFormat = videoFormat.MKV;
                break;
            default:
                throw new AssertionError("This is an invalid extension type");
        }
        aInformation = pInformation;
    }

    public videoFormat getVideoFormat(){
        return aVideoFormat;
        }

    public Information getInfo(){
        //using copy constructor
        Information copyInformation = new Information(aInformation);
        return copyInformation;
    }

    public boolean isValid(){
        if (aMovieFile.exists()){
            return !aMovieFile.isDirectory();
        }
        return false;
    }
}

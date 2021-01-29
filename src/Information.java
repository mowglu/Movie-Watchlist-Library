import java.util.ArrayList;
import java.util.List;


public class Information {

    protected ReqdInfo aReqdInfo;
    private List<CustomInfo> aCustomInfo = new ArrayList<>();
    public Information(ReqdInfo pReqdInfo){
        aReqdInfo = pReqdInfo;
    }

    public void addCustomInfo(String key, String value) {
        CustomInfo pCustomInfo = new CustomInfo(key, value);
        aCustomInfo.add(pCustomInfo);
    }

    public void removeCustomInfo(int indexToRemove) {
        aCustomInfo.remove(indexToRemove);
    }

    public void changeCustomInfo(String key, String value, int indexToChange) {
        CustomInfo pCustomInfo = new CustomInfo(key, value);
        aCustomInfo.set(indexToChange,pCustomInfo);
    }

    //Copy Constructor
    public Information(Information aInformation){
        aReqdInfo = aInformation.aReqdInfo;
        List<CustomInfo> tempCustomList = new ArrayList<>();
        for(CustomInfo c : aInformation.aCustomInfo)
            tempCustomList.add(c);
        aCustomInfo = tempCustomList;
    }
}


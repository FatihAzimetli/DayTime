package DroneControlSystemSimpleProject;

import java.util.ArrayList;
import java.util.List;

public class Airplane {

    private List<String> engineControlList = new ArrayList<>();
    private List<String> flapsControlList = new ArrayList<>();
    private List<String> rudderControlList = new ArrayList<>();

    public Airplane() {
        initializeControls();
    }

    private void initializeControls() {
        for (int i = 0; i < 6; i++) {
            engineControlList.add("Motor çalışıyor");
            flapsControlList.add("Flaps kapalı");
            rudderControlList.add("Dümen düz");
        }
    }

    public List<String> getEngineControlList() {
        return engineControlList;
    }

    public List<String> getFlapsControlList() {
        return flapsControlList;
    }

    public List<String> getRudderControlList() {
        return rudderControlList;
    }

    public void setEngineControlList(List<String> engineControlList) {
        this.engineControlList = engineControlList;
    }

    public void setFlapsControlList(List<String> flapsControlList) {
        this.flapsControlList = flapsControlList;
    }

    public void setRudderControlList(List<String> rudderControlList) {
        this.rudderControlList = rudderControlList;
    }
}

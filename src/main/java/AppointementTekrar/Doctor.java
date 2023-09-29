package AppointementTekrar;


import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private  int id;
    private String name;
    private  String branch; //brans

    private List<String> dates=new ArrayList<>();


    public Doctor(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }
}

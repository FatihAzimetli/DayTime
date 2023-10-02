package BusCompany;

public class Personnel {
    private String name;
    private String role;
    private double salary;
    public Personnel(String name, String role, double salary){
        this.name =name;
        this.role = role;
        this.salary = salary;
    }
    public double calculateSalary(){
        //maas hesapla
        return salary;
    }
    public void performDuty(){
        //görev yap
    }
}



package AppointementTekrar;

public class Appointment {
    private static int counter =99;
    private  int appointmentNo;

    private String name;

    private Doctor doctor;
    private String date;

    public Appointment(String name, Doctor doctor, String date) {
        counter++;
        this.appointmentNo=counter;
        this.name = name;
        this.doctor = doctor;
        this.date = date;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Appointment.counter = counter;
    }

    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

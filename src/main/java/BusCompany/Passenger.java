package BusCompany;

public class Passenger {
    private String name;
    private double ticketPrice;
    private String departureCity;
    private String arrivalCity;
    private Bus bookedBus;
    public Passenger(String name, double ticketPrice,String departureCity, String arrivalCity){
        this.name = name;
        this.ticketPrice =ticketPrice;
        this.departureCity =departureCity;
        this.arrivalCity = arrivalCity;
    }
    public void bookTicket(Bus bus) {
        // Bilet satın alma işlemi
        bookedBus = bus;
        bus.transportPassenger(this);
    }

}


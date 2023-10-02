package BusCompany;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private final TicketingSystem ticketingSystem;
    private String city;
    private List<Personnel> employees;
    private TicketingSystem ticekettinSystem;
    public Office(String city){
        this.city = city;
        this.employees = new ArrayList<>();
        this.ticketingSystem = new TicketingSystem();
    }
    public void addEmployee(Personnel employee) {
        employees.add(employee);
    }

    public void sellTicket(Passenger passenger, Bus bus) {
        ticketingSystem.sellTicket(passenger, bus);
    }

    private class TicketingSystem {
        public void sellTicket(Passenger passenger, Bus bus) {
        }
    }
}



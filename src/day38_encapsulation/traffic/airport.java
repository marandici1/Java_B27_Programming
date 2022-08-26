package day38_encapsulation.traffic;

import day38_encapsulation.flight.flightTicket;

public class airport {
    public static void main(String[] args) {
        flightTicket ticket = new flightTicket("first", "Chicago", "Virginia");
        System.out.println(ticket.getType());
        System.out.println(ticket.getDeparture());
        System.out.println(ticket.getArrival());

        flightTicket ticket2 = new flightTicket("flying", "New York", "Canada");
        System.out.println(ticket2.getType());

        ticket2.setType("economy");
        System.out.println(ticket2.getType());
    }
}

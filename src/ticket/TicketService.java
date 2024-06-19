package ticket;

import java.util.Date;

public class TicketService {

    Ticket bookTicket(Row[] seats, String movieName, Date date) {
      Ticket ticket=new Ticket();
      ticket.name=movieName;
      ticket.time=date;
      return ticket;
    }

//    public Ticket getbookTicket(Row[] row, String name, int time, int noOfSeats) {
//        Ticket bookticket = new Ticket();
//        bookticket.name = "Rathnam";
//        bookticket.noOfSeats = 20;
//        bookticket.time = 04 - 06 - 2024;
//        bookticket.row = row;
//
//        Row row1 = new Row();
//        row1.rowNumber = "A2";
//        row1.seatNumber = new int[]{2, 8};
//
//        return bookticket;
//    }

}
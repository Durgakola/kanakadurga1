package ticketbooking;

import collectiondemo.Restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TicketService {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> listSizePredicate = (index, size) -> index < size;

        Predicate<String> byName =  (status) ->status.equals("Booked");
        List<Ticket> ticketList=new ArrayList<>();

        Ticket ticket=new Ticket();
        ticket.pnrNo="908990";
        ticket.status="Booked";

        Ticket ticket1=new Ticket();
        ticket1.pnrNo="12345";
        ticket1.status="Success";

        Ticket ticket2=new Ticket();
        ticket2.pnrNo="76543";
        ticket2.status="Blocked";

        ticketList.add(ticket);
        ticketList.add(ticket1);
        ticketList.add(ticket2);

        for(int i=0; listSizePredicate.test(i,ticketList.size()); i++){
            Ticket tick=ticketList.get(i);
            System.out.println("Ticket PNRNo "+tick.pnrNo);
            System.out.println("Ticket Status "+tick.status);
            System.out.println("_____________________________________________________");
        }

        Iterator<Ticket> ticketIterator=ticketList.iterator();
        for(;ticketIterator.hasNext();){
            Ticket tick=ticketIterator.next();
            if(byName.test(tick.pnrNo))
                System.out.println(" Itreator pnrNo "+tick.pnrNo);
            if (byName.test(tick.status)) {
                System.out.println("Itreator status " + tick.status);


            }

        }
    }
}

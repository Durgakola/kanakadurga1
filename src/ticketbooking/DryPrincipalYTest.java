package ticketbooking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DryPrincipalYTest {
    public void tecketStatus(List<Ticket> ticketList,Predicate<Ticket> predicate){
        Iterator<Ticket> iterator= ticketList.iterator();
        while(iterator.hasNext())
        {
            Ticket ticket=iterator.next();
            if(predicate.test(ticket)){
                System.out.println("Ticket status "+ticket.status);
            }

        }

    }
    public static void main(String[] args) {

        Predicate<Ticket> statusPredicate=(ticket) -> ticket.status.equals("Success");
        Predicate<Ticket>failedPredicate =(ticket) -> ticket.status.equals("Failed");
        Predicate<Ticket> blockedPredicate=(ticket) -> ticket.status.equals("Blocked");


        Ticket ticket=new Ticket();
        ticket.pnrNo="12345";
        ticket.status="Blocked";

        Ticket ticket1=new Ticket();
        ticket1.pnrNo="88888";
        ticket1.status="Success";

        Ticket ticket2=new Ticket();
        ticket2.pnrNo="99999";
        ticket2.status="Failed";

        List<Ticket>ticketList=new ArrayList<>();

        ticketList.add(ticket);
        ticketList.add(ticket1);
        ticketList.add(ticket2);

        DryPrincipalYTest dryPrincipalYTest=new DryPrincipalYTest();
        dryPrincipalYTest.tecketStatus(ticketList,statusPredicate);
        dryPrincipalYTest.tecketStatus(ticketList,failedPredicate);
        dryPrincipalYTest.tecketStatus(ticketList,blockedPredicate);
    }
}

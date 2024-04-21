package ticketbooking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class VoterTest {
    public void getVoterStatus(List<Voter> voterList,Predicate<Voter> voterPredicate){
        Iterator<Voter> iterator= voterList.iterator();
        while (iterator.hasNext())
        {
            Voter voter=iterator.next();
            if(voterPredicate.test(voter)){
                System.out.println("Voter Status :"+voter.voterStatus);
            }
        }
    }


    public static void main(String[] args) {

        Predicate<Voter> notVoted=(voter) -> voter.voterStatus.equals("No");
        Predicate<Voter> voted=(voter) -> voter.voterStatus.equals("Yes");



        Voter voter=new Voter();
        voter.voterId="1";
        voter.voterName="Bashir";
        voter.voterStatus="No";

        Voter voter1=new Voter();
        voter1.voterId="2";
        voter1.voterName="Sathvik";
        voter1.voterStatus="Yes";

        Voter voter2=new Voter();
        voter2.voterId="3";
        voter2.voterName="Kanaka durga";
        voter2.voterStatus="No";

        Voter voter3=new Voter();
        voter3.voterId="4";
        voter3.voterName="saraswathi";
        voter3.voterStatus="Yes";

        List<Voter> voterList=new ArrayList<>();
         voterList.add(voter);
         voterList.add(voter1);
         voterList.add(voter2);
         voterList.add(voter3);

         VoterTest voterTest=new VoterTest();
         voterTest.getVoterStatus(voterList,notVoted);
         voterTest.getVoterStatus(voterList,voted);


    }
}

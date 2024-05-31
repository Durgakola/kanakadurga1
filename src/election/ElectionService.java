package election;

public class ElectionService {
    public State getState() {
        State tg = new State();
        tg.stateName = "TG";

        Constituency[] constituencies = new Constituency[2];
        Constituency constituency = new Constituency();
        constituency.name = "Hyd";
        constituency.noOfVoters = 100000;
        constituency.type = "MP";
        constituency.state = tg;
        tg.constituencies=constituencies;
        constituencies[0] = constituency;
        return tg;
    }
}

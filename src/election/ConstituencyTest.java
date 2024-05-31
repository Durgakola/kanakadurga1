package election;

public class ConstituencyTest {
    public static void main(String[] args) {
        ElectionService electionService=new ElectionService();
        State state= electionService.getState();
        System.out.println(state.constituencies[0].name);
        System.out.println(state.constituencies[0].noOfVoters);
        System.out.println(state.constituencies[0].type);


    }
}


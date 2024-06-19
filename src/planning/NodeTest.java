package planning;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {
    public static void main(String[] args) {
        Node divisionFinance=new Node();

        divisionFinance.key="DIVISION";
        divisionFinance.label=new String("Finance");

        List<Node> childofDivisionFinance=new ArrayList<>();
        Node payrole=new Node();
        payrole.key="Department";
        payrole.label="Payrol";

        Node generalFinance=new Node();
        generalFinance.key="Department";
        generalFinance.label="generalFinance";
        Node procurement=new Node();
        procurement.key="Department";
        procurement.label="procurement";
        childofDivisionFinance.add(payrole);
        childofDivisionFinance.add(generalFinance);
        childofDivisionFinance.add(procurement);

        divisionFinance.child=childofDivisionFinance;




        List<Node> childOfProcurement=new ArrayList<>();

        Node procurementManager=new Node();
        procurementManager.key="department";
        procurementManager.label="Procurement Manager";
        Node assistantProcurementManager=new Node();
        assistantProcurementManager.key="department";
        assistantProcurementManager.label="assistantProcurementManager";

        Node procurementExecuter=new Node();
        procurementExecuter.key="department";
        procurementExecuter.label="Procurement Executer";

        childOfProcurement.add(procurementManager);
        childOfProcurement.add(assistantProcurementManager);
        childOfProcurement.add(procurementExecuter);

        procurement.child=childOfProcurement;

        System.out.println(divisionFinance);



    }
}

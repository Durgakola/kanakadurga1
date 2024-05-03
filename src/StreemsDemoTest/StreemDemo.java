package StreemsDemoTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class StreemDemo {

    public static void main(String[] args) {
        AccountService accountService=new AccountService();
        Map<Account,Account>accountMap=accountService.getAccountSummary();


        Account account=new Account();
        account.accountNO="222222222";
        Account fullAccount=accountMap.get(account);
        System.out.println(fullAccount.accountNO);



        Predicate<AccountDetails> creditTypePrediacte=
                (accountDetails)->accountDetails.type.equals("Credit");

       List<AccountDetails> creditAccountDetails = fullAccount.accountDetails.stream().
         filter(accountDetails -> creditTypePrediacte.test(accountDetails))  //filter(accountDetails->accountDetails.type.equals("Credit");
               .collect(Collectors.toList());
        //filter in any reference name in test in sameReference.


        System.out.println("Stream Credit account details : "+creditAccountDetails);




       List<AccountDetails> normalForcreditAccountDetails=new ArrayList<>();
        for(int i=0;i<fullAccount.accountDetails.size();i++){
            if(fullAccount.accountDetails.get(i).type.equals("Credit")){
                normalForcreditAccountDetails.add(fullAccount.accountDetails.get(i));
            }
        }
        System.out.println("Normal For Loop Credit Account details " +normalForcreditAccountDetails);
        System.out.println("-----------------------------------------------------------------------------------");

        //streems:
        Map<String,Double>groupBytypeSum=fullAccount.accountDetails.stream()
                .collect(groupingBy(AccountDetails::getType,
                        summingDouble(AccountDetails::getAmount)));
        System.out.println(groupBytypeSum);



        //normalforloop:
        Map<String,Double> groupBynormalMap=new HashMap<>();
        double creditSum=0;
        double debitSum=0;

        for(int i=0; i<fullAccount.accountDetails.size();i++){
            if(fullAccount.accountDetails.get(i).type.equals("Credit")) {
                AccountDetails details = fullAccount.accountDetails.get(i);
                creditSum = creditSum + details.getAmount();
            }
            else if(fullAccount.accountDetails.get(i).type.equals("Debit")){
                AccountDetails details=fullAccount.accountDetails.get(i);
                debitSum=debitSum+details.getAmount();
            }
        }
        System.out.println("DebitSum :"+debitSum+" CreditSum :"+creditSum);

    }
}

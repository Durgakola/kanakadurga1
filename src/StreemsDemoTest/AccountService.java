package StreemsDemoTest;

import java.util.*;

public class AccountService {
    public Map<Account, Account> getAccountSummary() {
        Map<Account, Account> accountMap = new HashMap<>();


        Address bankaddress = new Address();
        bankaddress.area = "Kukatpalli";
        bankaddress.flatNo = "6/R";
        bankaddress.pincode = "522409";
        bankaddress.street = "KPHB";
        bankaddress.state="Andhra";

        Address useraddress = new Address();
        useraddress.area = "Atchampet";
        useraddress.flatNo = "7/R";
        useraddress.pincode = "589409";
        useraddress.street = "gandhibommalu";
        useraddress.state="Andhra";

        Account account = new Account();
        account.accountNO = "222222222";
        account.balance = 700089.2;
        account.IFSCcode = "SBIN0005678";
        account.address = bankaddress;


        User user = new User();
        user.firstName = "Kola";
        user.lastName = "Kanaka Durga";
        user.dob = "24-2-2024";
        user.aadharNo = "123 456 890";
        user.pan = "RTY890GH5";
        user.mobileNo = "9391976191";
        account.user=user;





        AccountDetails accountDetails = new AccountDetails();
        accountDetails.amount = 3000;
        accountDetails.description = "shooping";
        accountDetails.transactionDate = new Date();
        accountDetails.valueDate = new Date();
        accountDetails.type = "Credit";



        AccountDetails accountDetails1 = new AccountDetails();
        accountDetails1.amount = 2000;
        accountDetails1.description = "shopping";
        accountDetails1.transactionDate = new Date();
        accountDetails1.valueDate = new Date();
        accountDetails1.type = "Debit";


        AccountDetails accountDetails2 = new AccountDetails();
        accountDetails2.amount = 2000;
        accountDetails2.description = "shopping";
        accountDetails2.transactionDate = new Date();
        accountDetails2.valueDate = new Date();
        accountDetails2.type = "Debit";




        List<AccountDetails> accountDetailsList = new ArrayList<>();
        accountDetailsList.add(accountDetails);
        accountDetailsList.add(accountDetails1);
        accountDetailsList.add(accountDetails2);
        account.accountDetails=accountDetailsList;

        accountMap.put(account,account);
        return accountMap;

    }

}

package StreemsDemoTest;

import java.util.List;
import java.util.Objects;

public class Account {

    public String accountNO;
    public double balance;

    public String IFSCcode;
    public Address address;
    public User user;
    public List<AccountDetails> accountDetails;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return accountNO.equals(account.accountNO);
    }

    @Override
    public int hashCode() {
        return this.accountNO.hashCode();
    }
}

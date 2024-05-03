package StreemsDemoTest;

import java.util.Date;

public class AccountDetails {
    public Date transactionDate;
    public Date valueDate;
    public double amount;
    public String description;

    public String type;
    public String accountNo;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "transactionDate=" + transactionDate +
                ", valueDate=" + valueDate +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", accountNo='" + accountNo + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

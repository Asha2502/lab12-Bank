package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<BankAccount> bankAccList;

    public User(int userId, String name, List<BankAccount> bankAccList) {
        this.userId = userId;
        this.name = name;
        this.bankAccList = bankAccList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankAccount> getBankAccList() {
        return bankAccList;
    }

    public void setBankAccList(List<BankAccount> bankAccList) {
        this.bankAccList = bankAccList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", bankAccList=" + bankAccList.toString() +
                '}';
    }
}

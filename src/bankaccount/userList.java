package bankaccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class userList {
    public ArrayList<User> userList = new ArrayList<>();
    public ArrayList init() {
        userList.add(new User(1, "Мария", Arrays.asList(new BankAccount(1, -1000), new BankAccount(5, 7000))));
        userList.add(new User(2, "Матвей",  List.of(new BankAccount(2, -5000))));
        userList.add(new User(3,"Тимофей", Arrays.asList(new BankAccount(3, 3000), new BankAccount(7, -3000))));
        userList.add(new User(4, "Роман", List.of(new BankAccount(4, 6000))));
        userList.add(new User(5, "Иван", Arrays.asList(new BankAccount(8, 5000), new BankAccount(6, -1000))));
        return userList;
    }
}

package tests;

import bankaccount.BankAccount;
import bankaccount.User;
import bankaccount.UserOperation;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UserOperationTest {

    @org.junit.jupiter.api.Test
    void usersWithPositiveBalance() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Мария", Arrays.asList(new BankAccount(1, -1000), new BankAccount(5, 7000))));
        users.add(new User(2, "Матвей",  List.of(new BankAccount(2, 2000), new BankAccount(3, 1000))));
        Assertions.assertIterableEquals( users, UserOperation.usersWithPositiveBalance(users));
    }

    @org.junit.jupiter.api.Test
    void usersTop3() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Мария", Arrays.asList(new BankAccount(1, -1000), new BankAccount(5, 7000))));
        users.add(new User(2, "Матвей",  List.of(new BankAccount(2, 2000), new BankAccount(3, 1000))));
        users.add(new User(2, "Матвей",  List.of(new BankAccount(2, 2000), new BankAccount(3, 1000))));
        Assertions.assertIterableEquals( users, UserOperation.usersTop3(users));
    }

    @org.junit.jupiter.api.Test
    void usersWithNegativeBalance() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Мария", Arrays.asList(new BankAccount(1, -1000), new BankAccount(5, -7000))));
        users.add(new User(2, "Матвей",  List.of(new BankAccount(2, -2000), new BankAccount(3, -1000))));
        users.add(new User(2, "Матвей",  List.of(new BankAccount(2, -2000), new BankAccount(3, -1000))));
        Assertions.assertIterableEquals( users, UserOperation.usersWithNegativeBalance(users));
    }
}
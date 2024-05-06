package bankaccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserOperation {
    public static List<User> usersWithPositiveBalance(List<User> list) {
        UserOperationInterface usersWithPositiveBalance = userList -> {
            List<User> result = new ArrayList<>();
            for (User user : userList) {
                for (BankAccount account : user.getBankAccList()) {
                    if (account.getBalance() > 0) {
                        result.add(user);
                        break;
                    }
                }
            }
            return result;
        };
        return usersWithPositiveBalance.apply(list);
    }

    public static List<User> usersTop3(List<User> list) {
        UserOperationInterface usersTop3 = userList -> {
            userList.sort(Comparator.comparingDouble((User u) -> u.getBankAccList().stream()
                    .mapToInt(BankAccount::getBalance).sum()).reversed());
            return userList.subList(0, Math.min(userList.size(), 3));
        };
        return usersTop3.apply(list);
    }

    public static List<User> usersWithNegativeBalance(List<User> list) {
        UserOperationInterface usersWithPositiveBalance = userList -> {
            List<User> result = new ArrayList<>();
            for (User user : userList) {
                for (BankAccount account : user.getBankAccList()) {
                    if (account.getBalance() < 0) {
                        result.add(user);
                        break;
                    }
                }
            }
            return result;
        };
        return usersWithPositiveBalance.apply(list);
    }
}
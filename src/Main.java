import bankaccount.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        userList ul = new userList();
        ArrayList<User> list = ul.init();
        UserOperation func = new UserOperation();
        List<User> usersWithPositiveBalanceList = func.usersWithPositiveBalance(list);
        System.out.println("Список пользователей, у которых есть хотя бы один счет с положительным балансом:");
        for (User user : usersWithPositiveBalanceList) {
            System.out.println(user);
        }
        System.out.println();

        List<User> usersTop3List = func.usersTop3(list);
        System.out.println("Список, состоящий из трех пользователей, имеющих наибольшую сумму денег на их счетах:");
        for (User user : usersTop3List) {
            System.out.println(user);
        }
        System.out.println();

        List<User> usersWithNegativeBalanceList = func.usersWithNegativeBalance(list);
        System.out.println("Список пользователей, у которых есть хотя бы один счет с отрицателньым балансом:");
        for (User user : usersWithNegativeBalanceList) {
            System.out.println(user);
        }
    }
}

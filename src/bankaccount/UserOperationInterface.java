package bankaccount;

import java.util.List;

@FunctionalInterface
public interface UserOperationInterface {
    List<User> apply(List<User> userList);
}

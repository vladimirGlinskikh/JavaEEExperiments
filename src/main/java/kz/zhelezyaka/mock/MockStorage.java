package kz.zhelezyaka.mock;

import kz.zhelezyaka.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MockStorage {
    private static final MockStorage storage;

    static {
        storage = new MockStorage();
    }

    private List<User> users;

    private MockStorage() {
        this.users = new ArrayList<>();
        User user = new User("Vladimir", "qwerty99", LocalDate.parse("1990-08-08"));
        User user1 = new User("Svetlana", "qwerty98", LocalDate.parse("1991-06-09"));
        User user2 = new User("Vasiliy", "qwerty97", LocalDate.parse("1992-07-10"));

        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public static MockStorage storage() {
        return storage;
    }

    public List<User> users() {
        return users;
    }
}

package kz.zhelezyaka.repositories;

import kz.zhelezyaka.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {
    private List<User> users;

    public UsersRepositoryInMemoryImpl() {
        this.users = new ArrayList<>();
        User user = new User("Vladimir", "qwerty99", LocalDate.parse("1990-08-08"));
        User user1 = new User("Svetlana", "qwerty98", LocalDate.parse("1991-06-09"));
        User user2 = new User("Vasiliy", "qwerty97", LocalDate.parse("1992-07-10"));

        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }
}

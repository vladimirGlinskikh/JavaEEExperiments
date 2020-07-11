package kz.zhelezyaka.repositories;

import kz.zhelezyaka.mock.MockStorage;
import kz.zhelezyaka.models.User;

import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    @Override
    public List<User> findAll() {
        return MockStorage.storage().users();
    }

    @Override
    public void save(User user) {
        MockStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name, String password) {
        for (User user : MockStorage.storage().users()) {
            if (user.getName().equals(name) &&
                    user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

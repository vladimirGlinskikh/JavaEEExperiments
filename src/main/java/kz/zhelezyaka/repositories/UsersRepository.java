package kz.zhelezyaka.repositories;

import kz.zhelezyaka.models.User;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
}

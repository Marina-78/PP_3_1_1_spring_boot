package com.github.pp_3_1_1_spring_boot.service;


import com.github.pp_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void editUser(User user);

    void removeUser(Long id);

}

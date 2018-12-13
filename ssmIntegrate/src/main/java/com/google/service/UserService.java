package com.google.service;


import com.google.domain.User;

public interface UserService {
    User queryUserById(Long id);

    void deleteUserById(Long id);
}

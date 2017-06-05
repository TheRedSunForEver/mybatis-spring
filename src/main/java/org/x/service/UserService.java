package org.x.service;

import org.x.domain.User;

public interface UserService {
    User findUserById(int id);
    int countAll();
}

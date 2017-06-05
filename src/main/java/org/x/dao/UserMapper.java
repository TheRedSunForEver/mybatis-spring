package org.x.dao;

import org.apache.ibatis.annotations.Select;
import org.x.domain.User;

public interface UserMapper {
    User findUserById(int id);

    @Select("select count(*) cnt from user")
    int countAll();
}

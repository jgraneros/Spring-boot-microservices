package com.microservices.user.service;

import com.microservices.user.VO.ResponseTempleateVO;
import com.microservices.user.entity.User;

public interface UserService {
    User saveUser(User user);
    ResponseTempleateVO getUserWithDepartment(Long userId);
}

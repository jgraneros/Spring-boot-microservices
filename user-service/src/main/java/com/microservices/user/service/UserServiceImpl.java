package com.microservices.user.service;

import com.microservices.user.VO.Department;
import com.microservices.user.VO.ResponseTempleateVO;
import com.microservices.user.entity.User;
import com.microservices.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        log.info("Inside saveUser method of UserServiceImpl");
        return userRepository.save(user);
    }

    @Override
    public ResponseTempleateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment method of UserServiceImpl");

        ResponseTempleateVO vo = new ResponseTempleateVO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}

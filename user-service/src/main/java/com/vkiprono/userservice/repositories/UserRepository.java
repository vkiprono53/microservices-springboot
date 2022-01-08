package com.vkiprono.userservice.repositories;

import com.vkiprono.userservice.DTOs.ResponseTemplateDTO;
import com.vkiprono.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long userId);
    User findByDepartmentId(Long departmentId);

}

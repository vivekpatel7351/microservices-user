package com.lcwd.user.service.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.user.service.entity.User;

public interface UserReposetory extends JpaRepository<User, String> {

}

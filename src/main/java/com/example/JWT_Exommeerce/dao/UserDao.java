package com.example.JWT_Exommeerce.dao;

import com.example.JWT_Exommeerce.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}

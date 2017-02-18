package com.zhl.spring.boot.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer>
{
    public List<User> findByName(String name);  
}

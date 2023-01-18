package com.driver.repositories;

import com.driver.models.Image;
import com.driver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    //User findByUsername(String username);
}

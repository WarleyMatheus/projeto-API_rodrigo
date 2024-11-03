package com.wmsoftware.cefetsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wmsoftware.cefetsis.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

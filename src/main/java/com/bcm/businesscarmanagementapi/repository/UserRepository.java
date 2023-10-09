package com.bcm.businesscarmanagementapi.repository;

import com.bcm.businesscarmanagementapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

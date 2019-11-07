package com.halogo.codingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.halogo.codingTest.entity.UserRecord;

/**
 * aditya
 */
@Repository
public interface UserRecordRepository extends JpaRepository<UserRecord, Integer>{

	UserRecord findById(Integer id);
}

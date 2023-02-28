package com.karuna.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karuna.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff, Long> {

}

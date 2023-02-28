package com.karuna.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karuna.entity.Receiver;

public interface ReceiverRepo extends JpaRepository<Receiver, Long> {

}

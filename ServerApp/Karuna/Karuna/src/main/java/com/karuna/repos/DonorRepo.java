package com.karuna.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karuna.dto.DonorRegisterDto;
import com.karuna.entity.Donor;




public interface DonorRepo extends JpaRepository<Donor,Long> {

	DonorRegisterDto save(DonorRegisterDto donor);

}

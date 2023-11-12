package com.example.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.addressservice.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT ma.id,ma.lane1,ma.lane2, ma.state, ma.zip FROM microservices.address ma\r\n"
			+ "join microservices.employee me\r\n"
			+ "where me.id=:employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") int id);

}

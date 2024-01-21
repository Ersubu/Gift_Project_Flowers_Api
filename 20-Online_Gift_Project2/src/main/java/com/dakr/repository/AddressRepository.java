package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

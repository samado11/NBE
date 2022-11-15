package com.intercom.cib.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.intercom.cib.model.Customer;


import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}

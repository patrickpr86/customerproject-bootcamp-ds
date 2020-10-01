package com.patrick.customerproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrick.customerproject.entites.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}

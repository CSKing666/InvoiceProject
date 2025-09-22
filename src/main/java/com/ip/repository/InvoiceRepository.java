package com.ip.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ip.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
	
}

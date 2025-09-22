package com.ip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ip.model.Invoice;
import com.ip.repository.InvoiceRepository;

@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepository repo;

	public List<Invoice> getItems(Invoice invoice) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}

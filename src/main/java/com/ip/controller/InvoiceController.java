package com.ip.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ip.model.Invoice;
import com.ip.service.InvoiceService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class InvoiceController {
	@Autowired
	private InvoiceService service;
	@GetMapping("/invoice")
	public Map<String, String> getItems(@ModelAttribute Invoice invoice) {
        Map<String, String> status = new HashMap<>();
		List<Invoice> list = service.getItems(invoice);
		status.put("name", list.get(0).getCustomerName());
		status.put("price", String.valueOf(list.get(0).getPrice()));
		return status;
	}
}

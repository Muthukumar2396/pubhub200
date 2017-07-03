package com.muthu.bookapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muthu.bookapplication.model.OrderItem;
import com.muthu.bookapplication.repository.BookRepository;
import com.muthu.bookapplication.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private BookRepository bookRepository;

	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}

}

package com.muthu.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.bookapplication.model.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>  {

}

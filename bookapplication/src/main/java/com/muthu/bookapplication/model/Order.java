package com.muthu.bookapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;



@Data
	@ToString(exclude = "orderItems") 
	@Entity
	@Table(name = "orders")
	public class Order {

		@Id
		@GeneratedValue
		@Column(name = "id")
		private Long id;

		@ManyToOne
		@JoinColumn(name = "user_id")
		private User user;

		//@Formula("fn_get_order_amount(id)")
		@Column(name = "total_price")
		private Integer totalPrice;

		@Column(name = "status")
		private String status;
		
		@OneToMany(mappedBy = "order", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
		private List<OrderItem> orderItems = new ArrayList<>();
		
		@Column (name="ordered_date")	
		private LocalDateTime orderedDate;
		
		@Column (name="cancelled_date")
		private LocalDate cancelledDate;
		
		@Column (name="delivered_date")
		private LocalDate deliveredDate;

}

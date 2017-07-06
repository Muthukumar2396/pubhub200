package com.muthu.bookapplication.model;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "order_items")
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@Column(name = "quantity")
	private Integer quantity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "book_id")
	private Book book;

	@Column(name="ordered_date")
	private LocalDateTime orderedDate;
}


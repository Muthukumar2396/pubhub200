package com.muthu.bookapplication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "order_items")
@Data
public class OrderItems {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "order_id")
	private Integer orderId;

	@Column(name = "book_id")
	private Integer bookId;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "ordered_date")
	private Date orderedDate;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
}

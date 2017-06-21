package com.muthu.bookapplication.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;


	@Column(name = "total_price")
	private Integer totalPrice;

	@Column(name = "status")
	private String status;
	
	@Column (name="ordered_date")	
	private LocalDateTime orderedDate;
	
	@Column (name="cancelled_date")
	private LocalDate cancelledDate;
	
	@Column (name="delivered_date")
	private LocalDate deliveredDate;
	
	@Column (name="modified_date")
	private LocalDate modifiedDate;
	
	@Column(name = "reason")
	private String reason;
}

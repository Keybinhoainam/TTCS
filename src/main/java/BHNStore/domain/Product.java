package BHNStore.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	@Column(columnDefinition = "nvarchar(100) not null")
	private String name;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private double unitPrice;
	@Column()
	private String image;
	@Column(columnDefinition = "nvarchar(500)")
	private String descrition;
	@Column(nullable = false)
	private int discount;
	@Column()
	private String status;
//	@ManyToOne
//	@JoinColumn(name="categoryid")
//	private Category category;
	
	
}

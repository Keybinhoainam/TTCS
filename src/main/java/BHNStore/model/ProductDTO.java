package BHNStore.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import BHNStore.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable{
	private Long productId;
	@NotEmpty
	private String name;
	@NotEmpty
	private int quantity;
	@NotEmpty
	private double unitPrice;
//	@NotEmpty
	private String image;
	private String descrition;
//	@NotEmpty
	private String status;
//	@NotEmpty
	private Category category;
//	@NotEmpty
	private int discount;
	private Boolean isEdit=false;
	
}

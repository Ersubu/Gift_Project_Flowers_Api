package com.dakr.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="AllFlowers")
public class FlowersInfo {
	
	@Id
	 @SequenceGenerator(name = "product_id_sequence", initialValue = 100000, allocationSize = 1)
    @GeneratedValue(generator = "product_id_sequence", strategy = GenerationType.SEQUENCE)
   
	private Long flowerId;
	@NotNull
    private String flowerName;
	@NotNull
    private String flowerImage;
	@NotNull
    private String flowerType;
	@NotNull
    private BigDecimal flowerPrice;
	@NotNull
    private Integer flowerStock;
	@NotNull
    private String flowerDescription;

}

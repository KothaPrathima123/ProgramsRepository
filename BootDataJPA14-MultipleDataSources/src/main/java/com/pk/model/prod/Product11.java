package com.pk.model.prod;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Entity
@Table
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Product11 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	@Nonnull
	@Column(length=20)
	private String pname;
	@Nonnull
	private Double qty;
	@Nonnull
	private Double price;
	
	
}

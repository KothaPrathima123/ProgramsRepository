package com.pk.model.promotions;

import java.time.LocalDateTime;

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
public class Offers {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer offerId;
	@Nonnull
	@Column(length=20)
	private String offerName;
	@Nonnull
	@Column(length=20)
	private String offerCode;
	@Nonnull
	private Double discountPercentage;
	@Nonnull
	private LocalDateTime expirydate;
}

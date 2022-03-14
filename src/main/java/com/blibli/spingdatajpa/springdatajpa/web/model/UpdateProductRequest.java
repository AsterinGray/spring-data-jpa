package com.blibli.spingdatajpa.springdatajpa.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductRequest {
    @NotBlank
    @Length(min = 4, max = 50)
    private String name;

    @Min(value = 5000)
    private BigInteger price;

    @Min(value = 0)
    private Integer stock;

    @NotNull
    private String shopId;
}

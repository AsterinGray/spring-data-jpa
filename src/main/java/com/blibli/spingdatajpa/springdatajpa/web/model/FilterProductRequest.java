package com.blibli.spingdatajpa.springdatajpa.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilterProductRequest {

    String productName;
    String shopIdOrName;

    @Builder.Default
    Integer page = 0;

    @Builder.Default
    Integer size = 10;
}

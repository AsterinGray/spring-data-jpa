package com.blibli.spingdatajpa.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product", indexes = {
        @Index(name = "product_product_id_product_name_index",
        columnList = "product_id, product_name")
})
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "product_name")
    private String name;

    @Column
    private BigInteger price;

    @Column
    private Integer stock;

    @OneToOne
    @JoinColumn(name = "shop_id")
    private Shop shopId;

    @Version
    @Column
    private Long version;
}
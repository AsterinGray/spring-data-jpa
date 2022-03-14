package com.blibli.spingdatajpa.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shop", indexes = {
        @Index(name = "shop_shop_id_shop_name_index",
        columnList = "shop_id, shop_name")
})
public class Shop {

    @Id
    @Column(name = "shop_id")
    private String id;

    @Column(name = "shop_name")
    private String name;

    @Version
    @Column
    private Long version;
}

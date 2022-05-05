package com.doterra.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
@Entity
public class Order {
    @Id
    private Long id;
    @ManyToOne
    private Profile customer;
    private LocalDateTime orderTime;
    @OneToMany(mappedBy = "article")
    private List<Product> products;

}

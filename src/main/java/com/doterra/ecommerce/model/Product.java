package com.doterra.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Product {
    //Article number for each kind of product
    @Id
    private Integer article;
    private String productName;
    private String latinName;
    //Price is given in EURO
    private Double price;
    private String category; //TODO Enumerate
    //TODO tags
    private Boolean onStock;
    private String typeOfVolume; //TODO Enumerate
    private Integer volume;
    @OneToMany
    private List<ProductDescription> productDescriptions; //TODO must be text in the database

    //TODO properties such as regenerative, Sedative etc Booleans bitches



}

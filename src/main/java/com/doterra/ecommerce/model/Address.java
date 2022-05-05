package com.doterra.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private Long addressId;
    private String country;
    private String city;
    private Integer postalCode;
    private String street;
}

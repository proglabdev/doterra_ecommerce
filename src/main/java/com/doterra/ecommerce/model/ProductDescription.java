package com.doterra.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDescription {

    @Id
    private Long id;
    private String language;
    //TODO Enumerate
    private String typeOfDescription;
    private String text;
}

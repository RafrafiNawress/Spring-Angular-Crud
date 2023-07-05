package tn.esprit.summerworkshop_springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProduct;
    String title;
    float price;
    int quantity;
    @Enumerated(EnumType.STRING)
    ProductCategory category;

    @ManyToOne
    @JsonIgnore
    Stock stock;
}

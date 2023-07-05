package tn.esprit.summerworkshop_springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idStock;
    String title;
    @OneToMany(mappedBy = "stock")
    Set<Product> products;
}

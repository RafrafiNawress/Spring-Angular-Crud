package tn.esprit.summerworkshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.summerworkshop_springboot.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {}


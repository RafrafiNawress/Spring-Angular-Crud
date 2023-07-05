package tn.esprit.summerworkshop_springboot.services;

import tn.esprit.summerworkshop_springboot.entities.Stock;

import java.util.List;

public interface IStockService {

    Stock addStock(Stock stock);
    Stock retrieveStock(Long id);
    List<Stock> retrieveAllStock();

}

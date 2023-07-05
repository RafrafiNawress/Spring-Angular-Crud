package tn.esprit.summerworkshop_springboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.summerworkshop_springboot.entities.Stock;
import tn.esprit.summerworkshop_springboot.repositories.ProductRepository;
import tn.esprit.summerworkshop_springboot.repositories.StockRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StockServiceImpl implements IStockService{

    final StockRepository stockRepository;
    final ProductRepository productRepository;

    @Override
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElseThrow(() -> new NullPointerException("Stock not found"));
    }

    @Override
    public List<Stock> retrieveAllStock() {
        return stockRepository.findAll();
    }



}

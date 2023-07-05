package tn.esprit.summerworkshop_springboot.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.summerworkshop_springboot.entities.Stock;
import tn.esprit.summerworkshop_springboot.services.IStockService;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
public class StockController {

    IStockService stockService;

    @PostMapping("/stock")
    Stock addStock(@RequestBody Stock stock){
        return stockService.addStock(stock);
    }

    @GetMapping("/stock/{id}")
    Stock retrieveStock(@PathVariable Long id){
        return stockService.retrieveStock(id);
    }

    @GetMapping("/stock")
    List<Stock> retrieveAllStock(){
        return stockService.retrieveAllStock();
    }


}

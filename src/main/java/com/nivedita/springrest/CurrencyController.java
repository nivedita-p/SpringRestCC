package com.nivedita.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello Spring World!";
    }
    
    @GetMapping("/eurotousd")
    public String getEuroUsdRate(@RequestParam(value="amt") int amt) {
    	CurrencyConverter obj = new CurrencyConverter();
        double rate= amt*obj.getRate("EUR", "USD");
         return Double.toString(rate);
    }
    
    @GetMapping("/usdtoeuro")
    public String getUsdEuroRate(@RequestParam(value="amt") int amt) {
    	CurrencyConverter obj = new CurrencyConverter();
        double rate= amt*obj.getRate("USD", "EUR");
         return Double.toString(rate);
        
    }
    
    @GetMapping("/inrtoeuro")
    public String getYenEuroRate(@RequestParam(value="amt") int amt) {
    	CurrencyConverter obj = new CurrencyConverter();
        double rate= amt*obj.getRate("INR", "EUR");
         return Double.toString(rate);   
    }
 
    @GetMapping("/eurotoinr")
    public String getEuroYenRate(@RequestParam(value="amt") int amt) {
    	CurrencyConverter obj = new CurrencyConverter();
        double rate= amt*obj.getRate("EUR", "INR");
         return Double.toString(rate);   
    }
    
    @GetMapping("/inrtousd")
    public String getYenUsdRate(@RequestParam(value="amt") int amt) {
    	CurrencyConverter obj = new CurrencyConverter();
        double rate= amt*obj.getRate("INR", "USD");
         return Double.toString(rate);   
    }
    
    @GetMapping("/usdtoinr")
    public String getUsdYenRate(@RequestParam(value="amt") int amt) {
    	CurrencyConverter obj = new CurrencyConverter();
        double rate= amt*obj.getRate("USD", "INR");
         return Double.toString(rate);   
    }
    
    
    
}


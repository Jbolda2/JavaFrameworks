
/*
package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.context.ApplicationContext;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import java.util.Optional;

import javax.validation.Valid;

@Controller
public class PurchaseProductController{

@Autowired
private ApplicationContext context;

private static Product product1;

private Product product;


//private static Product product1;

    @PostMapping("buyProduct")
public String buyProduct(@Valid @RequestParam("productID") int theID, Model theModel) {
        product = new Product();
        theModel.addAttribute("product", product);
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Optional<Product> optionalProduct = Optional.ofNullable(productService.findById(theID));

        optionalProduct.ifPresent(value -> product = value);
        System.out.println(product.getName());

    if (product.getInv() > 0) {
        int inv = product.getInv() - 1;
        product.setInv(inv);
        productService.findById(theID).setInv(inv);
            productService.save(productService.findById(theID));

        return "buyForm";

} else {
    return "outOfStock";
    }
    }

}
*/

//Using productRepository Same
/**/
package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import javax.validation.Valid;

@Controller
public class PurchaseProductController{

    @Autowired
    ProductRepository productRepository;

    private Product product;


//private static Product product1;

    @GetMapping ("buyProduct")
    public String buyProduct(@Valid @RequestParam("productID") long theID, Model theModel) {
        product = new Product();
        theModel.addAttribute("product", product);
        Optional<Product> optionalProduct = productRepository.findById(theID);

        optionalProduct.ifPresent(value -> product = value);

        if (product.getInv() > 0) {
            int inv = product.getInv();
            product.setInv(inv -1);
            productRepository.save(product);
            return "buyForm";
        } else {
            return "outOfStock";
        }
    }

}


/**/

//Using productRepository Separate
/*
package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import javax.validation.Valid;

@Controller
public class PurchaseProductController{

    @Autowired
    ProductRepository productRepository;

    private Product product;


//private static Product product1;

    @GetMapping("buyProduct")
    public String buyProduct(@Valid @RequestParam("productID") long theID, Model theModel) {
        product = new Product();
        theModel.addAttribute("product", product);
        Optional<Product> optionalProduct = productRepository.findById(theID);

        optionalProduct.ifPresent(value -> product = value);
        return "inventoryCheck";
    }

    @PostMapping("inventoryCheck")
    public String inventoryCheck(){
        if (product.getInv() > 0) {
            int inv = product.getInv();
            product.setInv(inv -1);
            productRepository.save(product);
            return "buyForm";
        } else {
            return "outOfStock";
        }
    }

}
*/











package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    if (partRepository.count() == 0) {
        OutsourcedPart counter = new OutsourcedPart();
        counter.setCompanyName("Jim's Shoe Parts");
        counter.setName("Counter");
        counter.setInv(5);
        counter.setPrice(14.0);
        counter.setId(100L);
        outsourcedPartRepository.save(counter);

        OutsourcedPart sole = new OutsourcedPart();
        sole.setCompanyName("Gentlemen's Footwear");
        sole.setName("Sole");
        sole.setInv(5);
        sole.setPrice(15.0);
        sole.setId(101L);
        outsourcedPartRepository.save(sole);


        InhousePart tongue = new InhousePart();
        tongue.setPartId(52);
        tongue.setName("Tongue");
        tongue.setInv(5);
        tongue.setPrice(16.0);
        tongue.setId(102L);
        partRepository.save(tongue);

        InhousePart laces = new InhousePart();
        laces.setPartId(53);
        laces.setName("Laces");
        laces.setInv(5);
        laces.setPrice(17.0);
        laces.setId(103L);
        partRepository.save(laces);

        OutsourcedPart toecap = new OutsourcedPart();
        toecap.setCompanyName("Jim's Shoe Parts");
        toecap.setName("Toecap");
        toecap.setInv(5);
        toecap.setPrice(18.0);
        toecap.setId(104L);
        outsourcedPartRepository.save(toecap);
    }


        if (productRepository.count() == 0) {
            Product oxford = new Product("Oxford", 80.0, 15);
            productRepository.save(oxford);
            Product loafer = new Product("Loafer", 85.0, 15);
            productRepository.save(loafer);
            Product derby = new Product("Derby", 90.0, 15);
            productRepository.save(derby);
            Product brogue = new Product("Brogue", 95.0, 15);
            productRepository.save(brogue);
            Product wingTip = new Product("Wing Tip", 100.0, 15);
            productRepository.save(wingTip);
        }

        /*System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());
*/

    }
}

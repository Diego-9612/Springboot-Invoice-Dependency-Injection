package com.diego.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.diego.springboot.di.factura.springboot_difactura.models.Item;
import com.diego.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("PlayStation", 600);
        Product p2 = new Product("Nevera", 800);
        Product p3 = new Product("Computadora", 500);
        return Arrays.asList(new Item(p1, 2),new Item(p2, 1), new Item(p3, 2));
        

    }

}

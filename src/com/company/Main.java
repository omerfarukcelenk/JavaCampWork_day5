package com.company;

import com.company.business.abstracts.ProductService;
import com.company.business.concretes.ProductManager;
import com.company.core.JLoggerManagerAdapter;
import com.company.core.LoggerService;
import com.company.dataAccess.concretes.AbcProductDao;
import com.company.dataAccess.concretes.HibernateProductDao;
import com.company.entities.concretes.Product;
import com.company.jLogger.JLoggerManager;

public class Main {

    public static void main(String[] args) {
        // ToDo : Spring IoC ile çözülecek
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);
    }
}

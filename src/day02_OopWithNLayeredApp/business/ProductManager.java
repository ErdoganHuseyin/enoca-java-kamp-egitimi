package day02_OopWithNLayeredApp.business;

import day02_OopWithNLayeredApp.core.logging.Logger;
import day02_OopWithNLayeredApp.dataAccess.JdbcProductDao;
import day02_OopWithNLayeredApp.dataAccess.ProductDao;
import day02_OopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager() {
    }

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) {

        productDao.add(product);

        for(Logger logger: loggers){
            logger.log(product.getName());
        }

    }



}

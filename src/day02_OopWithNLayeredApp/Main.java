package day02_OopWithNLayeredApp;

import day02_OopWithNLayeredApp.business.ProductManager;
import day02_OopWithNLayeredApp.core.logging.DataBaseLogger;
import day02_OopWithNLayeredApp.core.logging.FileLogger;
import day02_OopWithNLayeredApp.core.logging.Logger;
import day02_OopWithNLayeredApp.core.logging.MailLogger;
import day02_OopWithNLayeredApp.dataAccess.HibernateProductDao;
import day02_OopWithNLayeredApp.dataAccess.JdbcProductDao;
import day02_OopWithNLayeredApp.dataAccess.ProductDao;
import day02_OopWithNLayeredApp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args){
        Product product1 = new Product(1,7000,"Delonghi");
        ProductDao productDao = new JdbcProductDao();
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DataBaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        ProductManager productManager = new ProductManager(productDao,loggers);
        productManager.add(product1);
    }


}

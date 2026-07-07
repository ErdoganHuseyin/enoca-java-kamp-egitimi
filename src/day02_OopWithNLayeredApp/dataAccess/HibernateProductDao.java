package day02_OopWithNLayeredApp.dataAccess;

import day02_OopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        System.out.println("Hibernate ile eklenir");
    }
}

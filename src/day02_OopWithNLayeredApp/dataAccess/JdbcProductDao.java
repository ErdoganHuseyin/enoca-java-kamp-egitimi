package day02_OopWithNLayeredApp.dataAccess;

import day02_OopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
System.out.println("Jdbc ile eklenir");
    }
}

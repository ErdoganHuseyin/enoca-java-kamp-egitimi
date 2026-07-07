import day01.CorporateCustomer;
import day01.Customer;
import day01.IndividualCustomer;
import day01.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Product product;
product = new Product();
   product.setId(1);
    product.setName("Delonghi");
    product.setPrice(7500);
    product.setStock(200);
Product product1 = new Product();
product1.setId(2);
product1.setName("Smeg");
product1.setPrice(6000);
product1.setStock(100);

Product product2 = new Product();
product2.setName("Kitchen Aid");
product2.setId(3);
product2.setPrice(5000);
product2.setStock(150);

    Product[] products = {product,product1,product2};

    for(Product product3 : products){
        System.out.println(product3.getName());
    }


    IndividualCustomer individualCustomer = new IndividualCustomer();
    individualCustomer.setCustomerNumber("12345");
    individualCustomer.setId(1);
    individualCustomer.setPhone("05343961024");
    individualCustomer.setFirstName("Hüseyin");
    individualCustomer.setLastName("Erdoğan");


    CorporateCustomer corporateCustomer = new CorporateCustomer();
    corporateCustomer.setId(2);
    corporateCustomer.setCustomerNumber("12378");
    corporateCustomer.setCompanyName("Enoca");
    corporateCustomer.setPhone("055555555555");

    Customer[] customers ={individualCustomer,corporateCustomer};

}
package com.company.lesson6;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**Реализуйте класс корзины интернет магазина по следующему интерфейсу:
 *
 interface Basket {
 void addProduct(String product, int quantity);
 void removeProduct(String product);
 void updateProductQuantity(String product, int quantity);
 void clear();
 List<String> getProducts();
 int getProductQuantity(String product);
 }
 */
public class BasketImplementation implements Basket{

    private HashMap<String, Integer> products;

    public BasketImplementation() {
        this.products = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        if(products.containsKey(product)){
            int quantityExist = products.get(product);
            updateProductQuantity(product, quantityExist+quantity);
        }
        else products.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
//        if (products.containsKey(product)){
            products.remove(product);//@return the node, or null if none - из описания метода removeNode в HashMap
//        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
//        if(products.containsKey(product)){
//            products.replace(product, quantity);
//        }
//        else addProduct(product, quantity);
        if (products.replace(product, quantity)==null) {
            addProduct(product, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<String>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
            return products.getOrDefault(product, 0);
    }
}

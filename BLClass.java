package Day7.Task;

import java.util.HashMap;

public class BLClass {

    private HashMap<String, Double> productMap = new HashMap<String, Double>();

    public void buyProduct(String productName, double productPrice) {
        productMap.put(productName, productPrice);
        System.out.println("Product bought: " + productName);
    }

    public void cancelProduct(String productName) {
        if (productMap.containsKey(productName)) {
            productMap.remove(productName);
            System.out.println("Product canceled: " + productName);
        } else {
            System.out.println("Product not found");
        }
    }

    public void displayAllProducts() {
        for (String productName : productMap.keySet()) {
            System.out.println(productName + ": " + productMap.get(productName));
        }
    }
}


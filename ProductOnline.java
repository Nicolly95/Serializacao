//É utilizada pela classe Serializa2.
//Precisamos implementar a interface Serializable para poder serializar a classe ProductOnline
package Java;

import java.io.Serializable;

public class ProductOnline implements Serializable{

    transient String clienteNome;
    String nameProduct;
    double price;
    private static final long SERIALVERSIONUID = 1l;

    public ProductOnline(String clienteNome, String name, double price) {
        this.clienteNome = clienteNome;
        this.nameProduct = name;
        this.price = price;
    }

}

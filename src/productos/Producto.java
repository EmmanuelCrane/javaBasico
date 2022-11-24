package productos;

import java.util.List;
import java.util.Map;

public interface Producto {
    String nameProduct = "";
    float priceProduct = 0f;
    void createProduct(String name, float price);
    void updateProduct();
}

package productos;

import java.util.*;

public class Almacen implements Producto{
    private String name = "";
    private float price = 0f;
//    Verificar valores
    private String valueString = "";
    private int valueInteger = 0;
    private float valueFloat = 0f;
    public List<Map> listProducts;

    public Almacen() {
        this.listProducts = new ArrayList<>();
    }

    @Override
    public void createProduct(String name, float price) {
        int id = this.listProducts.size() + 1;
        Map<Object, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("price", price);
        this.listProducts.add(map);
    }

    @Override
    public void updateProduct() {


        Map<Object, Object> mapReplace = new HashMap<>();
        int countErrors = 0;
        int id = 0;
        int confirmation = 0;
        while(true) {
            this.listarProductos();
            try {
                Scanner inputInt = new Scanner(System.in);
                System.out.println("Ingresa el id del producto a actualizar: ");
                id = inputInt.nextInt();
            } catch (Exception e) {
                System.out.println(e + "id = Error con el valor ingresado");
            }

            for (Map element: this.listProducts) {
                if(element.containsValue(id)) {
                    System.out.println(element);
                    String updateName = "";
                    float updatePrice = 0f;
                    try {
                        Scanner inputName = new Scanner(System.in);
                        System.out.println("Ingresa el nombre del producto: ");
                        updateName = inputName.nextLine();

                        Scanner inputPrice = new Scanner(System.in);
                        System.out.println("Ingresa el precio del producto: ");
                        updatePrice = inputPrice.nextFloat();
                    }
                    catch (Exception e) {
                        System.out.println(e + "nombre y precio Error con el valor ingresado");
                        break;
                    }

                    mapReplace.put("name", updateName);
                    mapReplace.put("price", updatePrice);

                    System.out.println(mapReplace);
                }
                else {
                    countErrors++;
                }
            }

            if (countErrors == this.listProducts.size()) {
                try {
                    Scanner inputConfirmation = new Scanner(System.in);
                    System.out.println("id no encontrado quieres volver a intentarlo [1]si, [2]no: ");
                    confirmation = inputConfirmation.nextInt();
                } catch (Exception e) {
                    System.out.println(e + "id2 = Error con el valor ingresado");
                    break;
                }

                if (confirmation == 1) {
                    mapReplace.clear();
                    countErrors = 0;
                    id = 0;
                    confirmation = 0;
                }
                else {
                    break;
                }
            }
            else {
                try {
                    Scanner inputConfirmation2 = new Scanner(System.in);
                    System.out.println("Los datos son correctos [1]si, [2]no: ");
                    confirmation = inputConfirmation2.nextInt();
                }catch (Exception e) {
                    System.out.println(e + "Error con el valor ingresado");
                    break;
                }

                if (confirmation == 1) {
                    for (Map element: this.listProducts) {
                        if(element.containsValue(id)) {
                            element.replace("name", mapReplace.get("name"));
                            element.replace("price", mapReplace.get("price"));
                            mapReplace.clear();
                        }
                    }
                    System.out.println("Lista de productos actualizada:");
                    this.listarProductos();
                    break;
                }
                else {
                    mapReplace.clear();
                    id = 0;
                    confirmation = 0;
                }
            }

        }

    }

    public void listarProductos() {
        for (Map element: this.listProducts) {
            System.out.println(element);
        }
    }

}

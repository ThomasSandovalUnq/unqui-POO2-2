package ar.edu.unq.poo2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class CajaTest {

    private Producto producto;
    private ProductoDeCooperativa productoCooperativa;
    private Caja caja;

    @BeforeEach
    void setUp() {
        // Inicializamos las instancias antes de cada prueba.
        producto = new Producto(100.0, 5); // precio 100, stock 5
        productoCooperativa = new ProductoDeCooperativa(100.0, 5); // precio 100, stock 5
        caja = new Caja();
    }

    @Test
    void testCalcularPrecioFinalConProductos() {
        // Verificamos que el precio total se calcule correctamente.
        double precioFinal = caja.calcularPrecioFinal(Arrays.asList(producto, productoCooperativa));
        
        // Producto normal de 100 y producto de cooperativa con precio con descuento (100 * 0.9 = 90)
        double precioEsperado = 100.0 + 90.0;
        
        assertEquals(precioEsperado, precioFinal, "El precio final calculado no es correcto.");
    }

    @Test
    void testCalcularPrecioFinalConVariosProductos() {
        // Verificamos el cálculo con más productos.
        Producto producto2 = new Producto(150.0, 10); // precio 150, stock 10
        ProductoDeCooperativa productoCoop2 = new ProductoDeCooperativa(200.0, 8); // precio 200, stock 8

        double precioFinal = caja.calcularPrecioFinal(Arrays.asList(producto, productoCooperativa, producto2, productoCoop2));

        double precioEsperado = 100.0 + 90.0 + 150.0 + (200.0 * 0.9); // 100 + 90 + 150 + 180 = 520

        assertEquals(precioEsperado, precioFinal, "El precio final calculado con varios productos no es correcto.");
    }

    @Test
    void testPrecioConDescuentoProductoDeCooperativa() {
        // Verificamos que el precio con descuento se calcule correctamente.
        double precioEsperado = 100.0 * 0.9; // 90.0
        assertEquals(precioEsperado, productoCooperativa.getPrecio(), "El precio con descuento no es correcto.");
    }

    @Test
    void testCalcularPrecioFinalSinProductos() {
        // Verificamos el caso en que la lista de productos esté vacía.
        double precioFinal = caja.calcularPrecioFinal(Arrays.asList());
        assertEquals(0.0, precioFinal, "El precio final debería ser 0 cuando no hay productos.");
    }

    @Test
    void testDecrementoDeStockTrasVariosProductos() {
        // Verificamos que el stock de los productos se decrmente correctamente después de procesar.
        caja.calcularPrecioFinal(Arrays.asList(producto, productoCooperativa));

        assertEquals(4, producto.getStock(), "El stock del producto no se decrementó correctamente.");
        assertEquals(4, productoCooperativa.getStock(), "El stock del producto cooperativa no se decrementó correctamente.");
    }
}

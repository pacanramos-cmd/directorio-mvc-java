package modelo;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    
    private List<Producto> productos;
    // ELIMINADO: private static int contadorId = 1; 

    public BaseDeDatos() {
        this.productos = new ArrayList<>();
    }

    /** MODIFICADO: Simplemente añade el producto con el ID que ya trae. */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    /** NUEVO: Verifica si un ID ya existe en la lista. */
    public boolean existeId(int id) {
        return buscarProductoporId(id) != null;
    }

    /** Busca un producto por ID único (clave de todas las operaciones). */
    public Producto buscarProductoporId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Producto> buscarTodos() {
        return productos;
    }

    public boolean eliminarProducto(int id) {
        Producto productoAEliminar = buscarProductoporId(id);
        if (productoAEliminar != null) {
            return productos.remove(productoAEliminar);
        }
        return false;
    }
    
    public boolean actualizarProducto(int id, Producto productoNuevo) {
        Producto productoAActualizar = buscarProductoporId(id);
        
        if (productoAActualizar != null) {
            productoAActualizar.setNombre(productoNuevo.getNombre());
            productoAActualizar.setCantidad(productoNuevo.getCantidad());
            productoAActualizar.setPrecio(productoNuevo.getPrecio());
            return true;
        }
        return false;
    }
}
package modelo.vo;

public class Requerimiento_2Vo {
    private String proyectoID;
    private String proveedorCompra;

    public Requerimiento_2Vo(){
    }

    public Requerimiento_2Vo(String proyectoID, String proveedorCompra) {
        this.proyectoID = proyectoID;
        this.proveedorCompra = proveedorCompra;
    }

    public String getProyectoID() {
        return proyectoID;
    }

    public void setProyectoID(String proyectoID) {
        this.proyectoID = proyectoID;
    }

    public String getProveedorCompra() {
        return proveedorCompra;
    }

    public void setProveedorCompra(String proveedorCompra) {
        this.proveedorCompra = proveedorCompra;
    }


    @Override
    public String toString() {
        return proyectoID + " " + proveedorCompra;
    }


}

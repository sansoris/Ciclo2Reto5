package modelo.vo;

public class Requerimiento_3Vo {
    private String proyectoID;
    private String nombreMaterial;

    public Requerimiento_3Vo(){
    }

    public Requerimiento_3Vo(String proyectoID, String nombreMaterial) {
        this.proyectoID = proyectoID;
        this.nombreMaterial = nombreMaterial;
    }

    public String getProyectoID() {
        return proyectoID;
    }

    public void setProyectoID(String proyectoID) {
        this.proyectoID = proyectoID;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    @Override
    public String toString() {
        return proyectoID + " " + nombreMaterial;
    }

}

package modelo.vo;

public class Requerimiento_1Vo {
    private String ciudadResidencia;
    private Integer promedioSalario;


    public Requerimiento_1Vo(){
    }

    public Requerimiento_1Vo(String ciudadResidencia, Integer promedioSalario) {
        this.ciudadResidencia = ciudadResidencia;
        this.promedioSalario = promedioSalario;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }
    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public Integer getPromedioSalario() {
        return promedioSalario;
    }

    public void setPromedioSalario(Integer promedioSalario) {
        this.promedioSalario = promedioSalario;
    }


    @Override
    public String toString() {
        return ciudadResidencia + " " + promedioSalario;
    }

    



}

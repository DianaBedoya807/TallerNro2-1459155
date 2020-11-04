package com.clases;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private Float valorSubsidio;

    //Completar clase
    public BeneficiosCovid19() {

    }

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(String beneficio1, String beneficio2){
        String mejorBeneficio = Float.parseFloat(beneficio1) > Float.parseFloat(beneficio2) ? beneficio1 : beneficio2;
        return Float.valueOf(mejorBeneficio);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getValorSubsidio() {
        return valorSubsidio;
    }

    public void setValorSubsidio(String vlrSubsidio) {
        this.valorSubsidio = Float.valueOf(vlrSubsidio);
    }

}

package com.mycompany.reto_7;

public class tramoAsfalto implements tramoGenerico {
    String nombreProveedor;
    double velocidadMaxima;
    boolean permitirAdelantamiento;
    String coordenadasIniciales;
    String coordenadasFinales;
    public double x1;
    double x2;
    double y1;
    double y2;

    @Override
    public String toString() {
        return "tramoAsfalto{" + "nombreProveedor=" + nombreProveedor + ", velocidadMaxima=" + velocidadMaxima + ", permitirAdelantamiento=" + permitirAdelantamiento + ", coordenadasIniciales=" + coordenadasIniciales + ", coordenadasFinales=" + coordenadasFinales + ", x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }

    public tramoAsfalto(String nombreProveedor, double velocidadMaxima, boolean permitirAdelantamiento, String coordenadasIniciales, String coordenadasFinales) {
        this.nombreProveedor = nombreProveedor;
        this.velocidadMaxima = velocidadMaxima;
        this.permitirAdelantamiento = permitirAdelantamiento;
        this.coordenadasIniciales = coordenadasIniciales;
        this.coordenadasFinales = coordenadasFinales;
    }

    @Override
    public String getCoordenadasIniciales() {
        return coordenadasIniciales;
    }

    @Override
    public String getCoordenadasFinales() {
        return coordenadasFinales;
    }

    @Override
    public void stringToDouble(){
        String[] vectorAux = coordenadasIniciales.split(";");
        x1 = Double.parseDouble(vectorAux[0]);
        y1 = Double.parseDouble(vectorAux[1]);
        vectorAux = coordenadasFinales.split(";");
        x2 = Double.parseDouble(vectorAux[0]);
        y2 = Double.parseDouble(vectorAux[1]);     
    }
    
    @Override
    public double longitud() {
        stringToDouble();
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 1));
    }

    @Override
    public double area() {
        return longitud()*8;    
    }

    @Override
    public double volumen() {
        return area()*0.25;
    }

    @Override
    public boolean esAsfaltada() {
        return true;
    }

}

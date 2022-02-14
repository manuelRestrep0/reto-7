package com.mycompany.reto_7;

 public class tramoSinAsfaltar implements tramoGenerico {
    String tipoMaterial;
    double espesorMaterial;
    String coordenadasIniciales;
    String coordenadasFinales;
    double x1;
    double x2;
    double y1;
    double y2;

    @Override
    public String toString() {
        return "tramoSinAsfaltar{" + "tipoMaterial=" + tipoMaterial + ", espesorMaterial=" + espesorMaterial + ", coordenadasIniciales=" + coordenadasIniciales + ", coordenadasFinales=" + coordenadasFinales + ", x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }

    public tramoSinAsfaltar(String tipoMaterial, double espesorMaterial, String coordenadasIniciales, String coordenadasFinales) {
        this.tipoMaterial = tipoMaterial;
        this.espesorMaterial = espesorMaterial;
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
        this.x1 = Double.parseDouble(vectorAux[0]);
        this.y1 = Double.parseDouble(vectorAux[1]);
        vectorAux = coordenadasFinales.split(";");
        this.x2 = Double.parseDouble(vectorAux[0]);
        this.y2 = Double.parseDouble(vectorAux[1]);
        
    }
    
    @Override
    public double longitud() {
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 1));
    }

    @Override
    public double area() {
        return longitud()*6;
    }

    @Override
    public double volumen() {
        return area()*espesorMaterial;
    }

    @Override
    public boolean esAsfaltada() {
        return false;
    }

}

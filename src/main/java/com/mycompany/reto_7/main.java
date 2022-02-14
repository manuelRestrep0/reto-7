package com.mycompany.reto_7;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        boolean ejecucion = true;
        carreteraCompleta Carretera = new carreteraCompleta();
        Carretera.carretera = new ArrayList();
        
        Carretera.carretera.add(new tramoAsfalto("Argos",200,true,"1;1","6;7"));
        Carretera.carretera.add(new tramoAsfalto("Argos",200,true,"6;7","10.3;20"));
        Carretera.carretera.add(new tramoSinAsfaltar("Tierra",0.15,"10.3;20","17;12"));
        Carretera.carretera.add(new tramoSinAsfaltar("Grava",0.20,"17;12","3;10"));
        
        for(tramoGenerico m : Carretera.carretera){
            m.stringToDouble();
        }

        while(ejecucion){
            
            System.out.println("""
                               1)Longitud total.
                               2)Area total.
                               3)Volumen total.
                               4)Volumen asfaltado.
                               5)Volumen sin asfaltar.
                               6)Comprobar tramos conectados.
                               0)Para teminar la ejecucion.""");
            Scanner input = new Scanner(System.in);
            switch(input.nextInt()){
                case 1:{
                    System.out.println(Double.toString(Carretera.longitudTotal()));
                    break;
                }
                case 2:{
                    System.out.println(Double.toString(Carretera.areaTotal()));               
                    break;
                }
                case 3:{
                    System.out.println(Double.toString(Carretera.volumenTotal()));                    
                    break;
                }
                case 4:{
                    System.out.println(Double.toString(Carretera.volumenAsfalto()));                    
                    break;
                }
                case 5:{
                    System.out.println(Double.toString(Carretera.volumenSinAsfalto()));
                    break;
                }
                case 6:{
                    int i=0,j=1;
                    tramoGenerico e,f;
                    while(j<Carretera.carretera.size()){
                        e = Carretera.carretera.get(i);
                        f = Carretera.carretera.get(j);
                        if(Carretera.tramosConectados(e.getCoordenadasFinales(),f.getCoordenadasIniciales())==false){
                        System.out.println("No todos los tramos estan conectados");
                        break;
                        }
                        else{
                            i++;
                            j++;
                        }
                    }
                    System.out.println("Todos los tramos estan conectados");
                    break;
                }
                default:{
                    ejecucion = false;
                    break;
                }
            }
        }
    
}
}

/*
 Una clínica de maternidad necesita un sistema para determinar 
cuántos bebés han nacido recientemente. Dicho sistema solicita 
al usuario capturar la cantidad de nacimientos (N), el nombre de cada 
bebé y su sexo (implemente un ciclo do-while para validar la captura,
siendo M para masculino y F para femenino). Al final, debe imprimir 
la cantidad de bebés de cada sexo.
 */
package maternidad;

import java.util.Scanner;

/**
 *
 * Josselyne ester chilito galindez, codigo: 20201187434
 */
public class Maternidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Nb,f=0,m=0,c=1;
        String genero,nombre;
        System.out.println("señor usurio diguite el numero de bebes nacidos");
        Nb=entrada.nextInt();
        
        do{System.out.println("nacimiento numero #"+c);
            System.out.println("ingrese el genero del bebe");
            System.out.println("si es femenino diguite la letra f ");
            System.out.println("si es masculino diguite la letra m ");
            genero = entrada.next();
            
            if("m".equals(genero)){
            m=m+1;
            }else{f=f+1;}
            System.out.println("diguite el nombre del bebe");
            nombre=entrada.next();
            c=c+1;
        }while (c<=Nb);
                System.out.println("cantidad de nacidos del genero masculino #"+m);
                System.out.println("cantidad de nacidos del genero femenino #"+f);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadador;

import java.util.Scanner;

/**
 *
 * @author Luiseps
 */
public class NadadorArray {
    
    int contUser=0,cod = 1; //variable llevar control usuarios ingresados
    Nadador nadador [] = new Nadador[100]; //creando el arreglo de objetos (clase Nadador)
    Scanner reader =new Scanner(System.in);
   
    public NadadorArray(){ //constructor de la clase NadadorArray
       
     int op;
        do{
            System.out.println("1. Gestion deportista \n");
            System.out.println("1. Inscripcion en competencia\n");
            op = reader.nextInt();

            switch(op){
                        case 1:
                            gestion();
                            break;
                        case 2:
                            inscripcion();
                            break;
                        default:
            }
          }while(op!=3);
       
    }

    public void gestion(){
        int op;
       
        do{
             System.out.println("1. Ingresar deportista \n"+"2. Actualizar deportista \n"+"3. Eliminar deportista \n"+"4. Buscar deportista \n"+"5. Regresar al menu anterior \n");
             op = reader.nextInt();
            
 
                switch(op){
                    case 1:
                        ingresar();
                        break;
                    case 2:
                        actualizar();
                        break;
                    case 3:
                        eliminar();
                        break;
                    case 4:
                        buscar();                        
                        break;
                    case 5:
                        break;
                    default:
                 
            }
 
        }while(op!=5);
        
    }
    
    public void inscripcion(){
        
             int op;
        do{
            System.out.println("1. Inscribir nadador \n");
            System.out.println("1. Eliminar nadador\n");
            System.out.println("1. Mostrar prueba\n");
            op = reader.nextInt();

            switch(op){
                        case 1:
                            ;
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        default:
            }
          }while(op!=4);
        
    }
    
    public String Categoria(double year){
        int edad;
        String c =" ";
         edad = (int)(2016 -year);
                        if(6 > edad || edad< 10)
                        c ="Infantil A";
                        if(11 > edad || edad< 17)
                        c ="Infantil B";
                        if(17 > edad || edad< 25)
                        c ="Juvenil";
                        if(edad > 25)
                        c ="Senior";
        return c;                
    }
                        
    public void ingresar(){        
 
     String nombre;
     double id;
     String rama;
     double yearBorn;
     String categoria;
     String prueba; 
     
         
          reader.nextLine();
          System.out.println("1. Ingresar nombre \n");
          nombre = reader.nextLine();
          reader.nextLine();
          System.out.println("1. Ingresar id \n");
          id = reader.nextDouble();
          reader.nextLine();
          System.out.println("1. Ingresar rama (Masculino/Femenino) : \n");
          rama = reader.nextLine();
          reader.nextLine();
          System.out.println("1. Ingresar año de nacimiento \n");
          yearBorn = reader.nextDouble();
          categoria = Categoria(yearBorn);
          
          Nadador temp = new Nadador(nombre,id,rama,yearBorn,categoria,null,cod);     
 
         nadador[contUser] = temp;
         contUser++;  
         cod++;   
    }
    public void buscar(){
 
        double id;
        System.out.println("Ingrese numero de identidad :");
        id = reader.nextDouble();
 
        for(int i=0; i<contUser; i++){
           if(nadador[i].getId()== id){
               System.out.println("Nombre = "+nadador[i].getNombre()+"\n");
               System.out.println("Documento :"+nadador[i].getId()+"\n");
               System.out.println("Rama :"+nadador[i].getRama()+"\n");
               System.out.println("Año de nacimiento :"+nadador[i].getYearBorn()+"\n");
               System.out.println("Categoria :"+nadador[i].getCategoria()+"\n");
               System.out.println("Prueba inscrita :"+nadador[i].getPrueba()+"\n");
            }
        }
    }
    
    public void actualizar(){
        
        String nombre;
        double id;
        String rama;
        double yearBorn;
        String categoria;
        String prueba;        
        int cc;
         
        System.out.println("Ingrese el numero de cc");
        cc = reader.nextInt();
        
            if(contUser!=0){
                for(int i=0; i<contUser; i++){
                    if(nadador[i].getId() == cc){
                        System.out.println("Nombre = "+nadador[i].getNombre()+"\n");
                        System.out.println("Documento :"+nadador[i].getId()+"\n");
                        System.out.println("Rama :"+nadador[i].getRama()+"\n");
                        System.out.println("Año de nacimiento :"+nadador[i].getYearBorn()+"\n");
                        System.out.println("Categoria :"+nadador[i].getCategoria()+"\n");
                        System.out.println("Prueba inscrita :"+nadador[i].getPrueba()+"\n");
                        
                        System.out.println("1. Ingresar nombre \n");
                        nombre = reader.nextLine();
                        reader.nextLine();
                        System.out.println("1. Ingresar id \n");
                        id = reader.nextDouble();
                        reader.nextLine();
                        System.out.println("1. Ingresar rama (Masculino/Femenino) : \n");
                        rama = reader.nextLine();
                        reader.nextLine();
                        System.out.println("1. Ingresar año de nacimiento \n");
                        yearBorn = reader.nextDouble();
                        categoria = Categoria(yearBorn);
          
          Nadador temp = new Nadador(nombre,id,rama,yearBorn,categoria,null,i);     
 
         nadador[i] = temp;
                        
                    }
                    else{
                        System.out.println("No se encuantran coincidencias \n"); 
                    }
                }
                
            }
 
        
    }
    public void eliminar(){
        double id;
        Nadador nadadorTemp[] = new Nadador[contUser-1];
 
         System.out.println("Ingrese el numero de identificacion : \n");
          id = reader.nextDouble();
            for(int i=0; i<=contUser; i++){
                if(id == nadador[i].getId()){
                    nadador[i] = null;
                    contUser--;
                }else     
                     nadadorTemp[i-1] = nadador[i];
            }
            nadador = new Nadador[100];
            for(int i=0; i<=contUser; i++){
                nadador[i] = nadadorTemp[i];
            }
            
    }   
             
                           
     public static void main(String[] args) {
         
         NadadorArray object = new NadadorArray();
       
    }
    
}

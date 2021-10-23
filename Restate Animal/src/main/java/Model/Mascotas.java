package Model;

//DATOS PERROS*******************************************************************

public class Mascotas {
    private String nombreP;
    private String razaP;
    private String colorP;
    private int edadP;
    private int nivelP;
 

    public Mascotas() {
        this.nombreP = null;
        this.razaP = null;
        this.colorP = null;
        this.edadP = 0;
        this.nivelP = 0;

    }

    public Mascotas(String nombreA, String razaA, String colorA, int edadA,int nivelA) {
        this.nombreP = nombreA;
        this.razaP = razaA;
        this.colorP = colorA;
        this.edadP = edadA;
        this.nivelP = nivelA;

    }
    
    //SETTERS*********************************************************************
    
    public void setNombreA(String nombreA) {
        this.nombreP = nombreA;
    }

    public void setRazaA(String razaA) {
        this.razaP = razaA;
    }

    public void setColorA(String colorA) {
        this.colorP = colorA;
    }

    public void setEdadA(int edadA) {
        this.edadP = edadA;
    }
    
     public void setNivelA(int nivelA) {
        this.nivelP = nivelA;
    }
    
//GETTERS**************************************************
     
    public String getNombreA() {
        return nombreP;
    }

    public String getRazaA() {
        return razaP;
    }

    public String getColorA() {
        return colorP;
    }

    public int getEdadA() {
        return edadP;
    }


    public int getNivelA() {
        return nivelP;
    }
   
//GETTERS DE RETORNO**************************************************************
    
    public String getDatos(){
        return "\nNombre:"+ nombreP+
               "\nRaza:"+ razaP+
               "\nColor:"+ colorP+
               "\nEdad:"+ edadP+   
               "\nNIvel de entrenamiento:"+ nivelP; 
    }
         
}

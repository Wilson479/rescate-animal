package Model;

//DATOS GATOS**********************************************************************

public class MascFelino {

    public static Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String nombreG;
    private String razaG;
    private String colorG;
    private int edadG;
    private String toxoplasmosis;

    public MascFelino() {
        this.nombreG = null;
        this.razaG = null;
        this.colorG = null;
        this.edadG = 0;
        this.toxoplasmosis = null;

    }
    public MascFelino(String nombreB, String razaB, String colorB, int edadB, String toxo) {
        this.nombreG = nombreB;
        this.razaG = razaB;
        this.colorG = colorB;
        this.edadG = edadB;
        this.toxoplasmosis = toxo;
    }
    
    //SETTERS**********************************************************************
    
    public void setNombreB(String nombreB) {
        this.nombreG = nombreB;
    } 
    
    public void setRazaB(String razaB) {
        this.razaG = razaB;
    }
    
    public void setColorB(String colorB) {
        this.colorG = colorB;
    }
    
    public void setEdadB(int edadB) {
        this.edadG = edadB;
    }
    
    public void setToxo(String toxo) {
        this.toxoplasmosis = toxo;
    }
    
    //GETTERS*********************************************************************   

    public String getNombreB() {
        return nombreG;
    }

    public String getRazaB() {
        return razaG;
    }

    public String getColorB() {
        return colorG;
    }

    public int getEdadB() {
        return edadG;
    }
   
    public String getToxo() {
        return toxoplasmosis;
    }
   
//RETORNO GETTERS*****************************************************************
    
    public String getDatos(){
        return "\nNombre:"+ nombreG+
               "\nRaza:"+ razaG+
               "\nColor:"+ colorG+
               "\nEdad:"+ edadG+   
               "\nSe encuentran libres de Toxoplasmosis?:"+ toxoplasmosis; 
    }
    
}

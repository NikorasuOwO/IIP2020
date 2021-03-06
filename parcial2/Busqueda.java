package parcial2;


/**
 * Write a description of class Busqueda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Busqueda {
    
    public static int busqueda_par(int[] array){
        
        boolean encontrado = false;
        int primer_par = 0;
        int i = 0;
        
        while(i < array.length && !encontrado){
            
            if(array[i]%2 == 0){encontrado = true; primer_par = array[i];}
            
            i++;
            
        }
        
    return primer_par;
    }
    
    public static int busqueda_cualquiera(int[] array, int valor){
        int i = 0;
        while(i < array.length && array[i] != valor){i++;}
        
    return i;
    }
    public static boolean hayRepetidor(Grupo G){
        int i = 0;
        while(i < G.numAlumnos && G.arrayGrupo[i].getNota() >= 5){
            
            
            i++;
        
        }
        if( i == G.numAlumnos){
            
           return false;
        
        }else{
            return true;
    
        }
    }
    
    public static Alumno AlumnoSumById (Grupo G, int Id){
        
        int i = 0;
        
        while(i < G.numAlumnos && G.arrayGrupo[i].getId() != Id){
            
            i++;
        
        }
        return G.arrayGrupo[i];
    }
    
    public static void main (String args[]){
        
        Alumno a1 = new Alumno("Alberto", "Martinez", 8,78,120);
        Alumno a2 = new Alumno("Pedro", "Gomez", 7,88,121);
        Alumno a3 = new Alumno("Sofía", "Pérez", 2,28,122);
        Alumno a4 = new Alumno("Nico", "Martinez", 6,98,123);
        
        Alumno[] alumnos = {a1,a2,a3,a4};
        
        Grupo G = new Grupo(alumnos);

        //int[] array = {1,3,5,6,8,2,3,30,23,5,6};
        //System.out.println(hayRepetidor(G));
        
    }
    
}

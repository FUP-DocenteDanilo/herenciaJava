package herenciajava;

public class HerenciaJava {

    public static void main(String[] args) {
        // Crear Objeto Clase Padre
        Humano adulto=new Humano();
        adulto.setNombre("Freddy");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        System.out.println();
        //Crear Objeto Clase Hija ->Hombre
        Hombre padre=new Hombre();
        padre.setNombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarce();
        System.out.println();
        //Crear Objeto Clase Hija ->Mujer
        Mujer madre= new Mujer();
        madre.setNombre("Gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
    }
    
}

package org.jorgedelira.poointerfaces.imprenta;

import org.jorgedelira.poointerfaces.imprenta.modelo.*;
import static org.jorgedelira.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("John Doe", "Ingeniero de sistemas", "Resumen laboral...");
                cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador fullstack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("George Orwell", "1984", CIENCIAFICCION);
        libro.addPagina(new Pagina("Patrón singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Faccade"));

        Informe informe = new Informe( "Martín Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}

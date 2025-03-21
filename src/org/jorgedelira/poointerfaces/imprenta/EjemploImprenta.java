package org.jorgedelira.poointerfaces.imprenta;

import org.jorgedelira.poointerfaces.imprenta.modelo.*;
import static org.jorgedelira.poointerfaces.imprenta.modelo.Genero.*;
import static org.jorgedelira.poointerfaces.imprenta.modelo.Imprimible.*;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe"), "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador fullstack")
        .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("George", "Orwell"),
                "1984",
                CIENCIAFICCION);
        libro.addPagina(new Pagina("Patrón singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe( new Persona("Martín", "Fowler"),
                new Persona("James", "Gosling"), "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });


        System.out.println(TEXTO_DEFECTO);
    }

}

package nlagregas.maven;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class App{

    public int contarL(String paraula) {
    	String[] separar = StringUtils.split(paraula, ' ');
	return (separar == null) ? 0 : separar.length;
    }

    public void greet() {
    	List<String> gree = new  ArrayList<>();
	gree.add("Hello");

	for (String greet : gree){
	   System.out.println("hey: " + greet);
	}
    }

    public App() {
        System.out.println ("Has entrado -->");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("cargando app");
        App app = new App();
	app.greet();
	int contar = app.contarL("hola hoja perro");
	System.out.println("Contar palabras: " + contar);
    }
}

package prueba.singleton02;

public class Empresa {
	//singleton con el enfoque de fabrica estatica
	private static final Empresa INSTANCE = new Empresa(); //campo privado

    private Empresa() { }
    
    public static Empresa getInstance() { return INSTANCE; }

    public void imprimeObjeto() {
        System.out.println(getInstance());
    }
    
//    Una ventaja del enfoque de fábrica estática es que le brinda la flexibilidad de cambiar 
//    de opinión acerca de si la clase es un singleton sin cambiar su API. El método de fábrica
//    devuelve la única instancia, pero podría modificarse para devolver, por ejemplo, 
//    una instancia separada para cada subproceso que la invoca. Una segunda ventaja es que puede
//    escribir una fábrica genérica de singleton si su aplicación lo requiere (Artículo 30). 
//    Una ventaja final de usar una fábrica estática es que se puede usar una referencia de método 
//    como proveedor, por ejemplo, Elvis :: instance es un Proveedor <Elvis>. 
//    A menos que una de estas ventajas sea relevante, el enfoque de campo público es preferible.
}

package prueba.singleton02;

public class Empresa {
	//singleton con el enfoque de fabrica estatica
	private static final Empresa INSTANCE = new Empresa(); //campo privado

    private Empresa() { }
    
    public static Empresa getInstance() { return INSTANCE; }

    public void imprimeObjeto() {
        System.out.println(getInstance());
    }
    
//    Una ventaja del enfoque de f�brica est�tica es que le brinda la flexibilidad de cambiar 
//    de opini�n acerca de si la clase es un singleton sin cambiar su API. El m�todo de f�brica
//    devuelve la �nica instancia, pero podr�a modificarse para devolver, por ejemplo, 
//    una instancia separada para cada subproceso que la invoca. Una segunda ventaja es que puede
//    escribir una f�brica gen�rica de singleton si su aplicaci�n lo requiere (Art�culo 30). 
//    Una ventaja final de usar una f�brica est�tica es que se puede usar una referencia de m�todo 
//    como proveedor, por ejemplo, Elvis :: instance es un Proveedor <Elvis>. 
//    A menos que una de estas ventajas sea relevante, el enfoque de campo p�blico es preferible.
}

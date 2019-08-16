package prueba.singleton01;

public class Cliente {
	//singleton con enfoque de campo público
	public static final Cliente INSTANCE = new Cliente(); // campo publico

    private Cliente() { }

    public void imprimeObjeto() {
        System.out.println(INSTANCE);
    }
    
//    La principal ventaja del enfoque de campo público es que la API deja en claro que la 
//    clase es un singleton: el campo estático público es final, por lo que siempre contendrá 
//    la misma referencia de objeto. 
//    La segunda ventaja es que es más simple.
}

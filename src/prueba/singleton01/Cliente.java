package prueba.singleton01;

public class Cliente {
	//singleton con enfoque de campo p�blico
	public static final Cliente INSTANCE = new Cliente(); // campo publico

    private Cliente() { }

    public void imprimeObjeto() {
        System.out.println(INSTANCE);
    }
    
//    La principal ventaja del enfoque de campo p�blico es que la API deja en claro que la 
//    clase es un singleton: el campo est�tico p�blico es final, por lo que siempre contendr� 
//    la misma referencia de objeto. 
//    La segunda ventaja es que es m�s simple.
}

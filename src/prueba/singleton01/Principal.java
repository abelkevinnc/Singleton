package prueba.singleton01;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente = Cliente.INSTANCE;
		cliente.imprimeObjeto();
		
		Cliente cliente2 = Cliente.INSTANCE;
		cliente2.imprimeObjeto();
		
	}
}

package prueba.singleton02;

public class Principal2 {

	public static void main(String[] args) {
		Empresa emp = Empresa.getInstance();
		Empresa emp2 = Empresa.getInstance();
		
		emp.imprimeObjeto();
		emp2.imprimeObjeto();

	}

}

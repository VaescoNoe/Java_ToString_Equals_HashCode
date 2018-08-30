package mx.com.twg;

import mx.com.twg.entity.Empleado;

public class Main {

	public static void main(String[] args) {
		Empleado emp = new Empleado("Noe",80000);
		Empleado emp_1 = new Empleado("Noe",80000);
		
		compararObjetos(emp,emp_1);

	}

	private static void compararObjetos(Empleado emp, Empleado emp_1) {
		System.out.println("Contenido objeto:\n"+emp);
		System.out.println("Contenido objeto:\n"+emp_1);
		
		if(emp==emp_1){
			System.out.println("Son iguales en direcci�n de memor�a");
		}else{
			System.out.println("No son iguales en direcci�n de memor�a");
		}
		
		if(emp.equals(emp_1)){
			System.out.println("Tienen el mismo contenido, son iguales");
		}else{
			System.out.println("No tienen el mismo contenido, no son iguales");
		}
		
		if(emp.hashCode()==emp_1.hashCode()){
			System.out.println("Tiene el mismo c�digo hash");
		}else{
			System.out.println("No tiene el mismo c�digo hash");
		}
	}

}

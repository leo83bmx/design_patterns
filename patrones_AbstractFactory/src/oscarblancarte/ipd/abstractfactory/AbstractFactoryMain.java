package oscarblancarte.ipd.abstractfactory;

import java.util.Arrays;
import oscarblancarte.ipd.abstractfactory.impl.IServiceStackAbstractFactory;
import oscarblancarte.ipd.abstractfactory.impl.ServiceStackAbstractFactory;
import oscarblancarte.ipd.abstractfactory.service.IEmployeeService;
import oscarblancarte.ipd.abstractfactory.service.IProductsService;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		//Crea una factoria especifica del tipo interfaz IServiceStackAbstractFactory la cual esta implementada por:
		//WSServiceStackImpl.java o RestServiceStackImpl.java
		//
		IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
		IEmployeeService employeeService = factory.getEmployeeService();
		IProductsService productService = factory.getProductsService();

		System.out.println("EmployeeService class > " + employeeService.getClass().getCanonicalName());
		System.out.println("ProductService class  > " + productService.getClass().getCanonicalName());

		System.out.println("getEmployee > " + Arrays.toString(employeeService.getEmployee()));
		System.out.println("getProduct  > " + Arrays.toString(productService.getProducts()));
		
		
		
		
		/* En este ejemplo se trabaja con dos familias de tipos:
		 * 
		 * WSServiceStackImpl 
		 * RestServiceStackImpl
		 * 
		 * De esta forma, segun se configure en el fichero de propiedades, se creará una descendencia acorde al tipo configurado. Se logra total compatibilidad utilizando interfaces.
		 * 
		 * 
		 * Explicacion:
		 * 
		 * Crea una factoria de familia especifica segun lo configurado en el fichero de propiedades... puede ser del tipo WSServiceStackImpl.java o RestServiceStackImpl.java
		 * 
		 * IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
		 * 
		 * 
		 * 
		 * Instancia el resto de la familia usando los metodos de la interfaz IServiceStackAbstractFactory (getEmployeeService() y getProductsService()) pero con implementacion especifica del tipo configurado en el properties
		 * Las instancias obtenidas son de un tipo de interfaz generico validas para los dos tipos de familias existentes.
		 * 
		 * IEmployeeService employeeService = factory.getEmployeeService();
		 * IProductsService productService = factory.getProductsService();
		 * 
		 */
	}
}
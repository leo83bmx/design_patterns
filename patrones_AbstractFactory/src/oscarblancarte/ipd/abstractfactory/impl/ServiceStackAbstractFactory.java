package oscarblancarte.ipd.abstractfactory.impl;

import java.util.Properties;
import oscarblancarte.ipd.abstractfactory.util.PropertiesUtil;

public class ServiceStackAbstractFactory {

	public ServiceStackAbstractFactory() {
	}

	public static IServiceStackAbstractFactory createServiceFactory() {
		Properties props = PropertiesUtil.loadProperty("META-INF/AbstractFactoryConfiguration.properties");
		String factoryClass = props.getProperty("serviceProductImplClass");
		try {
			//return (IServiceStackAbstractFactory) Class.forName(factoryClass).newInstance();
			return (IServiceStackAbstractFactory) Class.forName(factoryClass).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

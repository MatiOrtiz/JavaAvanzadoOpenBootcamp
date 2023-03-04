package Singleton;

import State.Configuracion;

public class Main {

	public static void main(String[] args) {

        //--------------------Singleton--------------------//
		Singleton singleton= Singleton.getInstance();
		singleton.setCont(15);

		Singleton singleton2= Singleton.getInstance();

		System.out.println("Valor: " + singleton.getCont() + ", en memoria: " + singleton);
		System.out.println("Valor: " + singleton2.getCont() + ", en memoria: " + singleton2);


        //--------------------Aplicacion de Configuración--------------------//
        Configuracion config= Configuracion.getInstance();
        config.setProperty1("Personalized value");
        config.setProperty2(25);

        Configuracion config2= Configuracion.getInstance();

        System.out.println("Valor: " + config.getProperty1() + ", " + config.getProperty2() + ", en memoria: " + singleton);
        System.out.println("Valor: " + config2.getProperty1() + ", " + config2.getProperty2() + ", en memoria: " + singleton);

	}

}

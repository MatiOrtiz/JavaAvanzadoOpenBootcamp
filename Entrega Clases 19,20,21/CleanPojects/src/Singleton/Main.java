package Singleton;

import State.Configuracion;

public class Main {

	public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <property1> <property2>");
            System.exit(1);
        }

        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.setCount(15);
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Valor: " + singleton.getCount() + ", en memoria: " + singleton);
        System.out.println("Valor: " + singleton2.getCount() + ", en memoria: " + singleton2);

        // Configuracion
        Configuracion config = Configuracion.getInstance();
        config.setProperty1(args[0]);
        config.setProperty2(Integer.parseInt(args[1]));
        Configuracion config2 = Configuracion.getInstance();

        System.out.println("Valor: " + config.getProperty1() + ", " + config.getProperty2() + ", en memoria: " + singleton);
        System.out.println("Valor: " + config2.getProperty1() + ", " + config2.getProperty2() + ", en memoria: " + singleton2);
    }
}

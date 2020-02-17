package com.cursoJava.cliente;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursoJava.modelo.Factura;

public class Main {

    public static void main(String[] args) {
        // Generar el contenedor de beans indicando el archivo xml
        AbstractApplicationContext contenedor =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Factura f1 = contenedor.getBean("factura1", Factura.class);
        Factura f2 = contenedor.getBean("factura2", Factura.class);
        Factura f3 = contenedor.getBean("factura3", Factura.class);
        Factura f4 = contenedor.getBean("factura4", Factura.class);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        // forzamos la eliminación de los beans
        contenedor.registerShutdownHook();
    }

}

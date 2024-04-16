package com.cerp;

/**
 * Hello world!
 *
 */

import com.cerp.modelo.Pregunta;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Proyecto Java" );
        Pregunta unaPregunta = new Pregunta(1,"La pregunta","La respuesta correcta",null);
        System.out.println(unaPregunta.getPregunta());

    }
}

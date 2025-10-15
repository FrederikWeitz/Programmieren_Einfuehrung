package org.example.zusätzliches;

public class IntUndInteger {

    public void vorführung() {
        int[] a; // Array mit primitiven Datentypen // Deklaration: eine Variable wird definiert, aber noch nicht befüllt
        a = new int[]{1, 2, 3, 4, 5, 6}; // Initialisierung des Arrays, also das 'Befüllen'
        System.out.println("int: " + a[3]); // Ausgabe
        int i = a.length; // es gibt Array-Methoden, aber keine Methoden für primitive Variablen

        Integer[] b; // Array mit einem Objekt
        b = new Integer[]{1, 2, 3, 4, 5, 6}; // Initialisierung
        System.out.println("Integer: " + b[3]);
        b.clone(); // es gibt Array-Methoden
        b[3].intValue(); // es gibt auch Integer-Methoden, weil Integer ein Objekt ist
    }

}

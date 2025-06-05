package OOP.Session20.NonAccessModifier.synchronizedExamples;

public class Counter {

    //Synchronized este folosit pentru thread safety
    //Synchronized modifier poate fi aplicat la metode si blocuri de cod

    int count;

    synchronized void increment() {
        count++;
    }

}

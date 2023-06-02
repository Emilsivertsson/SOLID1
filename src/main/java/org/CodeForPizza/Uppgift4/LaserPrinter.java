package org.CodeForPizza.Uppgift4;

public class LaserPrinter implements Printer{
    @Override
    public String print(String message) {
        return "this is printed with a laser";
    }

    @Override
    public String scan() {
        return "this is scanned with a laser";
    }
}

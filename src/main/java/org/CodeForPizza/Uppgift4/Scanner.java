package org.CodeForPizza.Uppgift4;

public class Scanner implements Printer{
    @Override
    public String print(String message) {
        return "this is printed with a scanner";
    }

    @Override
    public String scan() {
        return "this is scanned with a scanner";
    }
}

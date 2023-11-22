package com.raihan.Collections;

public class Customer {
    private boolean _hasBeenServed;
    private String _name;

    public Customer(String name){
        _hasBeenServed = false;
        _name = name;
    }

    public void serve(){
        _hasBeenServed = true;
        System.out.println(_name + " has been served!");
    }

    @Override
    public String toString() {
        return _name;
    }
}

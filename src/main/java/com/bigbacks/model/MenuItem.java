package com.bigbacks.model;

public abstract class MenuItem implements ItemPrice{

        //Attributes ======================
        // store name ("Custom Sandwich", "Cola", "Chips")
    private String name;
        // store size (4", 8", 12" -> S, M, L)
    private char size;

        //constructor===================
        // takes name and size to initialize the common fields

    public MenuItem(String name, char size) {
        this.name = name;
        this.size = size;
    }


    //getters======================
        // standard getters for name and size

    public String getName() {return name;}

    public char getSize() {return size;}

    //setters======================
    public void setName(String name) {this.name = name;}

    public void setSize(char size) {this.size = size;}

    //derived getters==================
        // public abstract double getPrice(); <-- Every child MUST calculate this

    @Override
    public abstract double getPrice();

  }

package com.company;

public class Department {

    protected String name;
    protected int numberOfWorker;

    public static int number;


    // Do not change anything in this method
    public String getName() {
        return name;
    }


    // Fill in the blanks.
    public Department(String name, int numberOfWorker) {

        this.name= name;
        this.numberOfWorker= numberOfWorker;
        number++;



    }

    // Erase the content. Fill in the blanks. If name and numberOfWorker are equal, it returns true
    @Override
    public boolean equals(Object obj) {
        if (obj.equals(name)) {
            return true;
        }

        else return obj.equals(numberOfWorker);


    }

    // Erase the content. Fill in the blanks. Format: [name]/[numberOfWorker]
    // For example: Android/number of worker : 30
    @Override
    public String toString() {

        return name +"/number of worker : " + numberOfWorker;

    }

}
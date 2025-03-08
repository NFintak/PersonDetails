package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        int i = 0;// create a `counter`
        StringBuilder stringBuilder = new StringBuilder();
        while (i < personArray.length) {// while `counter` is less than length of array
            // begin loop
            Person currentPerson = this.personArray[i];// use `counter` to identify the `current Person` in the array
            String personFirstName = currentPerson.getFirstName();
            String personLastName = currentPerson.getLastName(); // get `string Representation` of `currentPerson`
            result = stringBuilder.append("\nMy first name is " + personFirstName)
                    .append("\nMy last name is " + personLastName).toString(); //"\nMy first name is " + personFirstName + "\nMy last name is " + personLastName; // append `stringRepresentation` to `result` variable
            i++;
        }// end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < personArray.length; i++) {
            // begin loop
            Person currentPerson = this.personArray[i];// use `counter` to identify the `current Person` in the array
            String personFirstName = currentPerson.getFirstName();
            String personLastName = currentPerson.getLastName();// get `string Representation` of `currentPerson`
            result = stringBuilder.append("\nMy first name is " + personFirstName)
                    .append("\nMy last name is " + personLastName).toString();// append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

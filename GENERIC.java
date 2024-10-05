class GEN<T> {
    T VALUE;

    // Constructor
    GEN(T VAL) {
        VALUE = VAL;
    }

    // Method to return the value
    T GETVAL() {
        return VALUE;
    }

    // Method to show the type of the object
    void showtype(T obj) {
        System.out.println("The type of the class: " + obj.getClass().getName() +
                           " and type of VALUE is: " + VALUE.getClass().getName());
    }
}

class GENERIC {
    public static void main(String args[]) {
        // Creating object with Integer type
        GEN<Integer> obj = new GEN<Integer>(43);
        System.out.println("Calling GETVAL using int: " + obj.GETVAL());

        // Calling showtype method and passing the integer value
        obj.showtype(43);

        // Creating object with String type
        GEN<String> obj2 = new GEN<String>("Likhith");
        System.out.println("Calling GETVAL using string: " + obj2.GETVAL());

        // Calling showtype method and passing the string value
        obj2.showtype("Likhith");
    }
}

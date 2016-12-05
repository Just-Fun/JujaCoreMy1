package ua.com.juja.presentations.oop.modificators;


import ua.com.juja.presentations.oop.ModificatorsDemo;

public class SubModificatorsDemo extends ModificatorsDemo {
    public static void main(String[] args) {
        SubModificatorsDemo modificators = new SubModificatorsDemo();

        //access to public
        int i = modificators.publicField;
        modificators.publicMethod();

        //access to protected
        i = modificators.protectedField;
        modificators.protectedMethod();

        //access to package-private
//        i = modificators.packagePrivateField;
//        modificators.packagePrivateMethod();

        //access to private
//        i = modificators.privateField;
//        modificators.privateMethod();

    }


}

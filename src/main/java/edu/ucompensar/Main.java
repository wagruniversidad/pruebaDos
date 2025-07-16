package edu.ucompensar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("mensaje creado en consolo y SUPERVISADO EN GITHUB ");

        int variableUno, VariableDos;
        variableUno = 10;
        VariableDos = 20;
        System.out.println("variableUno: " + variableUno);
        System.out.println("VariableDos: " + VariableDos);

        boolean variableTF=true;
        if (variableTF)
            System.out.println("variableTF: " + variableTF);
        variableTF=false;
        if (!variableTF)
            System.out.println("variableTF modificacda: " + variableTF);

    }
}
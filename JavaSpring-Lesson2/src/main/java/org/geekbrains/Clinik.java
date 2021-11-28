package org.geekbrains;

public class Clinik {
    {
        System.out.println("Clinik greate");
    }
    private NewPacient pacient;

    public void Priem(){
        this.pacient.doSomething();
    };

    public void setPacient(NewPacient pacient){
        this.pacient=pacient;
    }
}

package ejercicioenclase.Ejercicios;

public class EmpleadoPorHora extends Empleado{

    private int horas;

    public EmpleadoPorHora(int horas){
        this.horas = horas;
    
    }
    @Override
    public double calcularSalario(){
        return horas*20.0;
    }
}

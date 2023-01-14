public class Main {
    public static void main(String[] args) {

    Cliente cliente = new Cliente();

    cliente.edad =30;
    cliente.nombre="Oscar LR";
    cliente.telefono=39394;
    cliente.setCredito(30000);
        System.out.println("DATOSS DE CLIENTE");
        System.out.println("Edad: "+cliente.edad+"\nTelefono: "+cliente.telefono+"\nNombre: "+cliente.nombre+"\nCredito: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.edad =30;
        trabajador.nombre="Oscar LR";
        trabajador.telefono=39394;
        trabajador.setSalario(20000);

        System.out.println("\nDATOS DE TRABAJADOR");
        System.out.println("Edad: "+trabajador.edad+"\nTelefono: "+trabajador.telefono+"\nNombre: "+trabajador.nombre+"\nCredito: "+trabajador.getSalario());
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;



}

class Cliente extends Persona{
   private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario=salario;
    }
}

package ud3_2_Practicas;

public class Caballo {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private int establo;
    private boolean competidor;
    private String categoría;

    /* public Caballo(String nombre, int establo){
        this.nombre = nombre;
        this.establo = establo;
    } */


    public Caballo(String nombre, String raza, int edad, double peso, int establo, boolean competidor, String categoría) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.establo = establo;
        this.competidor = competidor;
    }

    public void competidor(){}


    public String getNombre() {
        return this.nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstablo() {
        return this.establo;
    }

    public void setEstablo(int establo) {
        this.establo = establo;
    }

    public boolean isCompetidor() {
        return this.competidor;
    }

    public boolean getCompetidor() {
        return this.competidor;
    }


    public void come(String comida) {
        if (comida.equals("zanahoria")) {
          System.out.println("Qué rico, gracias!");
        } else {
          System.out.println("Prefiero las zanahorias :(");
        }
      }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", raza='" + getRaza() + "'" +
            ", edad='" + getEdad() + "'" +
            ", peso='" + getPeso() + "'" +
            ", establo='" + getEstablo() + "'" +
            "}";
    }


}



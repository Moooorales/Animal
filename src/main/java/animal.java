public class animal {
    public String nombre;
    public int edad;
    public String tipo;

    public animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public void comer() {
        System.out.println(nombre+" Esta cominedo. ");
    }

    public void dormir() {
        System.out.println( nombre+ " Esta durmiendo. ");
    }

    public void hacerSonido() {
        System.out.println(nombre+ " Hace: guao guao. ");
    }
    public static void main(String[] args) {
        animal elefante = new animal("Dumbo", 10, "Elefante");
        animal perro = new animal("Dipsy", 2, "Perro");

        elefante.comer();
        perro.hacerSonido();
    
    }
}
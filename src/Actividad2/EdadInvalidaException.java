package Actividad2;


// Excepción personalizada de tipo Checked al extender de Exception [cite: 54, 201]
public class Principal extends Exception {
    private final int edadIngresada; // Atributo para almacenar el valor erróneo [cite: 202]

    // Constructor con el mensaje descriptivo y almacenamiento del atributo [cite: 202]
    public EdadInvalidaException(int edadIngresada, String mensaje) {
        super(mensaje);
        this.edadIngresada = edadIngresada;
    }

    // Getter del atributo específico [cite: 202]
    public int getEdadIngresada() {
        return edadIngresada;
    }
}
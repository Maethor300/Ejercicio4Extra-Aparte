package Entidades;

public class Cliente {
        private int id;
        private String nombre;
        private int edad;
        private int altura;
        private double peso;
        private String objetivo;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }

        public int getAltura() {
                return altura;
        }

        public void setAltura(int altura) {
                this.altura = altura;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public String getObjetivo() {
                return objetivo;
        }

        public void setObjetivo(String objetivo) {
                this.objetivo = objetivo;
        }
        public String toString(){
                return "Clientes: " + getNombre() + " " + getId();
        }
}

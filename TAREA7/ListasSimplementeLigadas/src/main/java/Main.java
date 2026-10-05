public class Main {
    static void main(String[] args) {
        Perro perro1 = new Perro("pug", 3, true);
        Perro perro2 = new Perro("Bulldog", 2, false);
        Perro perro3 = new Perro("Chihuahua", 4, true);
        Perro perro4 = new Perro("Golden Retriever", 1, false);

        ListaLigadaADT listaPerros = new ListaLigadaADT<Perro>();
        System.out.println(listaPerros.estaVacia());
        listaPerros.agregar(perro1);
        listaPerros.agregar(perro2);
        listaPerros.agregar(perro3);
        listaPerros.agregar(perro4);
        System.out.println(listaPerros.estaVacia());
        listaPerros.transversal();
        System.out.println("Tamaño: " + listaPerros.getTamanio());
        Perro perro5 = new Perro("Pastor alemán", 1, true);
        listaPerros.agregarAlInicio(perro5);
        System.out.println("============");
        listaPerros.transversal();
        System.out.println("Tamaño: " + listaPerros.getTamanio());
        Perro perro6 =new Perro("Xolo", 5, true);
        listaPerros.agregarDespuesDe(perro2, perro6);
        System.out.println("============");
        listaPerros.transversal();
        System.out.println("Tamaño: " + listaPerros.getTamanio());
        listaPerros.eliminarElFinal();
        System.out.println("============");
        listaPerros.transversal();
        System.out.println("Tamaño: " + listaPerros.getTamanio());
        listaPerros.eliminarElPrimero();
        System.out.println("============");
        listaPerros.transversal();
        System.out.println("Tamaño: " + listaPerros.getTamanio());
        listaPerros.actualizar(perro2, perro4);
        System.out.println("============");
        listaPerros.transversal();
        System.out.println("Tamaño: " + listaPerros.getTamanio());
        System.out.println("Posición perro 6: " + listaPerros.buscar(perro6));






    }
}

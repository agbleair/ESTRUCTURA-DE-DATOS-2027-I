public class Main {
    static void main(String[] args) {


        Nodo<String> head = new Nodo<String>("Al", new Nodo("B", new Nodo("C", new Nodo("De", new Nodo("Mc", new Nodo("Zi"))))));
        System.out.println("Lista inicial: " + head);
        System.out.println("==========================");
        System.out.println("Primer dato de la lista: " + head.getDato());
        System.out.println("==========================");
        Nodo cursor = new Nodo<>();
        cursor = head;

        while(cursor.getSiguiente() != null){
            cursor= cursor.getSiguiente();
        }
        System.out.println("último dato de la lista: " + cursor.getDato());
        System.out.println("==========================");
        cursor = head;

        while (cursor != null && !cursor.getDato().equals("De")) {
            cursor = cursor.getSiguiente();
        }
        if (cursor != null) {
            Nodo nuevo = new Nodo("Fe", cursor.getSiguiente());
            cursor.setSiguiente(nuevo);
        }
        System.out.println("Lista nueva: " + head);
        System.out.println("==========================");

        Nodo nuevo2 = new Nodo<>("Zz");
        cursor = head;
        while (cursor.getSiguiente() != null) {
            cursor = cursor.getSiguiente();
        }
        cursor.setSiguiente(nuevo2);
        cursor = head;
        System.out.println("Lista con dato agregado al final: " + head);
        System.out.println("==========================");

        cursor = head;
        head = new Nodo<>("Aa", cursor.getSiguiente());
        System.out.println("Lista final: " + head);

    }

}

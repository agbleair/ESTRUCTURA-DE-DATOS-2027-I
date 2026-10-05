public class ListaLigadaADT<T> {
    private Nodo<T> head;

    public ListaLigadaADT(){
        this.head = null;
    }

    public boolean estaVacia() {
        return head == null;
    }

    public void agregar(T dato){
        if(head == null){
            this.head = new Nodo<>(dato);
        }else{
            Nodo<T> actual = head;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo<>(dato));

        }
    }
    public void agregarAlInicio(T dato){
        Nodo<T> nuevo = new Nodo<>(dato, head);
        head = nuevo;
    }

    public void transversal(){
        if(head == null){
            System.out.println("Vacia");
        }else {
            Nodo<T> actual = head;
            do{
                System.out.println("|" + actual.getDato());
                actual = actual.getSiguiente();
            }while(actual != null);
        }
    }

    public void actualizar(T aBuscar, T nuevoValor){
        if(head == null){
            System.out.println("Vacia");
        }else{
            Nodo<T> actual = this.head;
            while(!actual.getDato().equals(aBuscar)){
                actual = actual.getSiguiente();
            }
            actual.setDato(nuevoValor);
        }
    }
    public int getTamanio(){
        int contador = 0;
        if(head == null){
            return contador;
        }else {
            Nodo<T> actual = head;
            do{
                contador++;
                actual = actual.getSiguiente();
            }while(actual != null);
            return contador;
        }
    }
    public void agregarDespuesDe(T referencia, T valor ){
        if(head == null){
            System.out.println("Vacia");
        }else{
            Nodo<T> actual = this.head;
            while(!actual.getDato().equals(referencia)){
                actual = actual.getSiguiente();
            }
            Nodo<T> nuevoNodo = new Nodo<>(valor, actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminarElPrimero(){
        if(head == null){
            System.out.println("Lista vacía");
        }else{
            head = head.getSiguiente();
        }
    }
    public void eliminarElFinal(){
        if(head == null){
            System.out.println("Lista vacía");
        }else if(head.getSiguiente() == null){
            head = null;
        }else{
            Nodo<T> actual = this.head;
            while(actual.getSiguiente().getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
        }
    }

    public int buscar(T valor){
        int indice = 0;
        Nodo<T> actual = head;
        while(actual != null){
            if(actual.getDato().equals(valor)){
                return indice;
            }
            actual = actual.getSiguiente();
            indice++;
        }
        return -1;
    }
}

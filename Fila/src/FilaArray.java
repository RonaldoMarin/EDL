public class FilaArray implements IFila {

    protected Object[] elementos;
    protected int inicio;
    protected int fim;
    protected int incremento;

    public FilaArray(int capacidade) {
        this.elementos = new Object[capacidade];
        this.inicio = -1;
        this.fim = -1;
        this.incremento = 0;
    }

    @Override
    public void enqueue(Object o){
        // Se (tamanho() = N - 1)então
        //     throw EFilaCheia
        // senão
        // Q[f] ← o
        // f ← (f + 1) % N
        if (size() == this.elementos.length -1){
            throw new FilaVaziaException("Ta chein");
        }
        this.elementos[this.fim] = o;
        this.fim = (this.fim + 1) % this.elementos.length;
    }

    @Override
    public Object dequeue(){
        if (isEmpty()){
            throw new FilaVaziaException("Fila se encontra vazia!");
        }
        Object o = this.elementos[this.inicio + 1];
        this.inicio = (this.inicio + 1) % this.elementos.length;
        return o;
    }

    @Override
    public Object first() {
        if (isEmpty()) {
            throw new FilaVaziaException("Fila se encontra vazia!");
        }
        return elementos[this.fim];
    }

    @Override
    public int size(){
        return (this.elementos.length - this.inicio + this.fim) % this.elementos.length;
    }

    @Override
    public boolean isEmpty(){
        return this.inicio == this.fim;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= inicio; i++) {
            sb.append(elementos[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Método apenas para fim educativos
    @Override
    public void imprimirArray(){
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.elementos[i]); 
        }
    }

    public static void main(String[] args){
        FilaArray fila = new FilaArray(5);
        fila.enqueue(1);
        fila.imprimirArray();
        // System.out.println(fila.dequeue());
        System.out.println("Primeiro elemento: " + fila.first());
        System.out.println("Tamanho da fila: " + fila.size()); 
        System.out.println("Está vazia? " + fila.isEmpty()); 
    }
}
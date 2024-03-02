public abstract class FilaArray implements IFila {

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
    public abstract void enqueue(Object o);

    @Override
    public abstract Object dequeue();

    @Override
    public Object first() {
        if (isEmpty()) {
            throw new FilaVaziaException("Fila se encontra vazia!");
        }
        return elementos[this.fim];
    }

    @Override
    public abstract int size();

    @Override
    public abstract boolean isEmpty();

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
        FilaArray fila = new FilaArraySimples(5);
        fila.enqueue(1);
        fila.imprimirArray();
        // System.out.println(fila.dequeue());
        System.out.println("Primeiro elemento: " + fila.first());
        System.out.println("Tamanho da fila: " + fila.size()); 
        System.out.println("Está vazia? " + fila.isEmpty()); 
    }
}
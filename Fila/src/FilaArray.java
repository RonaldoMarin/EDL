public class FilaArray implements IFila {

    Object[] elementos;
    int inicio;
    int fim;
    int incremento;

    public FilaArray(int capacidade) {
        this.elementos = new Object[capacidade];
        this.inicio = -1;
        this.fim = -1;
        this.incremento = 0;
    }

    @Override
    public void enqueue(Object o){

        if (size() == this.elementos.length -1){
            throw new FilaVaziaException("Ta chein");
        }else{
            if (isEmpty()){
                this.inicio = 0;  
            }
            this.fim = (this.fim + 1) % this.elementos.length;
            this.elementos[this.fim] = o;
        }
    }

    @Override
    public Object dequeue(){
        if (isEmpty()){
            throw new FilaVaziaException("Fila se encontra vazia!");
        }
        Object o = this.elementos[this.inicio];
        this.inicio = (this.inicio + 1) % this.elementos.length;
        return o;
    }

    @Override
    public Object first() {
        if (isEmpty()) {
            throw new FilaVaziaException("Fila se encontra vazia!");
        }
        return elementos[this.inicio];
    }

    @Override
    public int size(){
        return (this.elementos.length - this.inicio + this.fim) % this.elementos.length;
    }

    @Override
    public boolean isEmpty(){
        return this.inicio == this.fim;
    }


    public static void main(String[] args){
        FilaArray fila = new FilaArray(5);
        fila.enqueue(3);
        fila.enqueue(1);
        fila.enqueue(99);
        fila.enqueue(2);
        fila.enqueue(20);
        System.out.println("");
        System.out.println(" ");
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println("Primeiro elemento: " + fila.first());
        fila.enqueue(999);
        fila.enqueue(99);
        System.out.println("");
        System.out.println("Tamanho da fila: " + fila.size()); 
        System.out.println("Está vazia? " + fila.isEmpty()); 
    }
}
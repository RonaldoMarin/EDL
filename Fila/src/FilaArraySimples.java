public class FilaArraySimples extends FilaArray {

    public FilaArraySimples(int capacidade) {
        super(capacidade);
    }

    @Override
    public void enqueue(Object o) {
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
    public Object dequeue() {
        if (isEmpty()){
            throw new FilaVaziaException("Fila se encontra vazia!");
        }
        Object o = this.elementos[this.inicio + 1];
        this.inicio = (this.inicio + 1) % this.elementos.length;
        return o;
    }

    @Override
    public int size() {
        return (this.elementos.length - this.inicio + this.fim) % this.elementos.length;
    }

    @Override
    public boolean isEmpty(){
        return this.inicio == this.fim;
    }
}
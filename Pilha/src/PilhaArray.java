public class PilhaArray implements Pilha{

    private Object[] elementos; 
    private int topo; 
    private int incremento;

    public PilhaArray(int capacidade) { // Construtor para definir a capacidade da pilha
        this.elementos = new Object[capacidade];
        this.topo = -1;
        this.incremento = 0;
    }

    @Override
    public boolean isEmpty(){
        return this.topo == -1;
    }

    @Override
    public int size(){
        return this.topo + 1;
    }

    @Override
    public Object top(){
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A pilha está vazia!");
        }
        return this.elementos[this.topo];
    }

    @Override
    public void push(Object valor){
        if (this.topo == this.elementos.length - 1){
            Object[] novoArray;
            if (this.incremento > 0){
                novoArray = new Object[this.elementos.length + this.incremento];
            }else{
                novoArray = new Object[this.elementos.length * 2];
            }
            for (int i=0; i < this.elementos.length; i++){
                novoArray[i] = this.elementos[i];
            }
            this.elementos = novoArray;
        }
        this.topo++;
        this.elementos[this.topo] = valor;
    }

    @Override
    public Object pop(){
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("A pilha está vazia!");
        }else{
            Object ultimoElemento = this.elementos[this.topo];
            this.elementos[this.topo] = null;
            this.topo--;
            return ultimoElemento;
        }
    }

    // Método apenas para fim educativos
    @Override
    public void imprimirArray(){
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.elementos[i]); 
        }
    }

    // Método apenas para fim educativos
    @Override
    public int tamanhoArray(){
        return this.elementos.length;
    }

    public static void main(String[] args){
        // PilhaArray pilha = new PilhaArray(10);
        Pilha pilha = new PilhaArray(2);

        for (int i = 0; i < 1025; i++){
            pilha.push(i);
        }

        pilha.imprimirArray();
        System.out.println("Capacidade máxima: " + pilha.tamanhoArray());
        System.out.println("Tamanho da pilha: " + pilha.size()); 

        

        // System.out.println("Pilha ta vazia: " + pilha.isEmpty()); 
        // System.out.println("Topo da pilha: " + pilha.top());
        // System.out.println("");
        // System.out.println("Elemento removido: " + pilha.pop()); 
        // System.out.println("Tamanho da pilha: " + pilha.size()); 
        // System.out.println("Topo da pilha: " + pilha.top());
        // System.out.println("");
        

    }
}

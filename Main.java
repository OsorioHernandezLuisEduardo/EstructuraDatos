public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Grafo grafo = new Grafo();
        grafo.agregarNodo("A");
        grafo.agregarNodo("B");
        grafo.agregarNodo("C");
        grafo.agregarArista("A","B");
        grafo.agregarArista("A","C");
        grafo.agregarArista("B","C");
        grafo.agregarArista("C","A");
        System.out.println(grafo.toString());
    }
}
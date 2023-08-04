// demonstra o escopo dos blocos
class EscopeDemo {
    public static void main(String args[]) {
        int x; // conhecida pelo código dentro de main()

        x = 10;
        if(x == 10) { //inicia novo escopo
        int y = 20; // conhecida apenas nesse bloco

        // tanto x quanto y são conhecidas aqui.
        System.out.println("x e y: " + x + " " + y);
        x = y * 2;
    }
     // y = 100; //Erro! Y não é conhecida aqui --- y está fora do esopo

    //x ainda é conhecida aqui.
    System.out.println("x is " + x);
    }
}
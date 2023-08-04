// Os efeitos colaterais podem ser importantes
class SideEffects {
    public static void main(String args[]) {
        int i;

        i = 0;

        /*
         *  Aqui, (i) é incrementada mesma que a instrução if seja falsa.
         */
        if(false & (++i < 100))
        System.out.println("This won't be displayed"); 
        System.out.println("if statement exceuted: " + i); //exibe 1

        /*Nesse caso, (i) não é incrementada por que o
         * operador de curto-circuito ignora o incremente.
         */

         if(false && (i++ < 100))
         System.out.println("this won't be displayed");
         System.out.println("if statement executed: " + i);
         //continua exibindo 1
    }
}

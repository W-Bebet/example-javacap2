// Demonstra os operadores de curto-circuito.
class SCops {
    public static void main(String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if(d !=0 && (n % d) == 0) 
        System.out.println(d + " is a factor of " + n);
        
        d = 0; // configura d com zero

        // já que d é igual a zero, o segundo operando não é avaliado.
        if(d != 0 && (n % d) == 0) 
        System.out.println(d + " is a factor of " + n);
        
        /*
         *  /tente a mesma coisa sem o operador de curto-circuito.
         * isso causará um erro de divisão por zero.
         */

         if(d != 0 & (n % d) == 0) 
         System.out.println(d + " is a factor of " + n);
         
    }
}
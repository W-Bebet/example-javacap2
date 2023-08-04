// Demonstra a conversão automática de long para double.
class LtoD {
    public static void main(String args[]) {
        long = L;
        double = D;

        L = 100123285L;
        D = L; // Conversão automática de long para double.

        System.out.println("L and D: " + L + " " + D);
    }
}

class LtoD {
    public static void main(String args[]) {
        long = L;
        double = D;

        D = 100123285.0;
        L = D; //Inválido !!! Não há conversão automática de double para long

        System.out.println("L and D: " + L + " " + D);
    }
}
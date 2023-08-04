/*
 * Usa o teorema de Pitágoras para econtrar o comprimento
 * da hipotenusa dados os comprimentos dos dois lados opostos
 */
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        y = 3;
        x = 4;

        z = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse is " + z);
    }
}

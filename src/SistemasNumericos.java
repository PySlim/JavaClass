public class SistemasNumericos {
    public static void main(String[] args) {
        //sistema decimal
        int numeroDecimal = 500;
        System.out.println("numeroDecimal primitivo= " + numeroDecimal);
        //sistema binario
        System.out.println("número Binario de numeroDecimal = " + Integer.toBinaryString(numeroDecimal));
        //conversión de string a número
        int numerobinario = 0b111110100;
        System.out.println("numerobinario = " + numerobinario);

        //Sistema octal
        System.out.println("numerobinario a octal= " + Integer.toOctalString(numerobinario));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Numero hexadecimal de " + numeroDecimal + " = "+Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}

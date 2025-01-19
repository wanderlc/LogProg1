public class CalculaInss {
    public static double calcula(double valor) {
        double desc = 0;

        if (valor <= 1212.00) {
            desc = valor * 0.075;
        } else if (valor <= 2427.35) {
            desc = valor * 0.09;
        } else if (valor <= 3641.03) {
            desc = valor * 0.12;
        } else
            desc = valor * 0.14;
        return desc;
    }
}
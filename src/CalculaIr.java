public class CalculaIr {
    public static double calcula(double valor) {
        double desc = 0;

        if (valor <= 1903.98) {
            desc = 0;
        } else if (valor <= 2826.65) {
            desc = valor * 0.075;
        } else if (valor <= 3751.05) {
            desc = valor * 0.15;
        } else if (valor <= 4664.68) {
            desc = valor * 0.225;
        } else
            desc = valor * 0.275;

        return desc;
    }
}
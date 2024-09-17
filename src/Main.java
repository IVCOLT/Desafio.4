import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares.
// O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la
// calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.

//media do retangulo (P), vai ser dividido pela media do retangulo (A). Então sera M(P)/M(A)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura e largura da parede respectivamente: ");
        double hp = scanner.nextDouble();
        double lp = scanner.nextDouble();

        System.out.println("Digte a altura e largura do azulejo respectivamente: ");
        double ha = scanner.nextDouble();
        double la = scanner.nextDouble();

        double qtA = (hp*lp) / (ha*la) ;

        System.out.println("A quantidade de azulejos é de: "+qtA+".");

    }
}
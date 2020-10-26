/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_rpg;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Jogo_RPG {

    /**
     * @param args the command line arguments
     */
    //@SuppressWarnings("empty-statement")
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Quer saber mais da história ?");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção Instruções: ");

                    System.out.println("Escolha JOGAR para iniciar ou HISTÓRIA para ler a história do mundo de CAMANAPA.\n"
                            + "O jogo consiste em 7 desafios baseados na matéria Conceitos de Computação, ou seja, você terá de responder perguntas envolvendo conversão de base, mapa de Karnaugh etc.\n"
                            + "Ao acertar, pressione ENTER para continuar. Ao errar, pressione ENTER para tentar novamente.\n"
                            + "Você possuirá 3 vidas, logo, poderá errar 3 vezes durante o jogo. Caso você perca todas as vidas, voltará ao início.\n"
                            + "Acerte todas as perguntas com o mínimo de erros para vencer! Boa sorte!");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção Jogar");
                    break;

                case 3:
                    System.out.println("Você escolheu a opção Créditos");

                    System.out.println("O jogo foi criado e desenvolvidos por: Maria Carolina, Nadine Silva, Paola Soares, Rafael Camilo;");
                    break;
                case 4:
                    System.out.println("Você escolheu a opção saber mais da história");
                    System.out.println("Há muito tempo, em uma galáxia distante... Existia a terra de Camanapa."
                            + "Seu nome se deu em homenagem a seus guardiões e desenvolvedores, conhecidos por suas iniciais Ca, Ma, Na e Pa, possuindo, respectivamente, os poderes do Ar, da Água, do Fogo e da Terra.\n"
                            + "Unidos, possuíam também poderes tecnológicos para que Camanapa estivesse em constante evolução. Todos que ali habitavam aproveitavam o equilíbrio entre natureza e tecnología, e passavam suas vidas buscando conhecimento para que esse equilíbrio fosse mantido e aprimorado.\n"
                            + "Porém, lideranças de diferentes partes do planeta buscavam tomar esse poder das mãos dos guardiões originais e estabelecer uma nova ordem. Iniciou-se assim a Grande Guerra.\n"
                            + "Liderados pelo grande Takeo, os mestres das regiões de Java e da Computação travaram uma disputa contra os guardiões de Camanapa, que por serem em menor número, foram derrotados e exilados do planeta.\n"
                            + "Vagando pelo universo afora, pensando e avaliando soluções para tomar o poder de sua terra de volta, os guardiões decidiram que a melhor pessoa para lidar com a situação e derrotar Takeo seria um grande jogador de RPG. Takeo gostava muito de jogos, especialmente RPG, então sua competição para decidir o domínio do planeta girava em torno de um jogo de Conceitos de Computação.\n"
                            + "Os guardiões, depois de muita pesquisa, descobriram que os grandes jogadores se encontravam no planeta Terra.\n"
                            + "E é aí onde, literalmente, o jogador entra na história.");
                    break;
                case 5:
                    System.out.println("Você escolheu a opção Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }
}

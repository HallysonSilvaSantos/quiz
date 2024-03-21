import java.util.Scanner;
public class quiz {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho1.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
        cabecalho1.Aluno = "Aluno: Hallyson Silva Santos";
        cabecalho1.Professor = "Professor: Brenno Pimenta";
        cabecalho1.Disciplina = "Disciplina: Algoritmo e Programaçao II";
        cabecalho1.Inicio = "Bem Vindo ao Quiz!";
        cabecalho1.escrevaCabecalho();


        questoes questoes1 = new questoes();
        questoes1.questoes = "1- Qual a capital do Brasil?";
        questoes1.A = "A) Goiânia";
        questoes1.B = "B) Aparecida de Goiânia";
        questoes1.C = "C) São Paulo ";
        questoes1.D = "D) Brasília ";
        questoes1.E = "E) Rio de Janeiro ";
        questoes1.escrevaquestao();
        questoes1.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        String resposta = (String) sc.nextLine();
        if (questoes1.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("====================================================================== ");
        questoes questoes2 = new questoes();
        questoes2.questoes = "2- Qual o nome do  atual prefeito de Goiânia neste ano de 2024?";
        questoes2.A = "A) Iris Rezende";
        questoes2.B = "B) Maguito Vilela";
        questoes2.C = "C) Rogério Cruz";
        questoes2.D = "D) Paulo Garcia";
        questoes2.E = "E) Nenhuma das Anteriores";
        questoes2.escrevaquestao();
        questoes2.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes2.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes3 = new questoes();
        questoes3.questoes = "3- Quais os países que têm a maior e a menor expectativa de vida do mundo? ?";
        questoes3.A = "A) Austrália e Afeganistão";
        questoes3.B = "B) Japão e Serra Leoa";
        questoes3.C = "C) Itália e Chade";
        questoes3.D = "D) Brasil e Congo";
        questoes3.E = "E) Estados Unidos e Angola";
        questoes3.escrevaquestao();
        questoes3.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes4 = new questoes();
        questoes4.questoes = "4- Qual é a cor da caixa-preta do avião?";
        questoes4.A = "A) Vermelha";
        questoes4.B = "B) Verde";
        questoes4.C = "C) Preta";
        questoes4.D = "D) Azuld" +
                "";
        questoes4.E = "E) Laranja";
        questoes4.escrevaquestao();
        questoes4.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes4.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes5 = new questoes();
        questoes5.questoes = "5- Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?";
        questoes5.A = "A) A Filosofia";
        questoes5.B = "B) A Biologia";
        questoes5.C = "C) A Matemática";
        questoes5.D = "D) A Mitologia";
        questoes5.E = "E) A Astronomia";
        questoes5.escrevaquestao();
        questoes5.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes5.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes6 = new questoes();
        questoes6.questoes = "6- Qual o maior animal terrestre?";
        questoes6.A = "A) Baleia Azul";
        questoes6.B = "B) Elefante africano";
        questoes6.C = "C) Dinossauro";
        questoes6.D = "D) Tubarão Branco";
        questoes6.E = "E) Girafa";
        questoes6.escrevaquestao();
        questoes6.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes6.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes7 = new questoes();
        questoes7.questoes = "7- As pessoas de qual tipo sanguíneo são consideradas doadores universais?";
        questoes7.A = "A) Tipo A";
        questoes7.B = "B) Tipo B";
        questoes7.C = "C) Tipo AB";
        questoes7.D = "D) Tipo O";
        questoes7.E = "E) Tipo ABO";
        questoes7.escrevaquestao();
        questoes7.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes7.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes8 = new questoes();
        questoes8.questoes = "8- Quantos graus são necessários para que dois ângulos sejam complementares?";
        questoes8.A = "A) 45";
        questoes8.B = "B) 60";
        questoes8.C = "C) 90";
        questoes8.D = "D) 180";
        questoes8.E = "E) 360";
        questoes8.escrevaquestao();
        questoes8.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes8.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes9 = new questoes();
        questoes9.questoes = "9- Quais as maiores pandemias da história?";
        questoes9.A = "A) Peste negra e covid-19";
        questoes9.B = "B) Gripe espanhola e câncer";
        questoes9.C = "C) Cólera e colesterol";
        questoes9.D = "D) Varíola e hipertensão";
        questoes9.E = "E) Asma e Gripe espanhola";
        questoes9.escrevaquestao();
        questoes9.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes9.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes10 = new questoes();
        questoes10.questoes = "10- O sushi é um prato original de qual país?";
        questoes10.A = "A) Tailândia";
        questoes10.B = "B) China";
        questoes10.C = "C) Coreia do Sul";
        questoes10.D = "D) Japão";
        questoes10.E = "E) Nenhuma das anteriores";
        questoes10.escrevaquestao();
        questoes10.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes10.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes11 = new questoes();
        questoes11.questoes = "11- Qual é o animal que aparece no logotipo da Ferrari?";
        questoes11.A = "A) Cachorro";
        questoes11.B = "B) Leão";
        questoes11.C = "C) Tigre";
        questoes11.D = "D) Leopardo";
        questoes11.E = "E) Cavalo";
        questoes11.escrevaquestao();
        questoes11.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes11.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes12 = new questoes();
        questoes12.questoes = "12- Qual é o nome da empresa de tecnologia que criou o iPhone?";
        questoes12.A = "A) Apple";
        questoes12.B = "B) Amazon";
        questoes12.C = "C) Google";
        questoes12.D = "D) Microsoft";
        questoes12.E = "E) Samsung";
        questoes12.escrevaquestao();
        questoes12.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes12.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes13 = new questoes();
        questoes13.questoes = "13- Quantos lados tem um dado?";
        questoes13.A = "A) Cinco lados";
        questoes13.B = "B) Quatro lados";
        questoes13.C = "C) Seis lados";
        questoes13.D = "D) Sete lados.";
        questoes13.E = "E) Oito lados";
        questoes13.escrevaquestao();
        questoes13.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes13.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes14 = new questoes();
        questoes14.questoes = "14- O vinho é feito com qual fruta?";
        questoes14.A = "A)  Abacaxi";
        questoes14.B = "B) Morango";
        questoes14.C = "C) Maçã";
        questoes14.D = "D) Uva";
        questoes14.E = "E) Laranja";
        questoes14.escrevaquestao();
        questoes14.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes14.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes15 = new questoes();
        questoes15.questoes = "15- O pão de queijo é um prato típico de qual estado brasileiro?";
        questoes15.A = "A) Rio de Janeiro";
        questoes15.B = "B) Minas Gerais";
        questoes15.C = "C) São Paulo";
        questoes15.D = "D) Bahia";
        questoes15.E = "E) Goias";
        questoes15.escrevaquestao();
        questoes15.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes15.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

    }
}

//plano individual:

import java.util.Scanner;
public class planoFunerario{
public static void main(String[] args){

//Programa para calcular a mensalidade de um plano funerário.
//mensalidade = R$49,90 + taxa de acordo com a idade de cada dependente

   int idade;
   double soma = 0;
   double mensalidade;
   double taxaMenor64[] = new double[14];
   double taxaMaior64[] = new double[14];
   String nome[] = new String[14];

 Scanner teclado = new Scanner(System.in);
   for(int aux = 0; aux < nome.length; aux++){
     System.out.println("Informe o nome do dependente:");   //Solicita o nome do dependente;
     nome[aux] = teclado.nextLine();

  System.out.println("Informe a idade do dependente:");
  idade = teclado.nextInt();  //Solicita a idade do dependente;
  teclado.nextLine();

  while(idade <= 0){
    System.out.println("Valor inválido! Tente de novo.");
    idade = teclado.nextInt();
    teclado.nextLine();
}

  if(idade <= 64){
  taxaMenor64[aux] = 5.00; //Atribuição do valor da taxa para dependentes de idade inferior a 64 anos;

  } else {
     taxaMaior64[aux] = 15.00; //Atribuição do valor da taxa para dependentes de idade superior a 64 anos;

}

  soma += taxaMenor64[aux];
  soma += taxaMaior64[aux];

}

   mensalidade = 49.90 + soma;  //Cálculo da mensalidade;

   System.out.println("\n PLANO FUNERÁRIO:");
   for (int aux = 0; aux < nome.length; aux++) {

            System.out.println("Nome do dependente: " + nome[aux]);
            System.out.printf("Taxa até 64 anos: R$ %.2f%n", taxaMenor64[aux]);
            System.out.printf("Taxa acima de 64 anos: R$ %.2f%n", taxaMaior64[aux]);
        }

   System.out.printf("\nValor da mensalidade = R$ %.2f%n", mensalidade);

teclado.close();
}
}
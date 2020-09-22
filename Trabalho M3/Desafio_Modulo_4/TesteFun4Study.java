 import java.io.*;
/**
 * Classe de TesteFun4Study efetida na prática a realização do cadastro.
 * Evandro Silveira da Motta) 
 *
 * @version (22/05/2020
 */
public class TesteFun4Study
{
   public static void main(String args[]){
          int contCidade = 0;
          int contEstudante = 0;
          int resp;
          int opcao = 0;
          Cidade cidade;
          Estudantes novoAluno1;
        
       do{
           contCidade++;
           System.out.println("**Bem vindo ao Cadastro estudantil da Fu4nStudy.**");
           System.out.println(" ");
           //Cadastro cidade 
           System.out.println("\nCadastre a Cidade " + contCidade + ":\n");
           Cidade novaCidade1 = new Cidade(Teclado.leInt("Informe o código da Cidade: "),
           Teclado.leString("Informe a Cidade: "),
           Teclado.leString("Informe a UF: "));
           
           System.out.println("\n");
           
           novaCidade1.exibeDados();
           
           do{
               contEstudante++;
               System.out.println("\nCadastre o Estudante " + contEstudante+ ":\n ");
        
               novoAluno1 = new Estudantes(Teclado.leInt("Informe o código do Estudante: "),
               Teclado.leString("Informe o nome: "),
               Teclado.leString("Informe a data de nascimento: "),
               Teclado.leString("Informe o e-mail: "),
               Teclado.leString("Informe a senha: "),
               novaCidade1); 
               
               novoAluno1.exibeDados();
               
                
            
               System.out.println();
               resp = Teclado.leInt("Deseja alterar os dados do Estudante (1-Sim / 2-Não) ?"); 
               
               while(resp == 1) {
                
                   
                System.out.println("\nAtualize os dados\n");
                System.out.println("Nome " + contEstudante +  ":\n");
                System.out.println("1-Data de Nascimento");
                System.out.println("2- e-mail");
                System.out.println("3-Senha");
                    
                
                
                opcao = Teclado.leInt("Digite a opção de dado que deseja alterar:"); 
                switch(opcao ){
                        case 1:
                            novoAluno1.setNasc(Teclado.leString("Informe o nova Data de Nascimento: "));
                            break;
                        case 2:
                            novoAluno1.setEmail(Teclado.leString("Informe o novo Email: "));
                            break;
                            
                        case 3:
                            String senhaAnterior;
                            String novaSenha;
                            String confirmaSenha;
                            System.out.println("\n" + novoAluno1.getNome() + " Atualize sua senha! ");
                            senhaAnterior = Teclado.leString("Digite sua Senha Anterior: ");
                            novaSenha = Teclado.leString("Digite sua Nova Senha: ");
                            confirmaSenha = Teclado.leString("Confirme sua Nova Senha: ");

                            if(novoAluno1.getSenha().equals(senhaAnterior) && novaSenha.equals(confirmaSenha)){
                                novoAluno1.setSenha(confirmaSenha);
                                System.out.println("\n***Sua Senha foi atualizada com sucesso***!");
                            }else{
                                System.out.println("\n***ERRO: AS SENHAS NÃO CONFEREM!***");
                            }
                        break;
                                              
                        default:
                        System.out.println("\nOpção Inválida!\n Digite Novamente!\n");
                }
                
                resp = Teclado.leInt("Deseja continuar alterando os dados do Estudante(1-Sim / 2-Não) ?"); 
                if (resp == 2){
                   System.out.println("\n-- Dados do Estudante após Atualização --\n");
                   System.out.println("Usuário " + contEstudante +  ":\n");
                   novoAluno1.exibeDados();
                }
                          
                
               
            
            } 
              resp = Teclado.leInt("Deseja criar um novo Aluno (1-Sim / 0-Não) ?");
           }while((resp == 1) || (contEstudante < 4));
           contEstudante = 0;
               
               resp = Teclado.leInt("Deseja criar mais uma Cidade(1-Sim / 0-Não) ?");
          }while(resp == 1 );
          System.out.println("CADASTRO REALIZADO COM SUCESSO!!!!");
        }
    }

    
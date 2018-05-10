package ex02;

import javax.swing.JOptionPane;

/*2.	Desenvolver um algoritmo que peça nome, altura, idade, peso dos jogadores de basquete, enquanto o nome do jogador for diferente da palavra SAIR o programa deverá pedir essas informações, após cadastrados deverá aparecer as seguintes informações:

a.	Quantidade de jogadores cadastrados;
b.	Nome e altura do maior Jogador;
c.	Nome e idade do jogador mais velho;
d.	Nome e peso do jogador mais pesado;
e.	Média das alturas jogadores.
*/
public class Ex02 {
	String nome;
    int idade=0;
    double altura=0,peso=0;
    double maisvelho=0;
    double maior=0;
    double maispesado=0;
    double somaaltura=0;
    double media=0;
    int quantidade=0;
    String nomeidade,nomepeso,nomealtura;
	//Perguntar
    public void perguntas(){
		nome =	JOptionPane.showInputDialog("Informe o nome");
		quantidade++;
		altura = Double.parseDouble(JOptionPane.showInputDialog("informe a sua altura"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("informe a seu peso"));
		media = (somaaltura/quantidade);
    }
        
    //laço
	public void laco(){
		
	//variavel
		int continuar =0;
		
		
		do{
			perguntas();
			maioridade();
			maiorpeso ();
			maioraltura();
			continuar = JOptionPane.showConfirmDialog(null, "deseja continuar?","",0);
			
		}while(continuar ==0);
		
		exibir();
	}
	//contar
	public void maioridade() {
		if (idade > maisvelho){
			maisvelho=idade;
			nomeidade= nome;
			}
	}
	public void maiorpeso (){
		if (peso > maispesado){
			maispesado=peso;
			nomepeso=nome;
	}
	}
	public void maioraltura(){
		somaaltura+=altura;
	    if (altura > maior){
	maior=altura;
	nomealtura=nome;	
	}
	
		}
	
	public void exibir(){
		
		String texto;
		texto= "*****INFORMAÇÕES*****\n";
		texto+="\nMaior jogador="+maior+"Mts";
		texto+="\nMaior jogador="+nomealtura;
		texto+="\njogador mais velho="+maisvelho+"anos";
		texto+="\njogador mais velho="+nomeidade;
		texto+="\nJogador mais pesado="+maispesado+"Kg";
		texto+="\nJogador mais pesado="+nomepeso;
		texto+="\nTotal Cadastro="+quantidade;
		texto+="\nmédia de altura="+media;
		JOptionPane.showMessageDialog(null,texto);
		}
		
	
}

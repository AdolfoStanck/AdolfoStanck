package ex01;

import javax.swing.JOptionPane;

/*1.	Desenvolver um algoritmo que pe�a as seguintes informa��es: Nome, Idade, Sexo, Cargo, ap�s cadastrar um determinado n�mero de pessoas o programa dever� retornar os seguintes dados:

a)	Quantidade de pessoas do sexo masculino e feminino;

b)	Quantidade de pessoas dos seguintes cargos: gerente, atendente, a�ougueiro,  secret�ria, almoxarife, padeiro e estagi�rio.

c)	Quantidade de pessoas maiores de idade (18+) e quantidade de pessoas menores de idade

*/
public class Ex01 {
	 String nome;
	    int idade,maioridade=0,menoridade=0;
	    int sexo; 
	    String cargo;
	    int masculino = 0,feminino = 0,gerente = 0, atendente =0, acougueiro=0,secretaria=0,almoxarife=0,padeiro=0,estagiario=0;
		//metodo para realizar as perguntas
		public void perguntas(){
		nome =	JOptionPane.showInputDialog("Informe o nome");
		idade=  Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		
		
		 //perguntar
	      String menu = "informe o sexo ";
	               menu+= "\n\n1)Masculino ";
	               
	               menu+= "\n2) feminino ";
	                
	                sexo= Integer.parseInt(JOptionPane.showInputDialog(menu));	
	                
	                
         
         
		}
}

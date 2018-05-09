package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {
//atributos
	String nome;
	double nota1,nota2,nota3;
	int aprovados =0, reprovados=0;
	//metodo para realizar as perguntas
	public void perguntas(){
		nome=JOptionPane.showInputDialog("Informe o Nome do aluno");
		nota1=Double.parseDouble(JOptionPane.showInputDialog(" 1ª nota"));
		nota2=Double.parseDouble(JOptionPane.showInputDialog(" 2ª nota"));
		nota3=Double.parseDouble(JOptionPane.showInputDialog(" 3ª nota"));
		
	}
	
	// metodo de repetição
	public void laco(){
		//variavel sair
		int continuar=0;
		//laço
		do{
				perguntas();
				exibirsituacao();
				contar();
				continuar=JOptionPane.showConfirmDialog(null,"deseja continuar?","",0);
		}while(continuar == 0);
		exibircontar();
	}
	//metodo para retornar média
	public double calculodemedia(){
		double media=(nota1+nota2+nota3)/3;
		return media;
		
	}
	//método para retornar a situação do aluno
	public String situcaoaluno(){
		String situacao=calculodemedia()>=7 ? "Aprovado":"Reprovado";
		return situacao;
	}
	
	//exibir media e situação
	public void exibirsituacao(){
		//mensagem
		String msg="*****INFORMAÇÕES do Aluno*****";
			  msg+="\nSua média é:"+String.format("%.2f", calculodemedia());
			  msg+="\nSua Condição é:"+situcaoaluno();
			  
			  //Exibir mensagem
			  JOptionPane.showMessageDialog(null, msg);
			}
	//contaraprovados e reprovados.
	public void contar(){
		if(calculodemedia()>=7){
			aprovados++;
		}else{
			reprovados++;
		}
	}
		//exibir quantidade de aprovados e reprovados
	public void exibircontar(){
	
	String txt ="Aprovados X Reprovados ";
			txt+="\nAlunos Aprovados:"+aprovados;
			txt+="\nAlunos Reprovados:"+reprovados;
			JOptionPane.showMessageDialog(null, txt);
	}
	
}

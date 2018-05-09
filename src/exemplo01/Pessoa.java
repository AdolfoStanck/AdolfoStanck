//classe =molde


package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	//atributos
	String nome;
	int idade;
	double peso,altura;
	
	/*método de apresentação
	  Void= nulo,sem retorno
	  */ 
	
		
	public  void apresentacao(){
		JOptionPane.showMessageDialog(null, "Olá!Meu nome é "+nome );
		
		
		
	}
	//calculo de IMC
	public double calculoimc(){
		double imc = peso/ Math.pow(altura,2);
		return imc;
	}
	//situação IMC
	public String situacaoImc(){
		
		//variavel contendo situação
		String situacao;
		//obter valor imc
		double imc =calculoimc();
				
				//situação
				if(imc<17){
					situacao="muito abaixo do peso.";
				}else if(imc<18.5){
					situacao="Abaixo do peso.";
				}else if(imc<25){
					situacao="Peso normal.";
				}else if(imc<30){
					situacao="Acima do peso.";
				}else if(imc<35){
					situacao="Obesidade I.";
				}else if(imc<40){
					situacao="Obesidade II.";
				}else{
					situacao="Obesidade III.";
				}
		//Retorno
		return situacao;
	}
	//metodo para exibir imc e situação
	public void exibirimc(){
		//mensagem
		String msg="**IMC**";
				msg+="\nSeu IMC é de:"+String.format("%.2f", calculoimc());
				msg+="\nSua Situação é:"+situacaoImc();
				
				//Exibir mensagem
				JOptionPane.showMessageDialog(null, msg);
	}
}

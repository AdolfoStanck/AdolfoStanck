//classe =molde


package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	//atributos
	String nome;
	int idade;
	double peso,altura;
	
	/*m�todo de apresenta��o
	  Void= nulo,sem retorno
	  */ 
	
		
	public  void apresentacao(){
		JOptionPane.showMessageDialog(null, "Ol�!Meu nome � "+nome );
		
		
		
	}
	//calculo de IMC
	public double calculoimc(){
		double imc = peso/ Math.pow(altura,2);
		return imc;
	}
	//situa��o IMC
	public String situacaoImc(){
		
		//variavel contendo situa��o
		String situacao;
		//obter valor imc
		double imc =calculoimc();
				
				//situa��o
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
	//metodo para exibir imc e situa��o
	public void exibirimc(){
		//mensagem
		String msg="**IMC**";
				msg+="\nSeu IMC � de:"+String.format("%.2f", calculoimc());
				msg+="\nSua Situa��o �:"+situacaoImc();
				
				//Exibir mensagem
				JOptionPane.showMessageDialog(null, msg);
	}
}

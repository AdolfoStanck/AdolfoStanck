package exemplo03;

import javax.swing.JOptionPane;

public class CArro {

	
	//atributos
	String[] nomedocarro = new String[5];
	double[] valordocarro =new double [5];
	
	//metodo para retornar a posi�a� livre do vetor
	public int posicaolivre(){
		int posicao=0;
		for (int i=0;i<nomedocarro.length; i++){
			if(nomedocarro[i]==null){
				posicao = i;
				break;
			}
		}
		return posicao;
	}
	
	//realizar perguntas
	public void perguntas(){
		//vobtert posi��o
		int posicao=posicaolivre();
		nomedocarro[posicao]=JOptionPane.showInputDialog("informe o carro");
		valordocarro[posicao]=Double.parseDouble(JOptionPane.showInputDialog("informe valor do carro"));
	}
	
	
	//la�o
	public void laco(){
	//variavel
		int continuar =0;
		
		
		do{
			perguntas();
			continuar = JOptionPane.showConfirmDialog(null, "deseja continuar?","",0);
			
		}while(continuar ==0);
		ordenar();
		exibir();
	}
	
	//metodo de ordena��o
	public void ordenar(){
		//variaveis
		String nomemaior;
		double valormaior;
		//la�o principal
		for(int i1=0;i1<nomedocarro.length -1;i1++){
			//la�o secundario
			for(int i2=0;i2<nomedocarro.length -1;i2++)	{
				//condicional
				if(valordocarro[i2]>valordocarro[i1]){
					nomemaior=nomedocarro[i1];
					nomedocarro[i1]=nomedocarro[i2];
					nomedocarro[i2]=nomemaior;
					
					valormaior=valordocarro[i1];
					valordocarro[i1]=valordocarro[i2];
					valordocarro[i2]=valormaior;
					
				}
			}
		}
	}
	//metodo para exibir ordenados
	public void exibir(){
		
	
	
	
	String txt ="**Exibir Carros** ";
	for(int i=0;i<nomedocarro.length;i++){
		if(nomedocarro[i]!=null){
			txt+="\n"+nomedocarro[i]+" R$ "+valordocarro[i];
	}
	}
	//exibir msg
	 JOptionPane.showMessageDialog(null,txt);
	}
}

package ex04;

import javax.swing.JOptionPane;

/*4. O filme Alice no pa�s das maravilhas est� fazendo uma enquete para saber o que o p�blico achou do
filme, ser� necess�rio desenvolver um programa que tenha 5 op��es (excelente, �timo, bom, regular,
ruim), e dever� informar a idade.
Ap�s informados os dados (idade e voto) de todos os indiv�duos dever� ser exibido:
Percentual de Votos
% Excelente
% �timo
% Bom
% Regular
% Ruim
Quantidade de:
Crian�as (0 � 9 anos)
Adolescentes (10 � 17 anos)
Adultos (Acima de 17 anos)
Valide caso a idade seja inferior a 0 ou superior a 100, crie uma valida��o tamb�m para a nota.*/
public class Ex04 {
    int idade;
    int filme;
    int excelente = 0; 
    int otimo = 0;
    int bom = 0;
    int regular = 0;
    int ruim = 0;
    int adulto = 0;
    int adolescente = 0;
    int crianca = 0;
    int totalvotos=0;
    boolean valida =false; 
    int continuar = 0;
   
    double parc1;
    double parc2;
    double parc3;
    double parc4;
    double parc5;
    
    public void opniao(){
    	  //Menu
        String menu2 = "Qual a sua opni�o sobre o filme? ";
        menu2+= "\n\n1)Exelente ";
        menu2+= "\n2) Otimo ";
        menu2+= "\n3)Bom ";
        menu2+= "\n4)Regular ";
        menu2+= "\n5)ruim ";
        filme = Integer.parseInt(JOptionPane.showInputDialog(menu2));
    }
	public void idade(){
		idade= Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));	
	}
	//la�o
	public void laco(){
	//variavel
		int continuar =0;
		
		
		do{
			opniao();
			contarvoto();
			porcento();
			contadoridade();
			
			
			
			continuar = JOptionPane.showConfirmDialog(null, "deseja continuar?","",0);
			
		}while(continuar ==0);
		
		exibir();
	}
	public void contarvoto(){
		 switch (filme) {
         case 1:
        	    excelente++;
                totalvotos++; 
         break;
     
         case 2:
        	 otimo++;
             totalvotos++;   
         break;

         case 3:
        	 bom++;
             totalvotos++;   
         break;

         case 4:
        	 regular++;
             totalvotos++;    
         break;
         
         case 5:
        	 ruim++;
             totalvotos++;    
         break;
	}
	}
	
	public void contadoridade(){
		//IDADE
  
		do{
            idade= Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
    

            if((idade >= 18) && (idade <= 100)){
                adulto++;
                valida = true;     
            }else if ((idade >=10) && (idade <= 17)){
                adolescente++;
                valida = true;
            }else if ((idade >=0) && (idade <= 9)){ 
                crianca++;
                valida = true;
            }
            
         } while(valida != true);
	}
	public void porcento(){
		 parc1=(excelente*100)/totalvotos;
	     parc2=(otimo*100)/totalvotos;
	     parc3=(bom*100)/totalvotos;
	     parc4=(regular*100)/totalvotos;
	    parc5=(ruim*100)/totalvotos; 
	}
    public void exibir(){
    	   String texto;
           texto= "***resulrado da pesquisa***\n";
           texto+="exelente "+parc1+"%";
           texto+="\n�timo "+parc2+"%";
           texto+="\nbom "+parc3+"%";
           texto+="\nregular "+parc4+"%";
           texto+="\nruim "+parc5+"%\n";
           texto+= "***resulrado da pesquisa***\n";
           texto+="Adulto= "+adulto;
           texto+="\nAdolescente= "+adolescente;
           texto+="\nCrian�a= "+crianca;
           JOptionPane.showMessageDialog(null,texto);
    }
	
}

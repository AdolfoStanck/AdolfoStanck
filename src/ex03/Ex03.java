package ex03;

import javax.swing.JOptionPane;

/*3. Uma lanchonete precisa de um sistema para calcular o troco que ser� dado aos clientes, para isso
fa�a com que seja informado um c�digo a quantidade pedida daquele produto (que pertence ao c�digo
informado). Crie um la�o onde o cliente ir� informar c�digos e quantidades infinitamente.
Ap�s informados os c�digos e suas respectivas quantidades informe o total consumido e pe�a o valor
que o cliente ir� pagar (Se o cliente tentar pagar menos que o total pe�a novamente o pagamento at�
ele informar um valor igual ou superior consumido).
Ao t�rmino informe o troco que ser� dado ao cliente.
C�DIGO PEDIDO VALOR
1 Hamb�rguer + Suco de Laranja          R$ 5,00
2 Sandu�che natural + Suco de Uva       R$ 4,50
3 Prato do dia                          R$ 8,00
4 Pizza                                 R$12,00
5 Lasanha                               R$16,50
6 P�o de queijo                         R$ 1,00
7 Bolo                                  R$ 2,50*/
public class Ex03 {
	  //Vari�veis
    int produto;
    double vp=0;
    double vt=0;
    int quantidade=0;
    double troco;
    
    public void pedido(){
    	 String menu = "Escolha o prato ";
         menu+= "\n\n1)hamburguer + suco de laranja R$5.00 ";
         menu+= "\n2) sanduiche natural +suco de Uva R$4.50 ";
         menu+= "\n3) prato do dia R$8.00 ";
         menu+= "\n4) pizza R$12.00 ";
         menu+= "\n5) lasanha R$16.50";
         menu+= "\n6) p�o de queijo R$1.00 ";
         menu+= "\n7) bolo  R$2.50";
         
  
  //C�digo do produto
  produto= 	Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
  //Perguntar
    public void qtde(){
    	   //Obter quantidade
        quantidade= Integer.parseInt(JOptionPane.showInputDialog("informe a Quantidade."));	
    }
	//la�o
	public void laco(){
	//variavel
		int continuar =0;
		
		
		do{
			pedido();
			qtde();
			contador();
		
			continuar = JOptionPane.showConfirmDialog(null, "deseja continuar?","",0);
			
		}while(continuar ==0);
		
		exibir();
	}
    public void contador(){
    	 switch (produto) {
         case 1:
        	 vt+= 5.00*quantidade;  
         break;
     
         case 2:
        	 vt+=4.50*quantidade;   
         break;

         case 3:
        	 vt+=8.00*quantidade;   
         break;

         case 4:
        	 vt+=12.00*quantidade;    
         break;
         
         case 5:
        	 vt+=16.50*quantidade;    
         break;
         
         case 6:
        	 vt+=1.00*quantidade;    
         break;
         
         case 7:
        	 vt+=2.50*quantidade;    
         break;
    	 	}
    	 
    	}
	public void exibir(){
		
		Boolean continuar= false;



	    JOptionPane.showMessageDialog(null,"o Valor da sua compra � R$:"+vt);
	      do{ vp = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor pago"));
	      if(vp >= vt){

	        continuar=true;
	      }
	      }while(continuar == false);

	      troco = vp-vt;

	         JOptionPane.showMessageDialog(null, "Seu troco � R$"+troco );
}
}


package ex03;

import javax.swing.JOptionPane;

/*3. Uma lanchonete precisa de um sistema para calcular o troco que será dado aos clientes, para isso
faça com que seja informado um código a quantidade pedida daquele produto (que pertence ao código
informado). Crie um laço onde o cliente irá informar códigos e quantidades infinitamente.
Após informados os códigos e suas respectivas quantidades informe o total consumido e peça o valor
que o cliente irá pagar (Se o cliente tentar pagar menos que o total peça novamente o pagamento até
ele informar um valor igual ou superior consumido).
Ao término informe o troco que será dado ao cliente.
CÓDIGO PEDIDO VALOR
1 Hambúrguer + Suco de Laranja          R$ 5,00
2 Sanduíche natural + Suco de Uva       R$ 4,50
3 Prato do dia                          R$ 8,00
4 Pizza                                 R$12,00
5 Lasanha                               R$16,50
6 Pão de queijo                         R$ 1,00
7 Bolo                                  R$ 2,50*/
public class Ex03 {
	  //Variáveis
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
         menu+= "\n6) pão de queijo R$1.00 ";
         menu+= "\n7) bolo  R$2.50";
         
  
  //Código do produto
  produto= 	Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
  //Perguntar
    public void qtde(){
    	   //Obter quantidade
        quantidade= Integer.parseInt(JOptionPane.showInputDialog("informe a Quantidade."));	
    }
	//laço
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



	    JOptionPane.showMessageDialog(null,"o Valor da sua compra é R$:"+vt);
	      do{ vp = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor pago"));
	      if(vp >= vt){

	        continuar=true;
	      }
	      }while(continuar == false);

	      troco = vp-vt;

	         JOptionPane.showMessageDialog(null, "Seu troco é R$"+troco );
}
}


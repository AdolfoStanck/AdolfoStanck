package ex01;

import javax.swing.JOptionPane;

/*1.	Desenvolver um algoritmo que peça as seguintes informações: Nome, Idade, Sexo, Cargo, após cadastrar um determinado número de pessoas o programa deverá retornar os seguintes dados:

a)	Quantidade de pessoas do sexo masculino e feminino;

b)	Quantidade de pessoas dos seguintes cargos: gerente, atendente, açougueiro,  secretária, almoxarife, padeiro e estagiário.

c)	Quantidade de pessoas maiores de idade (18+) e quantidade de pessoas menores de idade

*/
public class Ex01 {
	String nome;
	    int idade,maioridade=0,menoridade=0;
	    int sexo; 
	    int cargo;
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
	       
	                String menu2 ="informe Seu cargo";
	                
	                menu2= "cargo";
	                menu2+="\n\n1)gerente";
	                menu2+="\n2)atendente";
	                menu2+="\n3)acougueiro";
	                menu2+="\n4)secretaria";
	                menu2+="\n5)almoxarife";
	                menu2+="\n6)padeiro";
	                menu2+="\n7)estagiario";
	             cargo=Integer.parseInt(JOptionPane.showInputDialog(menu2));          
	                    
         		}
		
		//laço
		public void laco(){
		//variavel
			int continuar =0;
			
			
			do{
				perguntas();
				contarcargo();
				contaridade();
				contarsexo();
				continuar = JOptionPane.showConfirmDialog(null, "deseja continuar?","",0);
				
			}while(continuar ==0);
			
			exibir();
		}
		//contadores
		public void contaridade(){
			
			if(idade >= 18){
			        
		            maioridade++;     
		                  }else{
		                  menoridade++;
		}
		}
		public void contarsexo(){
			//Contar votos
            switch (sexo) {
                case 1:
                    masculino++;    
                break;
            
                case 2:
                    feminino++;    
                break;

            }
			
		}
		
		public void contarcargo(){
			//Contar votos
            switch (cargo) {
                case 1:
                	gerente++;    
                break;
            
                case 2:
                	atendente++;    
                break;

                case 3:
                	acougueiro++;    
                break;

                case 4:
                	secretaria++;    
                break;
                
                case 5:
                	almoxarife++;    
                break;
                
                case 6:
                	padeiro++;    
                break;
                
                case 7:
                	estagiario++;    
                break;
            }
		}
		
		public void exibir(){
			
			String texto;
			texto="Nome="+nome+"\n";
			texto= "******sexo*******";
			texto+="\nmasculino="+masculino;
			texto+="\nfeminino="+feminino+"\n";
			texto+= "\n*****cargo***";
			texto+="\ngerente:"+gerente;
			texto+="\natendente:"+atendente;
			texto+="\nacougueiro:"+acougueiro;
			texto+="\nsecretaria:"+secretaria;
			texto+="\nalmoxarife:"+almoxarife;
			texto+="\npadeiro:"+padeiro;
			texto+="\nestagiario:"+estagiario;
			texto+= "\n*******idade*******";
			texto+="\nmaioridade="+maioridade;
			texto+="\nmenoridade="+menoridade;
			JOptionPane.showMessageDialog(null,texto);
			
		}
}
			
			
			


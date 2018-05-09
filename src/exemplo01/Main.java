package exemplo01;

public class Main {

	public static void main(String[] args) {
		
		
		//instanciar 
		Pessoa p1 = new Pessoa();
		p1.nome="Adolfo";
		p1.idade= 25;
		p1.peso=92;
		p1.altura=1.80;
		//instanciar outro objeto
		Pessoa p2= new Pessoa();
		p2.nome="Caio";
		p2.idade= 23;
		p2.peso=250;
		p2.altura=1.92;
		

		//Invocar Metodos
		p1.apresentacao();
		p1.exibirimc();
	}

}

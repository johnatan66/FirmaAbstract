import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class MainClass {
	public static void main(String args[]) {
		
		ArrayList<Funcionario> pagamento = new ArrayList<Funcionario>();
		
		pagamento.add(new Chefe("Joao", 12345, 1000.0f , 15f, 600.0f));
		pagamento.add(new Comissionado("Marcia", 54321, 1500.0f, 10));
		pagamento.add(new Horista("Rafael", 56789, 100, 80.0f));
		pagamento.add(new Empreiteiro("Jair", 98765, 3500.0f));
		
		for (Funcionario f: pagamento) {
			System.out.println(f.getNome() + " R$ "+ f.CalcularSalario());
		}
		
	}
}


public class Fronteira {

	public static void main(String[] args) {
		Cliente c1 = new Cliente ();
		c1.nome = "Ian";
		c1.fones[0].ddd= 11;
		c1.fones[0].numero = 999;
		c1.id = 1;
		
//		System.out.println("Nome " + c1.nome + "Total Cliente: "+  Cliente.contador);
//		
//		Cliente c2 = new Cliente ();
//		c2.nome = "Isa";
//		c2.fone = 222;
//		System.out.println("Nome " + c2.nome+ "Total Cliente: "+  Cliente.contador );
//		
//		Cliente c3 = new Cliente ();
//		c3.nome = "Karl";
//		c3.fone = 333;
//		System.out.println("Nome " + c3.nome + "Total Cliente: "+  Cliente.contador );
//		System.out.println("Total Cliente: " + Cliente.contador);
//		
		
		Pedido p1 = new Pedido ();
		p1.numero = 33;
		p1.valor = 100;
		p1.id_cliente = c1;
		System.out.println("Pedido " + p1.getNumero() + " cliente " + p1.id_cliente.nome);
		
		c1.pedido = p1;
		
		System.out.println("Cliente " + c1.nome + " pedido: " + c1.pedido.getValor() + " numero pedido " + c1.pedido.getNumero());
		
		
//		
//		Controle.salvarCliente(c1); 

	}

}

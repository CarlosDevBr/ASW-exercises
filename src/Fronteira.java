
public class Fronteira {

	public static void main(String[] args) {
		Cliente c1 = new Cliente ();
		c1.nome = "Ian";
		c1.fone = 111;
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
		System.out.println("Pedido " + p1.numero + " cliente " + p1.id_cliente.nome);
		
		c1.id_pedido = p1;
		
		System.out.println("Cliente " + c1.nome + " pedido: " + c1.id_pedido.valor);
		
		
//		
//		Controle.salvarCliente(c1); 

	}

}

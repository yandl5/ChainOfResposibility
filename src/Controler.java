
public class Controler 
{
	public static void main(String [] args) 
	{
		//instancia os objetos
		PedidoBrasileiraMedia feijoadaM = new PedidoBrasileiraMedia();
		PedidoBrasileiraGrande feijoadaG = new PedidoBrasileiraGrande();
		PedidoItalianaMedia lasanhaM = new PedidoItalianaMedia();
		PedidoItalianaGrande lasanhaG = new PedidoItalianaGrande();
		//seta os sucessores
		feijoadaM.setSucessor(feijoadaG);
		feijoadaG.setSucessor(lasanhaM);
		lasanhaM.setSucessor(lasanhaG);
		lasanhaG.setSucessor(null);
		
		//exemplo:
		Quentinha exemplo = new Quentinha("G","I");
		try 
		{
			System.out.println(feijoadaM.processaPedido(exemplo));
		}
		catch (Exception e) 
		{
			System.out.println("Opção não disponivel no cardápio");
		}
		
	}
}

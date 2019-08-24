
public class PedidoBrasileiraMedia extends GerenciadorPedido
{

	@Override
	public double processaPedido(Quentinha quentinha) {
		if(quentinha.getCulinaria().equals("B")&&quentinha.getTamanho().equals("M")) 
		{
			return 8.00;
		}
		else 
		{
			return this.getSucessor().processaPedido(quentinha);
		}
	}
	
}


public class PedidoItalianaMedia extends GerenciadorPedido
{

	@Override
	public double processaPedido(Quentinha quentinha) {
		if(quentinha.getCulinaria().equals("I")&&quentinha.getTamanho().equals("M")) 
		{
			return 15.00;
		}
		else 
		{
			return this.getSucessor().processaPedido(quentinha);
		}
	}
	
}

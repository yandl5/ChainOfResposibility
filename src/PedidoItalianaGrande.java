public class PedidoItalianaGrande extends GerenciadorPedido
{

	@Override
	public double processaPedido(Quentinha quentinha) {
		if(quentinha.getCulinaria().equals("I")&&quentinha.getTamanho().equals("G")) 
		{
			return 20.00;
		}
		else 
		{
			return this.getSucessor().processaPedido(quentinha);
		}
	}
	
}

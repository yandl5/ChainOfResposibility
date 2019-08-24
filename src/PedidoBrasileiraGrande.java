public class PedidoBrasileiraGrande extends GerenciadorPedido
{

	@Override
	public double processaPedido(Quentinha quentinha) {
		if(quentinha.getCulinaria().equals("B")&&quentinha.getTamanho().equals("G")) 
		{
			return 12.00;
		}
		else 
		{
			return this.getSucessor().processaPedido(quentinha);
		}
	}
	
}

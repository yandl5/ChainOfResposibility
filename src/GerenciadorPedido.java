
public abstract class GerenciadorPedido 
{
	private GerenciadorPedido sucessor;
	
	public abstract double processaPedido(Quentinha quentinha);
	
	public GerenciadorPedido getSucessor() 
	{
		return sucessor;
	}
	
	public void setSucessor(GerenciadorPedido sucessor) 
	{
		this.sucessor = sucessor;
	}
	
}

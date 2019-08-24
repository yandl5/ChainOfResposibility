public class Quentinha 
{
	//M ou G
	private String tamanho;
	//B(brasileira),I(italiana)
	private String culinaria;
	
	public Quentinha(String tamanho, String culinaria) 
	{
		this.tamanho = tamanho;
		this.culinaria = culinaria;
	}
	public String getTamanho() 
	{
		return tamanho;
	}
	public void setTamanho(String tamanho) 
	{
		this.tamanho = tamanho;
	}
	public String getCulinaria()
	{
		return culinaria;
	}
	public void setCulinaria(String culinaria)
	{
		this.culinaria = culinaria;
	}
	
}

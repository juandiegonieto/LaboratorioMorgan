package src.model;

public class Client {

	private final double NORMAL_PRICE = 0.0;
	private final double SILVER_TYPE = 0.015;
	private final double GOLD_TYPE = 0.3;
	private final double PLATINIUM_TYPE = 0.5;
	
	private String name;
	private String type;
	private double Kilos;
	private int payment;
	private int registerId;
	private int expDate;
	
	/*Constructor de la clase cliente y sus atributos. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Inicializa los atributos de la clase Client <br>
	*@param name Nombre del cliente
	*@param reigsterId Identificacion de registro del cliente
	*@param type tipo de cliente
	*@param kilos cantidad de carga transporta en kg
	*@param expDate fecha de expedicion del cliente
	*/
	public Client(String name, int registerId, String type, double Kilos, int payment, int expDate) {
		
		this.name = name;
		this.setRegisterId(registerId);
		this.type = type;
		this.Kilos = Kilos;
		this.payment = payment;
		this.expDate = expDate;
		
	}
	
	/*Setter del nombre. <br>
	*<b>pre: name </b> <br>
	*<b>post: </b> Se modifica el nombre del cliente. <br>
	*@param name Nombre del cliente
	*/
	public void set_name(String name) {
		
		this.name = name;
		
	}
	
	/* Getter del nombre. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del nombre. <br>
	*@param
	*/
	public String get_name() {
		
		return name;
		
	}
	
	/*Setter del tipo de cliente. <br>
	*<b>pre: type Tipo de cliente</b> <br>
	*<b>post: </b> Se modifica el tipo de cliente. <br>
	*@param type Tipo de cliente
	*/
	public void set_type(String type) {
		
		this.type = type;
		
	}
	
	/* Getter del tipo de cliente. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del tipo de cliente. <br>
	*@param
	*/
	public String get_type() {
		
		return type;
		
	}
	
	/*Setter del Peso de cargas en kg del cliente. <br>
	*<b>pre: kilos Peso de cargas en kg del cliente. </b> <br>
	*<b>post: </b> Se modifica el nombre del peso de cargas del cliente. <br>
	*@param kilos Peso de cargas del cliente
	*/
	public void set_Kilos(double Kilos) {
		
		this.Kilos = Kilos;
		
	}
	
	/* Getter Peso de cargas en kg del cliente. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del  peso de cargas del cliente. <br>
	*@param 
	*/
	public double get_Kilos() {
		
		return Kilos;
		
	}
	
	/*Setter de valor total pagado. <br>
	*<b>pre: payment Valor total pagado del cliente </b> <br>
	*<b>post: </b> Se modifica el valor total pagado del cliente. <br>
	*@param payment Valor total pagado del cliente
	*/
	public void set_payment(int payment) {
		
		this.payment = payment;
		
	}
	
	/* Getter del Valor total pagado. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del valor total pagado. <br>
	*@param
	*/
	public int get_payment() {
		
		return payment;
		
	}
	
	/*Setter de la fecha de expedicion del cliente. <br>
	*<b>pre: expDate Fecha de expedicion del cliente. </b> <br>
	*<b>post: </b> Se modifica la fecha de expedicion del cliente. <br>
	*@param expDate Fecha de expedicion del cliente
	*/
	public void set_expDate(int expDate) {
		
		this.expDate = expDate;
		
	}
	
	/* Getter de la fecha de expedicion del cliente. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la fecha de expedicion del cliente. <br>
	*@param
	*/
	public int get_expDate() {
		
		return expDate;
		
	}
	
	/* Getter de la identificacion de registro del cliente . <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion de la identificacion de registro. <br>
	*@param
	*/
	public int getRegisterId() {
		return registerId;
	}
	
	/*Setter de la identificacion de registro. <br>
	*<b>pre: registerId </b> <br>
	*<b>post: </b> Se modifica la identificacion de registro del cliente. <br>
	*@param registerId Identificacion de registro del cliente
	*/
	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}
	
}

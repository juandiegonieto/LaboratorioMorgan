package src.model;

import java.util.ArrayList;

public class Ship {

	private final int MAX_CAPACITY = 28000;
	private final int MIN_WEIGTH = 12000;
	private final int MIN_LOAD = 2;
	private final int CLIENTS = 5;
	
	private String name = "ThePirat";
	private String captain = "Morgan";
	private int loadWeigth;
	private int loadValue;
	private ArrayList<Load> loads;
	private ArrayList<Client> clients;
	
	/*Constructor de la clase Barco y sus atributos. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Inicializa los atributos de la clase Ship <br>
	*@param name nombre del barco
	*@param captain Capitan del barco
	*@param loadWeigth Peso del barco
	*@@param loadValue Valor de carga
	*/
	public Ship(String name, String captain, int loadWeigth, int loadValue) {
		
		this.name = name;
		this.captain = captain;
		this.loadWeigth = loadWeigth;
		this.loadValue = loadValue;
		loads = new ArrayList<Load>();
		clients = new ArrayList<Client>();
		
	}
	
	
	/*Setter del nombre del barco. <br>
	*<b>pre: name</b> <br>
	*<b>post: </b> Se modifica el nombre del barco. <br>
	*@param name Nombre del barco
	*/
	public void set_name(String name) {
		
		this.name = name;
		
	}
	
	/* Getter del nomre del barco. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del nombre del barco. <br>
	*@param
	*/
	public String get_name() {
		
		return name;
		
	}
	
	/*Setter del capitan del barco. <br>
	*<b>pre: captain Capitan del barco. </b> <br>
	*<b>post: </b> Se modifica el capitan del barco. <br>
	*@param captain Capitan del barco
	*/
	public void set_captain(String captain) {
		
		this.captain = captain;
		
	}
	
	/* Getter del capitan del barco. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del capitan del barco. <br>
	*@param
	*/
	public String get_captain() {
		
		return captain;
		
	}
	
	/*Añade un cliente. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Items del ArrayList clients <br>
	*@param name nombre del cliente
	*@param registerId Identicacion de registro del cliente
	*@param kilos Peso de las cargas del cliente en kg
	*@param payment Valor total pagado por el cliente
	*@param expDate Fecha de expedicion del cliente
	*/	
	public void addClient(String name,int registerId,String type, double Kilos, int payment, int expDate) {
		boolean added = false;
		Client newClient = new Client(name, registerId, type, Kilos, payment, expDate);
		for(int i=0; i < CLIENTS && !added ; i++) {				
				clients.add(newClient);				
		}
	}

	/*Añade una carga. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Items del ArrayList loads <br>
	*@param Load La carga
	*/	
	public void addLoad(Load load) {
		
		loads.add(load);
		
	}
	
	/*Actualiza la categoria del cliente. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Los tipos de clientes <br>
	*@param 
	*/
	public ArrayList<Client> categoryProgress() {
		for(int i = 0; i < clients.size() ; i++) {
			if(clients.get(i).get_Kilos() > 35000 && clients.get(i).get_Kilos() < 54999) {
				clients.get(i).set_type("Silver");
			} else if (clients.get(i).get_Kilos() > 55000 || clients.get(i).get_payment() == 2000000) {
				clients.get(i).set_type("Gold");
			} else if (clients.get(i).get_payment()> 5000000) {
				clients.get(i).set_type("Platinium");
			}
		}
		return clients;
	}
	
	/*Añade el descuento del valor total . <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Los tipos de clientes <br>
	*@param 
	*/
	public ArrayList<Client> clientCategoryDiscount() {
		double discount;
		int thePayment;
		for(int i = 0; i < clients.size(); i++) {
			if(clients.get(i).get_type().equals("Silver")) {
				discount = 0.015;
				thePayment = clients.get(i).get_payment();
				thePayment = (int) (thePayment - (thePayment * discount));
				clients.get(i).set_payment(thePayment);
			} else if (clients.get(i).get_type().equals("Gold")) {
				discount = 0.3;
				thePayment = clients.get(i).get_payment();
				thePayment = (int) (thePayment - (thePayment * discount));
			} else if (clients.get(i).get_type().equals("Platinium")) {
				discount = 0.5;
				thePayment = clients.get(i).get_payment();
				thePayment = (int) (thePayment - (thePayment*discount));
			}
		}		
		return clients;
	}	
	
	/*Calcula el peso total de la carga . <br>
	*<b>pre: boxes Cajas de la carga y weigthPerBox Peso por caja</b> <br>
	*<b>post: </b> El peso de la carga <br>
	*@param loadWeigth Peso de la carga 
	*/
	public int calculateLoadWeigth(int loadWeigth, Load boxes, Load weigthPerBox) {
		loadWeigth = boxes.get_boxes() * weigthPerBox.get_weigthPerBoxe();
		for(int i = 0; i < loads.size(); i++ ) {
			loadWeigth = loads.size();
		}
		return loadWeigth;
	}
	
	/* Getter del peso del barco. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del peso de las cargas barco. <br>
	*@param
	*/
	public int getLoadWeigth() {
		return loadWeigth;
	}

	/*Setter del peso del barco. <br>
	*<b>pre: name</b> <br>
	*<b>post: </b> Se modifica el nombre del barco. <br>
	*@param name Nombre del barco
	*/
	public void setLoadWeigth(int loadWeigth) {
		this.loadWeigth = loadWeigth;
	}
	
	/*Muestra la informacion del cliente . <br>
	*<b>pre: </b> <br>
	*<b>post: </b> La informacion del cliente <br>
	*@param 
	*/
	public String showContentsClients() {
		String resultClient = null;
		for(int i = 0; i < clients.size(); i++) {
			resultClient = "Cliente: " + (i+1) + "\n";
			resultClient += "Nombre: " + clients.get(i).get_name() + "\n";
			resultClient += "Identificacion de regstro: " + clients.get(i).getRegisterId() + "\n";
			resultClient += "Tipo de cliente: " + clients.get(i).get_type() + "\n";
			resultClient += "Kilos transportados: " + clients.get(i).get_Kilos() + "\n";
			resultClient += "Pago del cliente: " + clients.get(i).get_payment() + "\n";
			resultClient += "Fecha de expedicion: " + clients.get(i).get_expDate() + "\n";
		}
		return resultClient;
	}
	
	/*Muestra la informacion de las cargas . <br>
	*<b>pre: </b> <br>
	*<b>post: </b> La informacion de las cargas <br>
	*@param 
	*/
	public String showContentsLoads() {
		String resultLoad = null;
		for(int i = 0; i<loads.size(); i++) {
			resultLoad = "Numero de cajas: " + loads.get(i).get_boxes() + "\n";
			resultLoad = "Peso por caja: " + loads.get(i).get_weigthPerBoxe() + "\n";
			resultLoad = "Tipo de caja: " + loads.get(i).get_boxType() + "\n";
		}
		return resultLoad;
	}
	
	/*Muestra las cargas . <br>
	*<b>pre: </b> <br>
	*<b>post: </b> La las cargas <br>
	*@param 
	*/
	public String loadShip() {
		String resultLoads = null;
		for(int i = 0; i<loads.size(); i ++) {
			resultLoads = loads.size() + "\n";
		}
		return resultLoads;
	}
	
	/*Reinicia las cargas . <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Las cargas reiniciadas <br>
	*@param 
	*/
	public void loadReboot() {
		for(int i = 0; i<loads.size(); i++) {
			if(loads != null)
				loads.clear();
		}
	}	
	
	/*Muestra la disponibilidad de salida del barco . <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Mensaje de si sale o no <br>
	*@param 
	*/
	public String allowedDeparture() {
		String message = "";
		for(int i = 0; i<loads.size(); i++) {
			if(loadWeigth > MAX_CAPACITY) {
				message = ("El barco no puede salir porque el peso supera los limites (maximo 28000kg)");
			} else if (loadWeigth > MIN_WEIGTH) {
				message = ("El barco no puede zarpar porque el peso no es el suficiente (minimo 12000kg)");
			} else if (loads.size()<MIN_LOAD) {
				message = ("El barco no puede zarpar poque las cargan no son las suficientes (minimo 2kg)");
			}
		}
		return message;
	}
	
	/*Modifica el valor a pagar por cliente segun el tipo . <br>
	*<b>pre: boxes Cajas del barco, weigthPerBox peso por caja y tipo de  </b> <br>
	*<b>post: </b> El valor total a pagar de cada cliente segun el tipo <br>
	*@param payment Pago del cliente
	*@param boxes Cajas de las cargas
	*@param weigthPerBox Peso por caja
	*@param boxType Tipo de caja
	*/
	public ArrayList<Client> loadValue(int payment, int boxes, int wigthperBox, String boxType) {
		int toPay;
		for(int i = 0; i < loads.size(); i++) {
			if(loads.get(i).get_boxType().equals("Perecedera")) {
				toPay = (loads.get(i).get_weigthPerBoxe()*loads.get(i).get_boxes())*250000; 
				for(int j=0;j<clients.size();j++) {
					clients.get(i).set_payment(toPay);
				}
			} else if(loads.get(i).get_boxType().equals("No perecedera")) {
				toPay = (loads.get(i).get_weigthPerBoxe()*loads.get(i).get_boxes())*80000;
				for(int j=0;j<clients.size();j++) {
					clients.get(i).set_payment(toPay);
				}
			} else if(loads.get(i).get_boxType().equals("Peligrosa")) {
				toPay = (loads.get(i).get_weigthPerBoxe()*loads.get(i).get_boxes())*3900000;
				for(int j=0;j<clients.size();j++) {
					clients.get(i).set_payment(toPay);
				}
			} 
		}
		return clients;
	}
	
	/* Getter del valor del carga. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del valor de de carga del cliente. <br>
	*@param
	*/
	public int getLoadValue() {
		return loadValue;
	}
	
	/*Setter del valor del barco. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se modifica valor de carga del barco. <br>
	*@param loadValue Valor de carga del cliente
	*/
	public void setLoadValue(int loadValue) {
		this.loadValue = loadValue;
	}
}

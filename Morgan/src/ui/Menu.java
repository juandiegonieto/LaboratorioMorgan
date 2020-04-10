package src.ui;
import src.model.*;
import java.util.Scanner;
public class Menu {
	private final static int NEW_CLIENT = 1;
	private final static int SHOW_CLIENT_INFO = 2;	
	private final static int NEW_LOAD = 3;
	private final static int SHOW_LOAD_INFO = 4;
	private final static int LOAD_SHIP = 5;
	private final static int LOAD_VALUE = 6;
	private final static int LOAD_REBOOT = 7;
	private final static int SHOW_WEIGTH = 8;
	private final static int ALLOW_DEPARTURE = 9;
	private final static int CATEGORY_PROGRESS = 10;
	private final static int EXIT = 11;

	private Ship ship;
	
	/*Inicializa el barco. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> metodo para inicializar. <br>
	*@param
	*/
	public Menu() {
		readInitialData();
		
	}
	
	/*Inicializa el barco. <br>
	*<b>pre:</b> <br>
	*<b>post: </b> El sistema del barco inicializado. <br>
	*@param
	*/
	public void readInitialData() {
		System.out.println("****************************************");
		System.out.println("****************The pirat***************");
		System.out.println("****************************************");
		System.out.println("Captain :  Morgan");
	}
	
	/*Muestra el mnenu. <br>
	*<b>pre: </b> <br>
	*<b>post: </b>  El menu del usuario. <br>
	*@param
	*/
	public void showMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~Menu~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("(1)Ingresar un nuevo cliente");
		System.out.println("(2)Mostrar la informacion del cliente");	
		System.out.println("(3)Ingresar nueva carga");
		System.out.println("(4)Mostrar la informacion de la carga");
		System.out.println("(5)Cargar el barco");
		System.out.println("(6)Mostar el valor de carga");
		System.out.println("(7)Descargar el barco");
		System.out.println("(8)Mostrar el peso actual del barco");
		System.out.println("(9)Mostrar disponibilidad para zarpar");
		System.out.println("(10)Mostrar el progreso del cliente");
		System.out.println("(11)Salir");
	}
	
	/*Lee la respuesta del menu. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Respuesta del menu. <br>
	*@param
	*/
	public int readAnswer() {
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		return answer;
	}
	
	/*Interfaz para ingresar un cliente. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Nuevo cliente. <br>
	*@param
	*/
	public Client readClient() {
		Scanner in = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("------------Nuevo Cliente-----------");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("Escriba el nombre del cliente: ");
		String name = in.nextLine();
		System.out.println("");
		System.out.println("Escriba el tipo de cliente: ");
		String type = in.nextLine();
		System.out.println("");
		System.out.println("Escriba los el numero de kilos que lleva el cliente: ");
		double kilos = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Escriba el pago del cliente: ");
		int payment = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Escriba la fecha de expedicion del cliente: ");
		int expDate = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Escriba la identificacion de registro: ");
		int registerId = in.nextInt();
		in.nextLine();
		return new Client(name,registerId,type,kilos,payment,expDate);		
	}
	
	/*Interfaz para agregar nueva carga. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Nueva carga. <br>
	*@param
	*/
	public Load readLoad() {
		Scanner in = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("---------Nueva carga---------");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("Escriba el numero de cajas: ");
		int boxes = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Escriba el peso en kg por caja: ");
		int weigthPerBox = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Ingrese el tipo de caja: ");
		String boxType = in.nextLine();
		return new Load(boxes,weigthPerBox,boxType);
	}
	
	/*Concetor de funciones del menu. <br>
	*<b>pre: name</b> <br>
	*<b>post: </b> funciones del menu. <br>
	*@param
	*/
	public void doOperation(int answer) {
		switch (answer) {
			case NEW_CLIENT:
				ship.addClient(readClient().get_name(), readClient().getRegisterId(), readClient().get_type(), readClient().get_Kilos(), readClient().get_payment(), readClient().get_expDate());
				break;
			case SHOW_CLIENT_INFO:	
				System.out.println(ship.showContentsClients());
				break;	
			case NEW_LOAD:
				Load load = readLoad();
				ship.addLoad(load);
				break;
			case SHOW_LOAD_INFO:
				System.out.println(ship.showContentsLoads());
				break;
			case LOAD_SHIP:
				System.out.println(ship.loadShip());
				break;
			case LOAD_VALUE: 
				System.out.println(ship.getLoadValue());
			case LOAD_REBOOT:
				ship.loadReboot();
				System.out.println("El barco se ha descargado.");
				break;
			case SHOW_WEIGTH:	
				System.out.println(ship.getLoadWeigth());
				break;
			case ALLOW_DEPARTURE:
				System.out.println(ship.allowedDeparture());
				break;
			case CATEGORY_PROGRESS:
				System.out.println(ship.categoryProgress());
				break;
			case EXIT:
				break;
			default :
				System.out.println("Opcion invalida, repita nuevamente");
		}
	}
	
	/*Inicia el programa. <br>
	*<b>pre: name</b> <br>
	*<b>post: </b> Inicia el programa. <br>
	*@param
	*/
	public void startProgram() {
		int answer;
		do {
			showMenu();
			answer = readAnswer();
			doOperation(answer);
		} while(answer!=11);
	}
	
}

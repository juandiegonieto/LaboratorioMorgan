package src.model;

import java.util.*;

public class Load {

	private final int DANGEROUS = 390000;
	private final int PERISHABLE = 250000;
	private final int NOT_PERISHABLE = 80000;
	
	private int boxes;
	private int weigthPerBox;
	private String boxType;
	
	/*Constructor de la clase carfa y sus atributos. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Inicializa los atributos de la clase Load <br>
	*@param boxes Cajas de la carga
	*@param weigthPerBox Peso por caja
	*@param boxType Tipo de caja
	*/
	public Load(int boxes, int weigthPerBox, String boxType){
		
		this.boxes = boxes;
		this.weigthPerBox = weigthPerBox;
		this.boxType = boxType;
		
	}
	
	/*Setter de las cajas de la carga. <br>
	*<b>pre: name </b> <br>
	*<b>post: </b> Se modifica las cjas de la carga. <br>
	*@param boxes Cajas de la carga
	*/
	public void set_boxes(int boxes) {
		
		this.boxes = boxes;
		
	}
	
	/* Getter de las cajas de la carga. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion de las cajas de la carga. <br>
	*@param
	*/
	public int get_boxes() {
		
		return boxes;
		
	}
	
	/*Setter del peso por caja. <br>
	*<b>pre: weigthPerBox Peso por caja </b> <br>
	*<b>post: </b> Se modifica el peso cpor caja . <br>
	*@param  weigthPerBox El peso cpor caja
	*/
	public void set_weigthPerBox(int weigthPerBox) { 
		
		this.weigthPerBox = weigthPerBox;
		
	}
	
	/* Getter del peso por caja. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del peso por caja. <br>
	*@param
	*/
	public int get_weigthPerBoxe() {
		
		return weigthPerBox;
		
	}
	
	/*Setter del tipo de caja. <br>
	*<b>pre: boxType El tipo de caja </b> <br>
	*<b>post: </b> Se modifica el tipo de caja . <br>
	*@param  boxType El tipo de caja
	*/
	public void set_boxType(String boxType) {
		
		this.boxType = boxType;
		
	}
	
	/* Getter del tipo de caja. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Se obtiene la informacion del tipo de caja. <br>
	*@param
	*/
	public String get_boxType() {
		
		return boxType;
		
	}	
	
}

package Operacion;

import Beat.ControllerInterface;

public class HeartDescTestDrive {

    public static void main (String[] args) {
		play();
    }
    public static void play(){
    	OperacionModel operacionModel = new OperacionModel();
        ControllerInterface controller = new OperacionController(operacionModel, false);       
    }
}
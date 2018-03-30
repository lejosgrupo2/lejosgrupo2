package br.start;

import br.tools.Router;
import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("INICIANDO....");
		
		br.tools.ColorSensor Cs = new br.tools.ColorSensor();
		
		Cs.start(); //liga sensor
		
		//lejos.hardware.sensor.EV3TouchSensor toq;
		//toq = new lejos.hardware.sensor.EV3TouchSensor(lejos.hardware.port.SensorPort.S1);
		//br.tools.SimpleTouch touch=new br.tools.SimpleTouch(toq);
		Router rt = new Router();
		while (Cs.getColor()!=0) {
			rt.pathMove();
			
		}
		Cs.TurnOff();
		
		
	}

}
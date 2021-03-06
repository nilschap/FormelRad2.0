package application;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Berechnet das Formelrad
 * 
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {


	  

	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;

	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}

	public double getLeistung() {
		return leistung;
	}

	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + ", spannung=" + spannung + ", strom=" + strom + ", widerstand="
				+ widerstand + "]";
	}

	

	public void calculate() {
		
		}
	
	public double iAusPundR(double p,double r){
		return Math.sqrt(p/r);
	}
	
	public double iAusPundU(double p,double u){
		return p/u;
	}
	
	public double iAusUundR(double u,double r){
		return u/r;
	}



	}


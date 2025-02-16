package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    
    private double saldo;
    private String titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
    
    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
        Random random = new Random();
        this.numeroCuenta = 100000 + random.nextInt(90000);
        listaDeCuentasBancarias.add(this);
    }

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public static ArrayList<CuentaBancaria> getCuentas() {
		return listaDeCuentasBancarias;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

    //Metodos
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	public void retirar(double monto) {
		if(this.saldo >= monto) {
			this.saldo -= monto;
		} else {
			System.out.println("Fondos insuficientes.");
		}
	}
	
	public void despliegaInformacion() {
	    System.out.println("Número de Cuenta: " + numeroCuenta);
	    System.out.println("Saldo: " + saldo);
	    System.out.println("Titular: " + titular);
	}


    public static void imprimeInformacionDeTodasLasCuentas() {
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("-----------------------------");
        }
    }
}

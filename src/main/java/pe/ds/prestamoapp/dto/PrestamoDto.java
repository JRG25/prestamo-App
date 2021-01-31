/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ds.prestamoapp.dto;

/**
 *
 * @author S145-15API-R5
 */
public class PrestamoDto {
    private double capital;
    private int tiempoMeses;
    private int riesgo;
    
    private double interes;
    private double amortizacion;
    private CuotaDto[] cuotas;

    public PrestamoDto() {
    }

    public PrestamoDto(double capital, int tiempoMeses, int riesgo) {
        this.capital = capital;
        this.tiempoMeses = tiempoMeses;
        this.riesgo = riesgo;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getTiempoMeses() {
        return tiempoMeses;
    }

    public void setTiempoMeses(int tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public CuotaDto[] getCuotas() {
        return cuotas;
    }

    public void setCuotas(CuotaDto[] cuotas) {
        this.cuotas = cuotas;
    }
    
    
}

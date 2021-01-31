/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ds.prestamoapp.Service;

import pe.ds.prestamoapp.dto.CuotaDto;
import pe.ds.prestamoapp.dto.PrestamoDto;

/**
 *
 * @author S145-15API-R5
 */
public class PrestamoService {
    public PrestamoDto procesarPrestamo(PrestamoDto dto){
        //variable
        double interes, amortizacion, saldoInicial;
        CuotaDto[] cuotas = new CuotaDto[dto.getTiempoMeses()];
        //proceso
        amortizacion = dto.getCapital()/ dto.getTiempoMeses();
        interes = obtenerInteres(dto.getRiesgo());
        saldoInicial = dto.getCapital();
        for (int i = 0; i < cuotas.length; i++) {
            cuotas[i]= calcularCuota(i+1, saldoInicial, amortizacion, interes);
            saldoInicial = cuotas[i].getSaldoFinal();
        }
        dto.setAmortizacion(amortizacion);
        dto.setInteres(interes);
        dto.setCuotas(cuotas);
        return dto;
    }

    private double obtenerInteres(int riesgo) {
        double interes=0.0;
        switch (riesgo) {
            case 1:
                interes = 2.25;
                break;
            case 2:
                interes = 3.14;
                break;
            case 3:
                interes = 4.25 ;
                break;
            case 4:
                interes = 6.12;
                break;
            default:
                interes=0.0;
                break;
        }
        return interes;
    }

    private CuotaDto calcularCuota(int mes, double saldoInicial, double amortizacion, double porInteres) {
        double interes = dosDEc(saldoInicial * porInteres / 100);
        double cuota = dosDEc(amortizacion + interes);
        double saldoFinal = dosDEc(saldoInicial - amortizacion);
        
        CuotaDto cuotaDto = new CuotaDto(mes, saldoInicial, amortizacion, interes, cuota, saldoFinal);
        
        return cuotaDto;
    }
    
    private double dosDEc(double numero){
        numero*=100;
        numero=Math.round(numero);
        numero/=100.0;
        return numero;
    }
}

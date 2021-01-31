/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ds.prestamoapp.prueba;

import pe.ds.prestamoapp.Service.PrestamoService;
import pe.ds.prestamoapp.dto.CuotaDto;
import pe.ds.prestamoapp.dto.PrestamoDto;

/**
 *
 * @author S145-15API-R5
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //datos
        PrestamoDto dto = new PrestamoDto(3600, 6, 4);
        //proceso
        PrestamoService service = new PrestamoService();
        dto = service.procesarPrestamo(dto);
        //reporte
        System.out.println("interes mensual: "+dto.getInteres()+"%");
        System.out.println("Amortizacion: "+dto.getAmortizacion());
        System.out.println("MES\tS INICIAL\tAMORTIZACION\tINTERES\tCUOTA\tS FINAL");
        for (CuotaDto cuotaDto: dto.getCuotas()) {
            System.out.println(cuotaDto.getMes()+"\t"+cuotaDto.getSaldoInicial()+"\t\t"
                    +cuotaDto.getAmortizacion()+"\t\t"+cuotaDto.getInteres()+"\t"
                    +cuotaDto.getCuota()+"\t"+cuotaDto.getSaldoFinal());
        }
    }
    
}

package hospital;

import consulta.Consulta;
import java.util.ArrayList;
import medico.Medico;


public class ValidarHospital {
    
     public boolean validarDisponibilidadFechaConsulta(String fechaDeseada, int NumeroConsultorio, ArrayList<Consulta> listaConsultas){
          for (Consulta consulta: listaConsultas){
              if (consulta.getFechaHora().equals (fechaDeseada) && NumeroConsultorio==consulta.getNumeroConsultorio()){
                  return false;
          }
      }
      return true;
     }
     public boolean validarDisponibilidadMedico(String fechaDeseada, int idMedico, ArrayList<Consulta> listaConsultas){
         for (Consulta consulta: listaConsultas){
             if (consulta.getFechaHora().equals(fechaDeseada) && consulta.getMedico().getId()==idMedico){
                 return false;
             }
         }
         return true;
     }
}
package hospital;

import consulta.Consulta;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ValidarHospital {
    
     public boolean validarDisponibilidadFechaConsulta(LocalDateTime fechaDeseada, int NumeroConsultorio, ArrayList<Consulta> listaConsultas){
          for (Consulta consulta: listaConsultas){
              if (consulta.getFechaHora().isEqual (fechaDeseada) && NumeroConsultorio==consulta.getConsultorio().getnumeroConsultorio()){
                  return false;
          }
      }
      return true;
     }
     public boolean validarDisponibilidadMedico(LocalDateTime fechaDeseada, String idMedico, ArrayList<Consulta> listaConsultas){
         for (Consulta consulta: listaConsultas){
             if (consulta.getFechaHora().isEqual(fechaDeseada) && consulta.getMedico().getId().equals(idMedico)){
                 return false;
             }
         }
         return true;
     }
     
     public boolean validarfechaCorrecta(LocalDateTime fechadeseada){
         LocalDateTime fechaActual= LocalDateTime.now();
         
         if (fechadeseada.isBefore(fechaActual)) return false;
         return true;
         }        
     }


package AluraJava_9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

public class DateTime {

    public static void main(String[] args) {
        
        /*
            LocalDate = Data => sem hora
            LocalTime = Hora 
            LocalDateTime = Data com Hora
            MonthDay = Dia de um mes
            YearMonth = Mes e ano 

        */
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now(ZoneId.of("America/Chicago")); // fuso horario diferente ele pega de outro lugar
        LocalDateTime ldt = LocalDateTime.now();


        LocalTime meioDia = LocalTime.of(12, 0); 
        // esse of server para pegar coisa especificas de uma determinada hora ou data

        LocalDate natal2014 = LocalDate.of(2014,12,25);
        LocalDate month = LocalDate.of(2020,Month.DECEMBER,15); // esse month e o mes

        LocalDateTime algumMomento = LocalDateTime.of(2014,12,29,12,0); // passar todos os parametros

        LocalDateTime junta = LocalDateTime.of(natal2014,meioDia);// esse of tambem faz, a união somente de hora e data, nunca data e data

        ////////////////////////////////////////////////////////////



        System.out.println(algumMomento.getDayOfYear());
        // esse get serve para extrair algum coisa, aqui por exemplo esta extraindo somente o dia di ano
        System.out.println(algumMomento.getDayOfMonth());

        System.out.println(algumMomento.get(ChronoField.DAY_OF_WEEK));// esse daqui serve para pegar um momento mais especifico
        








       





    }
    
}

package AluraJava_9;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class DateTime2 {

    public static void main(String [] args){

        MonthDay day1 = MonthDay.of(1,1);
        MonthDay day2 = MonthDay.of(1,2);

        System.out.println(day1.isBefore(day2)); // esse significa se algum vem antes do outro e retorna booleano
        System.out.println(day1.isAfter(day2));

        LocalDate d = LocalDate.of(2012,8,14);

        LocalDate d2 =d.withMonth(12);// aqui ele esta modificando algum valor da data, porque objeto do tipo time e inmutavel

        LocalDate d3 = d2.plusDays(50).plusMonths(2).minusYears(2);
        // plus serva para acrecentar e o minus serve para diminuir e sempre retorna um novo objeto
        
        LocalDate d4 = d3.minus(4,ChronoUnit.YEARS); // aqui estou tirando 4 anos, diferente do outro chrono, esse aqui serve para operações
        //e o outro serve para pegar


        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();// o "to" aqui ele ta pegando um data e passando para outra variavel
        LocalTime lt = ldt.toLocalTime();

        LocalDateTime ltd2 = ld.atTime(lt);// esse at esta somando as variaveis de data e tempo
        LocalDateTime ltd3 = lt.atDate(ld);



        System.out.println(ltd2);   

    }
    
}

package AluraJava_9;

import java.time.*;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateTime3 {

    public static void main(String[] args) {

        Date d = new Date(); // API velha
        Instant i = d.toInstant(); // ele devolver milisecudos das maquinas, e precisa converter para o ser humano
        LocalDateTime ltd = LocalDateTime.ofInstant(i, ZoneId.systemDefault()); // Convertemos
        // esse metodo ofInstant ele chama a variavel Instant
        // esse ofInstant tambem chama 2 parametros a variavel que for chamada, e passar
        // o fuso Horario
        // esse e o fuso horario da maquina => ZoneId.systemDefault();
        // esse e de um lugar especifico ZoneId.of("Brazil,São Paulo");

        // outro execemplo

        Calendar c = Calendar.getInstance();
        Instant i2 = c.toInstant();
        LocalDateTime ltd2 = LocalDateTime.ofInstant(i2, ZoneId.of("Brasil São Paulo")); // isso e uma conversão

        // Aqui mostra a conversão da API nova para a API velha

        Instant i1 = ltd.toInstant(ZoneOffset.UTC);
        // a diferença entre o ZoneId e que ele pega um lugar mais um fuso horario
        // daqule lugar
        // o ZoneOffset.UTC pega o fusoHorario da maquina

        Date d2 = Date.from(i1); // Conversão da API nova para API velha
        Calendar c2 = Calendar.getInstance(); // transformei em calendario
        c2.setTime(d2);

    }

}

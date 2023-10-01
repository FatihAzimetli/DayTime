package SaglikOcagiAsiSistemi;

import java.util.Calendar;
import java.util.Date;

public class DateUtil { //adim 5
    public static Date gunSonunaEkle(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        calendar.set(Calendar.MILLISECOND,999);
        return calendar.getTime();
    }
}



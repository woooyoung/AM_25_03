package org.example.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    /**현재 날짜 및 시각 가져오는 함수 (str)**/
    public static String getNowStr() {
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return formatedNow;
    }
}

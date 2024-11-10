package ru.zhuravlev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        // Видим класс из модуля hw02-gradle2-libApi
        AppFromL01.say();

        // Случай 1
        // в модуле hw02-gradle2-libApi стоит api 'com.google.guava:guava'
        // и тут guava доступна, т.е. зависимость "протекла"
        logger.info("{}", com.google.common.collect.Lists.reverse(new ArrayList<>()));

        // Случай 2
        // в модуле hw02-gradle2-libApi стоит implementation 'com.google.guava:guava'
        // и тут guava НЕ доступна, т.е. зависимость "изолирована"
    }
}
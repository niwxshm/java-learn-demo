package com.lizs.mybatis;

public class Config {

    public enum Language {
        EN, ZH
    }

    private static Language myLanguage;

    public static Language getLanguage() {
        return myLanguage;
    }

    public static void setLanguage(Language language) {
        myLanguage = language;
    }
}


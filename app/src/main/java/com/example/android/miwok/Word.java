package com.example.android.miwok;

public class Word {

    private String miworkTranslation;
    private String defaultTranslation;

    public Word(String miwork, String english) {
        miworkTranslation = miwork;
        defaultTranslation = english;
    }

    public String getMiworkTranslation() {
        return miworkTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}

package com.example.android.miwok;

public class Word {

    private String miworkTranslation;
    private String defaultTranslation;
    private int imageSrc;

    public Word(String miwork, String english, int uriSrc) {
        miworkTranslation = miwork;
        defaultTranslation = english;
        imageSrc = uriSrc;
    }

    public String getMiworkTranslation() {
        return miworkTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageSrc() {
        return imageSrc;
    }
}

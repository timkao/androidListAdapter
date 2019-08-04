package com.example.android.miwok;

public class Word {

    private String miworkTranslation;
    private String defaultTranslation;
    private int imageSrc;
    private static final int NO_IMG_PROVIDED = -1;

    public Word(String miwork, String english, int uriSrc) {
        miworkTranslation = miwork;
        defaultTranslation = english;
        imageSrc = uriSrc;
    }

    public Word(String miwork, String english) {
        miworkTranslation = miwork;
        defaultTranslation = english;
        imageSrc = NO_IMG_PROVIDED;
    }

    public String getMiworkTranslation() {
        return miworkTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageSrc() { return imageSrc; }

    public boolean hasImageSrc() {
        return imageSrc != NO_IMG_PROVIDED;
    }
}

package com.example.android.miwok;

public class Word {

    private String miworkTranslation;
    private String defaultTranslation;
    private int imageSrc;
    private int audSrc;
    private static final int NO_IMG_PROVIDED = -1;
    private static final int NO_AUD_PROVIDED = -1;

    public Word(String miwork, String english, int uriSrc, int audId) {
        miworkTranslation = miwork;
        defaultTranslation = english;
        imageSrc = uriSrc;
        audSrc = audId;
    }

    public Word(String miwork, String english, int uriSrc) {
        miworkTranslation = miwork;
        defaultTranslation = english;
        imageSrc = uriSrc;
        audSrc = NO_AUD_PROVIDED;
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

    public int getAudSrc() { return audSrc; }

    public boolean hasAudSrc() {
        return audSrc != NO_AUD_PROVIDED;
    }

}

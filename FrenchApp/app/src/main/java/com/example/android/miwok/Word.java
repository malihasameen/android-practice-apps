package com.example.android.miwok;

/**
 * Created by DELL on 1/28/2018.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mFrenchTranslation;
    private int mImageResourceId = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param frenchTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String frenchTranslation) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
    }

    public Word(String defaultTranslation, String frenchTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getFrenchTranslation() {
        return mFrenchTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != -1;
    }
}

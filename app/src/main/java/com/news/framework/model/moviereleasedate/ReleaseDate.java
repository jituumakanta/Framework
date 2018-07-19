
package com.news.framework.model.moviereleasedate;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class ReleaseDate {

    @SerializedName("certification")
    private String mCertification;
    @SerializedName("iso_639_1")
    private String mIso6391;
    @SerializedName("note")
    private String mNote;
    @SerializedName("release_date")
    private String mReleaseDate;
    @SerializedName("type")
    private Long mType;

    public String getCertification() {
        return mCertification;
    }

    public void setCertification(String certification) {
        mCertification = certification;
    }

    public String getIso6391() {
        return mIso6391;
    }

    public void setIso6391(String iso6391) {
        mIso6391 = iso6391;
    }

    public String getNote() {
        return mNote;
    }

    public void setNote(String note) {
        mNote = note;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public Long getType() {
        return mType;
    }

    public void setType(Long type) {
        mType = type;
    }

}

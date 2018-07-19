
package com.news.framework.model.moviereleasedate;

import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class Result {

    @SerializedName("iso_3166_1")
    private String mIso31661;
    @SerializedName("release_dates")
    private List<ReleaseDate> mReleaseDates;

    public String getIso31661() {
        return mIso31661;
    }

    public void setIso31661(String iso31661) {
        mIso31661 = iso31661;
    }

    public List<ReleaseDate> getReleaseDates() {
        return mReleaseDates;
    }

    public void setReleaseDates(List<ReleaseDate> releaseDates) {
        mReleaseDates = releaseDates;
    }

}

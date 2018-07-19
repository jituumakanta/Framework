
package com.news.framework.model.moviereleasedate;

import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class MovieReleaseDateResponse {

    @SerializedName("id")
    private Long mId;
    @SerializedName("results")
    private List<Result> mResults;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public List<Result> getResults() {
        return mResults;
    }

    public void setResults(List<Result> results) {
        mResults = results;
    }

}

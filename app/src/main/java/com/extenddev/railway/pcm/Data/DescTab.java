
package com.extenddev.railway.pcm.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DescTab {

    @SerializedName("DescId")
    @Expose
    private Integer DescId ;



    @SerializedName("Description")
    @Expose
    private String Description;

    public DescTab(Integer descId, String description) {
        DescId = descId;
        Description = description;
    }

    public Integer getDescId() {
        return DescId;
    }

    public void setDescId(Integer descId) {
        DescId = descId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

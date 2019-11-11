
package com.extenddev.railway.pcm.Data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


class AgenDescList {

    @SerializedName("Langu")
    @Expose
    private Integer Langu;

    @SerializedName("LangEncoding")
    @Expose
    private String LangEncoding;

    @SerializedName("DescClass")
    @Expose
    private Integer DescClass;

    @SerializedName("DescTab")
    @Expose
    private List<DescTab> DescTab;

    public AgenDescList(Integer langu, String langEncoding, Integer descClass, List<DescTab> descTab) {
        Langu = langu;
        LangEncoding = langEncoding;
        DescClass = descClass;
        DescTab = descTab;
    }

    public Integer getLangu() {
        return Langu;
    }

    public void setLangu(Integer langu) {
        Langu = langu;
    }

    public String getLangEncoding() {
        return LangEncoding;
    }

    public void setLangEncoding(String langEncoding) {
        LangEncoding = langEncoding;
    }

    public Integer getDescClass() {
        return DescClass;
    }

    public void setDescClass(Integer descClass) {
        DescClass = descClass;
    }

    public List<DescTab> getDescTab() {
        return DescTab;
    }

    public void setDescTab(List<DescTab> descTab) {
        DescTab = descTab;
    }
}

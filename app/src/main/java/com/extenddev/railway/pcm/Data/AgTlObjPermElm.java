
package com.extenddev.railway.pcm.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AgTlObjPermElm {

    @SerializedName("TLObjectType")
    @Expose
    private Integer tLObjectType;
    @SerializedName("TLObjectId1")
    @Expose
    private Integer tLObjectId1;
    @SerializedName("TLObjectId2")
    @Expose
    private Integer tLObjectId2;
    @SerializedName("TLObjectPermission")
    @Expose
    private Integer tLObjectPermission;

    public Integer getTLObjectType() {
        return tLObjectType;
    }

    public void setTLObjectType(Integer tLObjectType) {
        this.tLObjectType = tLObjectType;
    }

    public Integer getTLObjectId1() {
        return tLObjectId1;
    }

    public void setTLObjectId1(Integer tLObjectId1) {
        this.tLObjectId1 = tLObjectId1;
    }

    public Integer getTLObjectId2() {
        return tLObjectId2;
    }

    public void setTLObjectId2(Integer tLObjectId2) {
        this.tLObjectId2 = tLObjectId2;
    }

    public Integer getTLObjectPermission() {
        return tLObjectPermission;
    }

    public void setTLObjectPermission(Integer tLObjectPermission) {
        this.tLObjectPermission = tLObjectPermission;
    }

}
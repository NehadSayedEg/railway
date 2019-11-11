
package com.extenddev.railway.pcm.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AgEqPermElm {

    @SerializedName("EquipmentPermId")
    @Expose
    private Integer equipmentPermId;
    @SerializedName("EquipmentId")
    @Expose
    private Integer equipmentId;

    public Integer getEquipmentPermId() {
        return equipmentPermId;
    }

    public void setEquipmentPermId(Integer equipmentPermId) {
        this.equipmentPermId = equipmentPermId;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

}
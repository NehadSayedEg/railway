
package com.extenddev.railway.pcm.Data;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EquipmentPermList {

    @SerializedName("EquipmentPermId")
    @Expose
    private Integer equipmentPermId;

    @SerializedName("EquipmentId")
    @Expose
    private Integer equipmentId;

    @SerializedName("Description")
    @Expose
    private String description;


    @SerializedName("DescID")
    @Expose
    private Integer descID;

    public EquipmentPermList(Integer equipmentPermId, Integer equipmentId, String description, Integer descID) {
        this.equipmentPermId = equipmentPermId;
        this.equipmentId = equipmentId;
        this.description = description;
        this.descID = descID;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDescID() {
        return descID;
    }

    public void setDescID(Integer descID) {
        this.descID = descID;
    }
}



package com.extenddev.railway.pcm.Database.DatabaseEntities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "SalePointId")
//@ForeignKey( entity = AgentList.class,
//        parentColumns = "AgentList_table",
//        childColumns = "SalePointId")
public class SalePointId {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "SalePointId")
    private Integer salePointId;

    public SalePointId(Integer salePointId) {
        this.salePointId = salePointId;
    }

    public Integer getSalePointId() {
        return salePointId;
    }

    public void setSalePointId(Integer salePointId) {
        this.salePointId = salePointId;
    }
}

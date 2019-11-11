package com.extenddev.railway.pcm.Database.DatabaseEntities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "AgRoleElm")
//@ForeignKey( entity = AgentList.class,
//        parentColumns = "AgentList_table",
//        childColumns = "AgRoleElm")
public class AgRoleElm {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    private int Id;


    @ColumnInfo(name = "AgRoleElm")
    private Integer AgRoleElm;


    public AgRoleElm(Integer agRoleElm) {
        AgRoleElm = agRoleElm;
    }

    public Integer getAgRoleElm() {
        return AgRoleElm;
    }

    public void setAgRoleElm(Integer agRoleElm) {
        AgRoleElm = agRoleElm;
    }
}

package com.extenddev.railway.pcm.Database.DatabaseEntities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "AgentDevList")
//@ForeignKey( entity = AgentList.class,
//        parentColumns = "AgentList_table",
//        childColumns = "AgentDevList")

public class AgentDevList {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private Integer id;

    @ColumnInfo(name = "AgentDev")
    private Integer AgentDev;

    public AgentDevList(Integer id, Integer agentDev) {
        this.id = id;
        AgentDev = agentDev;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentDev() {
        return AgentDev;
    }

    public void setAgentDev(Integer agentDev) {
        AgentDev = agentDev;
    }
}

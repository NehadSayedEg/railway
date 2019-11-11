
package com.extenddev.railway.pcm.Data;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Data {
    @SerializedName("AgentList")
    @Expose
    private List<AgentList> agentList ;

    @SerializedName("AgentRoleList")
    @Expose
    private List<AgentRoleList> agentRoleList ;


    @SerializedName("EquipmentPermList")
    @Expose
    private List<EquipmentPermList> equipmentPermList;


    @SerializedName("AgenDescList")
    @Expose
    private List<AgenDescList> agenDescList ;


    public Data(){}


    public Data(List<AgentList> agentList, List<AgentRoleList> agentRoleList
            , List<EquipmentPermList> equipmentPermList, List<AgenDescList> agenDescList) {
        this.agentList = agentList;
        this.agentRoleList = agentRoleList;
        this.equipmentPermList = equipmentPermList;
        this.agenDescList = agenDescList;
    }

    public List<AgentList> getAgentList() {
        return agentList;
    }

    public void setAgentList(List<AgentList> agentList) {
        this.agentList = agentList;
    }

    public List<AgentRoleList> getAgentRoleList() {
        return agentRoleList;
    }

    public void setAgentRoleList(List<AgentRoleList> agentRoleList) {
        this.agentRoleList = agentRoleList;
    }

    public List<EquipmentPermList> getEquipmentPermList() {
        return equipmentPermList;
    }

    public void setEquipmentPermList(List<EquipmentPermList> equipmentPermList) {
        this.equipmentPermList = equipmentPermList;
    }

    public List<AgenDescList> getAgenDescList() {
        return agenDescList;
    }

    public void setAgenDescList(List<AgenDescList> agenDescList) {
        this.agenDescList = agenDescList;
    }
}












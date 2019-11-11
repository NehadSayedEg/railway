
package com.extenddev.railway.pcm.Data;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AgentRoleList {

    @SerializedName("AgentRoleId")
    @Expose
    private Integer agentRoleId;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("RoleDescID")
    @Expose
    private Integer roleDescID;
    @SerializedName("AgEqPermElm")
    @Expose
    private List<AgEqPermElm> agEqPermElm = null;
    @SerializedName("AgTlObjPermElm")
    @Expose
    private List<AgTlObjPermElm> agTlObjPermElm = null;

    public Integer getAgentRoleId() {
        return agentRoleId;
    }

    public void setAgentRoleId(Integer agentRoleId) {
        this.agentRoleId = agentRoleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRoleDescID() {
        return roleDescID;
    }

    public void setRoleDescID(Integer roleDescID) {
        this.roleDescID = roleDescID;
    }

    public List<AgEqPermElm> getAgEqPermElm() {
        return agEqPermElm;
    }

    public void setAgEqPermElm(List<AgEqPermElm> agEqPermElm) {
        this.agEqPermElm = agEqPermElm;
    }

    public List<AgTlObjPermElm> getAgTlObjPermElm() {
        return agTlObjPermElm;
    }

    public void setAgTlObjPermElm(List<AgTlObjPermElm> agTlObjPermElm) {
        this.agTlObjPermElm = agTlObjPermElm;
    }

}
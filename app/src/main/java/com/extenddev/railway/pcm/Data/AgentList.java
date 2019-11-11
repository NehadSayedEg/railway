
package com.extenddev.railway.pcm.Data;


import com.extenddev.railway.pcm.Database.DatabaseEntities.AgRoleElm;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentDevList;
import com.extenddev.railway.pcm.Database.DatabaseEntities.SalePointId;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AgentList {

    @SerializedName("AgentId")
    @Expose
    private Integer agentId;

    @SerializedName("AgentUserName")
    @Expose
    private String agentUserName;

    @SerializedName("AgentUserPwd")
    @Expose
    private String agentUserPwd;

    @SerializedName("AgentMatrRoll")
    @Expose
    private String agentMatrRoll;

    @SerializedName("AgentFirstName")
    @Expose
    private String agentFirstName;

    @SerializedName("AgentFamilyName")
    @Expose
    private String agentFamilyName;


    @SerializedName("PINCode")
    @Expose
    private Integer pINCode;

    @SerializedName("ShortCardModelId16_L")
    @Expose
    private Integer shortCardModelId16L;


    @SerializedName("ShortCardModelId16_H")
    @Expose
    private Integer shortCardModelId16H;


    @SerializedName("TSCSerialNo")
    @Expose
    private Integer tSCSerialNo;

    @SerializedName("TSCSaleOperatorId")
    @Expose
    private Integer tSCSaleOperatorId;

    @SerializedName("ProofDocId")
    @Expose
    private Integer proofDocId;


    @SerializedName("ProofDocSerialNo")
    @Expose
    private String proofDocSerialNo;


    @SerializedName("AgentStatus")
    @Expose
    private Integer agentStatus;

    @SerializedName("OperatorId")
    @Expose
    private Integer operatorId;

    @SerializedName("PlantId")
    @Expose
    private Integer plantId;

    @SerializedName("SynId")
    @Expose
    private Integer synId;

    @SerializedName("AgRoleElm")
    @Expose
    private List<AgRoleElm> agRoleElm ;

    @SerializedName("AgentDevList")
    @Expose
    private List<AgentDevList> agentDevList ;


    @SerializedName("SalePointId")
    @Expose
    private List<SalePointId> salePointId ;

    public AgentList() {
    }

    public AgentList(Integer agentId, String agentUserName, String agentUserPwd, String agentMatrRoll, String agentFirstName,
                     String agentFamilyName, Integer pINCode, Integer shortCardModelId16L, Integer shortCardModelId16H,
                     Integer tSCSerialNo, Integer tSCSaleOperatorId, Integer proofDocId, String proofDocSerialNo,
                     Integer agentStatus, Integer operatorId, Integer plantId,
                     Integer synId, List<AgRoleElm> agRoleElm, List<AgentDevList> agentDevList, List<SalePointId> salePointId) {
        this.agentId = agentId;
        this.agentUserName = agentUserName;
        this.agentUserPwd = agentUserPwd;
        this.agentMatrRoll = agentMatrRoll;
        this.agentFirstName = agentFirstName;
        this.agentFamilyName = agentFamilyName;
        this.pINCode = pINCode;
        this.shortCardModelId16L = shortCardModelId16L;
        this.shortCardModelId16H = shortCardModelId16H;
        this.tSCSerialNo = tSCSerialNo;
        this.tSCSaleOperatorId = tSCSaleOperatorId;
        this.proofDocId = proofDocId;
        this.proofDocSerialNo = proofDocSerialNo;
        this.agentStatus = agentStatus;
        this.operatorId = operatorId;
        this.plantId = plantId;
        this.synId = synId;
        this.agRoleElm = agRoleElm;
        this.agentDevList = agentDevList;
        this.salePointId = salePointId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentUserName() {
        return agentUserName;
    }

    public void setAgentUserName(String agentUserName) {
        this.agentUserName = agentUserName;
    }

    public String getAgentUserPwd() {
        return agentUserPwd;
    }

    public void setAgentUserPwd(String agentUserPwd) {
        this.agentUserPwd = agentUserPwd;
    }

    public String getAgentMatrRoll() {
        return agentMatrRoll;
    }

    public void setAgentMatrRoll(String agentMatrRoll) {
        this.agentMatrRoll = agentMatrRoll;
    }

    public String getAgentFirstName() {
        return agentFirstName;
    }

    public void setAgentFirstName(String agentFirstName) {
        this.agentFirstName = agentFirstName;
    }

    public String getAgentFamilyName() {
        return agentFamilyName;
    }

    public void setAgentFamilyName(String agentFamilyName) {
        this.agentFamilyName = agentFamilyName;
    }

    public Integer getpINCode() {
        return pINCode;
    }

    public void setpINCode(Integer pINCode) {
        this.pINCode = pINCode;
    }

    public Integer getShortCardModelId16L() {
        return shortCardModelId16L;
    }

    public void setShortCardModelId16L(Integer shortCardModelId16L) {
        this.shortCardModelId16L = shortCardModelId16L;
    }

    public Integer getShortCardModelId16H() {
        return shortCardModelId16H;
    }

    public void setShortCardModelId16H(Integer shortCardModelId16H) {
        this.shortCardModelId16H = shortCardModelId16H;
    }

    public Integer gettSCSerialNo() {
        return tSCSerialNo;
    }

    public void settSCSerialNo(Integer tSCSerialNo) {
        this.tSCSerialNo = tSCSerialNo;
    }

    public Integer gettSCSaleOperatorId() {
        return tSCSaleOperatorId;
    }

    public void settSCSaleOperatorId(Integer tSCSaleOperatorId) {
        this.tSCSaleOperatorId = tSCSaleOperatorId;
    }

    public Integer getProofDocId() {
        return proofDocId;
    }

    public void setProofDocId(Integer proofDocId) {
        this.proofDocId = proofDocId;
    }

    public String getProofDocSerialNo() {
        return proofDocSerialNo;
    }

    public void setProofDocSerialNo(String proofDocSerialNo) {
        this.proofDocSerialNo = proofDocSerialNo;
    }

    public Integer getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public Integer getSynId() {
        return synId;
    }

    public void setSynId(Integer synId) {
        this.synId = synId;
    }

    public List<AgRoleElm> getAgRoleElm() {
        return agRoleElm;
    }

    public void setAgRoleElm(List<AgRoleElm> agRoleElm) {
        this.agRoleElm = agRoleElm;
    }

    public List<AgentDevList> getAgentDevList() {
        return agentDevList;
    }

    public void setAgentDevList(List<AgentDevList> agentDevList) {
        this.agentDevList = agentDevList;
    }

    public List<SalePointId> getSalePointId() {
        return salePointId;
    }

    public void setSalePointId(List<SalePointId> salePointId) {
        this.salePointId = salePointId;
    }
}
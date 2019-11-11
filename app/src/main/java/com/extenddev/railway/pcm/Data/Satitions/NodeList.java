package com.extenddev.railway.pcm.Data.Satitions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NodeList {

    @SerializedName("NodeId")
    @Expose
    private int NodeId;

    @SerializedName("NodeCode")
    @Expose
    private String NodeCode;
    @SerializedName("NodeNameAr")
    @Expose
    private String NodeNameAr;

    @SerializedName("NodeNameEg")
    @Expose
    private String NodeNameEg;

    public NodeList(int nodeId, String nodeCode, String nodeNameAr, String nodeNameEg) {
        NodeId = nodeId;
        NodeCode = nodeCode;
        NodeNameAr = nodeNameAr;
        NodeNameEg = nodeNameEg;
    }

    public int getNodeId() {
        return NodeId;
    }

    public void setNodeId(int nodeId) {
        NodeId = nodeId;
    }

    public String getNodeCode() {
        return NodeCode;
    }

    public void setNodeCode(String nodeCode) {
        NodeCode = nodeCode;
    }

    public String getNodeNameAr() {
        return NodeNameAr;
    }

    public void setNodeNameAr(String nodeNameAr) {
        NodeNameAr = nodeNameAr;
    }

    public String getNodeNameEg() {
        return NodeNameEg;
    }

    public void setNodeNameEg(String nodeNameEg) {
        NodeNameEg = nodeNameEg;
    }
}

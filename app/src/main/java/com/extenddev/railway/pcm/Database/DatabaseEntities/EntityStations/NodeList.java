package com.extenddev.railway.pcm.Database.DatabaseEntities.EntityStations;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "NodeList")
public class NodeList {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "NodeId")
    private int NodeId;

    @ColumnInfo(name = "NodeCode")
    private String NodeCode;
    @ColumnInfo(name = "NodeNameAr")
    private String NodeNameAr;

    @ColumnInfo(name = "NodeNameEg")
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

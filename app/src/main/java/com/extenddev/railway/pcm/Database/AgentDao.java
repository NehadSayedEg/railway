package com.extenddev.railway.pcm.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.extenddev.railway.pcm.Database.DatabaseEntities.AgRoleElm;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentList;

import java.util.List;

@Dao
public interface AgentDao {
   // @Insert()
//   @Insert
//  void insert( AgentList);



    @Query("SELECT * FROM AgentList_table" )//where AgentUserName = AgentUserName and AgentUserPwd= AgentUserPwd")
    LiveData <List<AgentList>>getUser();//String agentUserName, String agentUserPwd);

    @Query("SELECT * FROM AgentList_table ")//where AgentUserName = AgentUserName ")
    LiveData<AgentList> CheckAgentName();


    @Query("SELECT * FROM  AgRoleElm ")//"where   AgRoleElm = AgRoleElm ")
   List<AgRoleElm>getRoleID();



//    @Query("SELECT * FROM  AgentList_table where   AgentUserName = AgentUserName and  Age = AgRoleElm  ")
//    List<AgentList>  getRoleID( A , String agentUserName  );



}

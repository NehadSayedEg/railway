package com.extenddev.railway.pcm.Database;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.room.Query;

import com.extenddev.railway.pcm.Database.DatabaseEntities.AgRoleElm;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentList;

import java.util.List;

public class AgentRepository {

    private AgentDao agentDao ;
    private LiveData<List<AgentList>> AllAgent ;


    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    public AgentRepository(Application application){
        AgentDatabase agentDatabase = AgentDatabase.getInsance(application);
        agentDao = agentDatabase.getAgentDao();
        AllAgent = agentDao.getUser();
    }


    public  LiveData<List<AgentList>> getAllAgent() {
        return getAllAgent();
    }

    public  LiveData<List<AgentList>> CheckAgentName() {
        return CheckAgentName();
    }

    public  LiveData<List<AgentList>> getRoleID() {
        return getRoleID();
    }

    private static class agentDao extends AsyncTask<AgentList, Void, Void> {

        private AgentDao agentDao;

        agentDao(AgentDao dao) {
            agentDao = dao;
        }

        @Override
        protected Void doInBackground(final AgentList... params) {
            agentDao.CheckAgentName();
            return null;
        }
    }



}


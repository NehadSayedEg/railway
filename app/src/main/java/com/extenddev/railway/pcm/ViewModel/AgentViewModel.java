package com.extenddev.railway.pcm.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.extenddev.railway.pcm.Database.AgentDatabase;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentList;

import java.util.List;

public class AgentViewModel extends ViewModel {

    private LiveData<List<AgentList>> Agents;

    public AgentViewModel(AgentDatabase database, String agentUserName, String agentUserPwd ) {
        Agents = database.getAgentDao().getUser();
    }

    public LiveData<List<AgentList>> getAgents() {
        return Agents ;
    }
}

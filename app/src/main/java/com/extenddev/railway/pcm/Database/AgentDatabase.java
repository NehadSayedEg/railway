package com.extenddev.railway.pcm.Database;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.extenddev.railway.pcm.Database.DatabaseEntities.AgRoleElm;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentDevList;
import com.extenddev.railway.pcm.Database.DatabaseEntities.AgentList;
import com.extenddev.railway.pcm.Database.DatabaseEntities.SalePointId;

//@Database(entities = {Data.class , AgentList.class , AgenDescList.class , AgentDevList.class , AgentRoleList.class ,
//        AgEqPermElm.class , AgRoleElm.class , DescTab.class , SalePointId.class , EquipmentPermList.class},
   //     version = 1, exportSchema = false)
@Database(entities ={ AgentList.class  ,AgRoleElm.class ,AgentDevList.class, SalePointId.class},  version = 1, exportSchema = false)
public abstract class   AgentDatabase extends RoomDatabase {



    public abstract AgentDao getAgentDao();



    private static final String LOG_TAG = AgentDatabase.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "Agent-database.db";
    private static AgentDatabase database;

    public static synchronized AgentDatabase  getInsance(Context context) {
        if (database == null) {
            synchronized (LOCK) {
                Log.d(LOG_TAG, "Creating new database instance");
                database = Room.databaseBuilder(context.getApplicationContext(),
                        AgentDatabase.class, AgentDatabase.DATABASE_NAME)
                        .build();
            }
        }
        Log.d(LOG_TAG, "Getting the database instance");
        return database;
    }


    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){

        @Override
        public void onOpen (@NonNull SupportSQLiteDatabase db){
            super.onOpen(db);
        }
    };




}



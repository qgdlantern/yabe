package models;

import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 * Created by zyw on 2016/5/31.
 */
@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {
        // Check if the database is empty
        if (User.count() == 0) {
            Fixtures.loadModels("initial-data.yml");
        }
    }
}

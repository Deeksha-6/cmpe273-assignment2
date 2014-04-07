package de.spinscale.dropwizard.jobs;

import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Counter;
import com.yammer.metrics.core.Timer;
import com.yammer.metrics.core.TimerContext;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public abstract class Job implements org.quartz.Job {

    private final Timer timer;

    public Job() {
        timer = Metrics.defaultRegistry().newTimer(getClass(), getClass().getName());
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        TimerContext timerContext = timer.time();
        try {
            doJob();
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            timerContext.stop();
        }
    }

    public abstract void doJob() throws Exception;
}

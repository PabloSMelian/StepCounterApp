package StepCounterApp.apps;

import StepCounterApp.model.Scale;
import StepCounterApp.model.StepCount;
import StepCounterApp.view.StepCountLogger;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static StepCounterApp.model.Scale.Minute;

public class StepCountLoggerMock implements StepCountLogger {

    private StepDetection stepDetection;

    public StepCountLoggerMock(){
        Timer timer = new Timer();
        timer.schedule(task(),0,1000);

    }

    private TimerTask task() {
        return new TimerTask() {
            @Override
            public void run() {
                if (stepDetection == null)return;
                stepDetection.detected(new StepCount(LocalDateTime.now(), Minute,new Random().nextInt(500)));
            }
        };
    }

    @Override
    public void on(StepDetection stepDetection) {
        this.stepDetection = stepDetection;
    }
}

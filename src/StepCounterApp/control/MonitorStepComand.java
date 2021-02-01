package StepCounterApp.control;

import StepCounterApp.model.StepCount;
import StepCounterApp.view.StepCountDisplay;
import StepCounterApp.view.StepCountLogger;
import StepCounterApp.view.StepCountStore;

public class MonitorStepComand extends Command {
    private final StepCountLogger logger;
    private final StepCountStore store;
    private final StepCountDisplay display;


    public MonitorStepComand(StepCountLogger logger, StepCountStore store, StepCountDisplay display) {
        this.logger = logger;
        this.display = display;
        this.logger.on(stepDetection());
        this.store = store;
    }

    private StepCountLogger.StepDetection stepDetection() {
        return new StepCountLogger.StepDetection() {
            @Override
            public void detected(StepCount stepCount){
                store.save(stepCount);
                display.display(stepCount);
            }
        };
    }
}

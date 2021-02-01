package StepCounterApp;

import StepCounterApp.apps.StepCountDisplayMock;
import StepCounterApp.apps.StepCountHistoryMock;
import StepCounterApp.apps.StepCountLoggerMock;
import StepCounterApp.control.MonitorStepComand;
import StepCounterApp.view.StepCountDisplay;
import StepCounterApp.view.StepCountLogger;
import StepCounterApp.view.StepCountStore;

public class Main {

    private final StepCountStore store;
    private final StepCountLogger logger;
    private final StepCountDisplay display;

    public static void main(String[] args) {
        new Main().execute();
    }

    public Main(){
        logger = new StepCountLoggerMock();
        display = new StepCountDisplayMock();
        store = new StepCountHistoryMock();
    }

    private void execute() {
        new MonitorStepComand(logger, store, display).execute();
    }
}

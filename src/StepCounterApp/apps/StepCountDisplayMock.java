package StepCounterApp.apps;

import StepCounterApp.model.StepCount;
import StepCounterApp.view.StepCountDisplay;

public class StepCountDisplayMock implements StepCountDisplay {
    @Override
    public void display(StepCount stepCount) {
        System.out.println(stepCount);
    }
}

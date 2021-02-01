package StepCounterApp.apps;

import StepCounterApp.model.Scale;
import StepCounterApp.model.StepCount;
import StepCounterApp.view.StepCountLoader;
import StepCounterApp.view.StepCountStore;

import java.time.LocalDateTime;

public class StepCountHistoryMock implements StepCountStore, StepCountLoader {
    @Override
    public void load(LocalDateTime dateTime, Scale scale) {

    }

    @Override
    public void save(StepCount stepCount) {
        System.out.println("Storing"+stepCount);
    }
}

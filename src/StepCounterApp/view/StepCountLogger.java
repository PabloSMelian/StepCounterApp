package StepCounterApp.view;

import StepCounterApp.model.StepCount;

public interface StepCountLogger {
    void on(StepDetection stepDetection);

    interface StepDetection{
        void detected(StepCount stepCount);
    }
}

package StepCounterApp.view;

import StepCounterApp.model.Scale;

import java.time.LocalDateTime;

public interface StepCountLoader {
    void load(LocalDateTime dateTime, Scale scale);
}

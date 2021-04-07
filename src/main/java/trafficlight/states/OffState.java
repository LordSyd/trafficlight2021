package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class OffState  implements State {

    private TrafficLightCtrl ctrl;

    public OffState(TrafficLightCtrl assignedCtrl) {
        this.ctrl = assignedCtrl;
    }

    @Override
    public void nextState() {
        ctrl.setPreviousState(ctrl.getCurrentState());

        ctrl.setCurrentState(ctrl.getRedState());

    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.OFF;
    }
}

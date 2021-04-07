package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State {
    private TrafficLightCtrl ctrl;

    public YellowState(TrafficLightCtrl assignedCtrl) {
        this.ctrl = assignedCtrl;
    }

    @Override
    public void nextState() {
        ctrl.setPreviousState(ctrl.getCurrentState());

        ctrl.setCurrentState(ctrl.getGreenState());

    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}

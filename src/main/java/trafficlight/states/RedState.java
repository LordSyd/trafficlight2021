package trafficlight.states;


import trafficlight.ctrl.TrafficLightCtrl;

public class RedState implements State {

    private TrafficLightCtrl ctrl;

    public RedState(TrafficLightCtrl assignedCtrl) {
        this.ctrl = assignedCtrl;
    }

    
    @Override
    public void nextState() {
        ctrl.setPreviousState(ctrl.getCurrentState());

        ctrl.setCurrentState(ctrl.getYellowState());





    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.RED;
    }
}

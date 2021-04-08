package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class OffState extends StateTemplate {

    public OffState(TrafficLightCtrl ctrl){
        setCtrl(ctrl);
        setColor(TrafficLightColor.OFF);
    }

    @Override
    public void nextState() {
        ctrl.setPreviousState(ctrl.getCurrentState());
        ctrl.setCurrentState(ctrl.getRedState());
    }
}

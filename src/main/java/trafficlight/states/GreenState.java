package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState extends StateTemplate {


    public GreenState(TrafficLightCtrl ctrl){
        setCtrl(ctrl);
        setColor(TrafficLightColor.GREEN);
    }

    @Override
    public void nextState() {
        ctrl.setPreviousState(ctrl.getCurrentState());
        ctrl.setCurrentState(ctrl.getRedState());
    }
}

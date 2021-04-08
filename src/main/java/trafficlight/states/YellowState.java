package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState extends StateTemplate {

    public YellowState(TrafficLightCtrl ctrl){
        setCtrl(ctrl);
        setColor(TrafficLightColor.YELLOW);
    }

    @Override
    public void nextState() {
        ctrl.setPreviousState(ctrl.getCurrentState());
        ctrl.setCurrentState(ctrl.getGreenState());
    }
}

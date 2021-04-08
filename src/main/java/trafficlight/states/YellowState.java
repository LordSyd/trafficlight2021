package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState extends StateTemplate {
    public YellowState(TrafficLightCtrl ctrl, String nextAssignedState){
        setCtrl(ctrl);
        setColor(TrafficLightColor.YELLOW);
        setNextAssignedState(nextAssignedState);
    }
}

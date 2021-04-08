package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class OffState extends StateTemplate {
    public OffState(TrafficLightCtrl ctrl, String nextAssignedState){
        setCtrl(ctrl);
        setColor(TrafficLightColor.OFF);
        setNextAssignedState(nextAssignedState);
    }
}

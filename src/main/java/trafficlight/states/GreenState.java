package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState extends StateTemplate {

    public GreenState(TrafficLightCtrl ctrl, String nextAssignedState){
        setCtrl(ctrl);
        setColor(TrafficLightColor.GREEN);
        setNextAssignedState(nextAssignedState);
    }
}

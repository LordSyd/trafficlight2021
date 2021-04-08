package trafficlight.states;


import trafficlight.ctrl.TrafficLightCtrl;

public class RedState extends StateTemplate {

    public RedState(TrafficLightCtrl ctrl, String nextAssignedState){
        setCtrl(ctrl);
        setColor(TrafficLightColor.RED);
        setNextAssignedState(nextAssignedState);
    }


}

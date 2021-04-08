package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class StateFactory {

    public static State makeState(String newStateType, String nextAssignedState, TrafficLightCtrl ctrl){

        if (newStateType.equalsIgnoreCase("red")){
            return new RedState(ctrl,nextAssignedState);
        }else if (newStateType.equalsIgnoreCase("yellow")){
            return new YellowState(ctrl,nextAssignedState);
        }else if (newStateType.equalsIgnoreCase("green")) {
            return new GreenState(ctrl,nextAssignedState);
        }else if (newStateType.equalsIgnoreCase("off")) {
            return new OffState(ctrl,nextAssignedState);
        }else{
            return null;
        }
    }
}

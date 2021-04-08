package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class StateFactory {

    public static State makeState(String newStateType, TrafficLightCtrl ctrl){

        if (newStateType.equalsIgnoreCase("red")){
            return new RedState(ctrl);
        }else if (newStateType.equalsIgnoreCase("yellow")){
            return new YellowState(ctrl);
        }else if (newStateType.equalsIgnoreCase("green")) {
            return new GreenState(ctrl);
        }else if (newStateType.equalsIgnoreCase("off")) {
            return new OffState(ctrl);
        }else{
            return null;
        }
    }
}

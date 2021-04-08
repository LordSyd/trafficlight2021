package trafficlight.states;


import trafficlight.ctrl.TrafficLightCtrl;

public class RedState extends StateTemplate {

    public RedState(TrafficLightCtrl ctrl){
        setCtrl(ctrl);
        setColor(TrafficLightColor.RED);
    }

    @Override
    public void nextState() {
        ctrl.setPreviousState(ctrl.getCurrentState());
        ctrl.setCurrentState(ctrl.getYellowState());
    }
}

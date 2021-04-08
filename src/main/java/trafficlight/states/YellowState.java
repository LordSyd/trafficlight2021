package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState extends StateTemplate {
    public YellowState(TrafficLightCtrl ctrl, String nextAssignedState){
        setCtrl(ctrl);
        setColor(TrafficLightColor.YELLOW);
        setNextAssignedState(nextAssignedState);
    }

    @Override
    public void nextState() {
        State stateToAssign;

        if (ctrl.getPreviousState().getState() == TrafficLightColor.RED ){
            stateToAssign = ctrl.getGreenState();
        }else {
            stateToAssign = ctrl.getRedState();
        }

        ctrl.setPreviousState(ctrl.getCurrentState());
        ctrl.setCurrentState(stateToAssign);
    }
}

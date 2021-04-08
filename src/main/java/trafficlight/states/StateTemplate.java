package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public abstract class StateTemplate implements State {

    protected TrafficLightCtrl ctrl;
    protected TrafficLightColor color;
    protected String nextAssignedState;

    public TrafficLightColor getColor() {
        return color;
    }

    public String getNextAssignedState() {
        return nextAssignedState;
    }

    public void setNextAssignedState(String nextAssignedState) {
        this.nextAssignedState = nextAssignedState;
    }

    public void setCtrl(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void setColor(TrafficLightColor color) {
        this.color = color;
    }

    public void nextState(){
        State stateToAssign = null;

        if (nextAssignedState.equalsIgnoreCase("red")){
            stateToAssign = ctrl.getRedState();
        }else if (nextAssignedState.equalsIgnoreCase("yellow")){
            stateToAssign = ctrl.getYellowState();
        }else if (nextAssignedState.equalsIgnoreCase("green")){
            stateToAssign = ctrl.getGreenState();
        }

        ctrl.setPreviousState(ctrl.getCurrentState());
        ctrl.setCurrentState(stateToAssign);
    }

    public TrafficLightColor getState() {
        return this.color;
    }
}

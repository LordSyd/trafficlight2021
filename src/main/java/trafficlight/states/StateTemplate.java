package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public abstract class StateTemplate implements State {

    protected TrafficLightCtrl ctrl;
    protected TrafficLightColor color;

    public void setCtrl(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void setColor(TrafficLightColor color) {
        this.color = color;
    }

    public abstract void nextState();

    public TrafficLightColor getState() {
        return this.color;
    }
}

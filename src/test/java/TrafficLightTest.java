import org.junit.jupiter.api.*;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.states.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrafficLightTest {
    
    TrafficLightCtrl ctrl;

    @BeforeAll
    static void init() {
    }
    
    @BeforeEach
    void setup() {
        ctrl = new TrafficLightCtrl();
    }

    @AfterEach
    void tearDown() {
        ctrl = null;
    }

    @DisplayName("Tests if RedState was constructed and assigned properly")
    @Test
    void testConstructionAtInit_Red(){
        assertTrue(ctrl.getRedState() instanceof RedState);
    }

    @DisplayName("Tests if GreenState was constructed and assigned properly")
    @Test
    void testConstructionAtInit_Green(){
        assertTrue(ctrl.getGreenState() instanceof GreenState);
    }

    @DisplayName("Tests if YellowState was constructed and assigned properly")
    @Test
    void testConstructionAtInit_Yellow(){
        assertTrue(ctrl.getYellowState() instanceof YellowState);
    }

    @DisplayName("Tests if OffState construction with uppercase String works")
    @Test
    void testConstruction_Off_uppercase(){
        assertTrue(StateFactory.makeState("Off", "", ctrl) instanceof OffState);
    }

    @DisplayName("Tests if OffState construction with lowercase String works")
    @Test
    void testConstruction_Off_lowercase(){
        assertTrue(StateFactory.makeState("off", "", ctrl) instanceof OffState);
    }

    @DisplayName("Tests if YellowState construction with uppercase String works")
    @Test
    void testConstruction_Yellow_uppercase(){
        assertTrue(StateFactory.makeState("Yellow", "", ctrl) instanceof YellowState);
    }

    @DisplayName("Tests if YellowState construction with lowercase String works")
    @Test
    void testConstruction_Yellow_lowercase(){
        assertTrue(StateFactory.makeState("yellow", "", ctrl) instanceof YellowState);
    }

    @DisplayName("Tests if RedState construction with uppercase String works")
    @Test
    void testConstruction_Red_uppercase(){
        assertTrue(StateFactory.makeState("Red", "", ctrl) instanceof RedState);
    }

    @DisplayName("Tests if RedState construction with lowercase String works")
    @Test
    void testConstruction_Red_lowercase(){
        assertTrue(StateFactory.makeState("red", "", ctrl) instanceof RedState);
    }

    @DisplayName("Tests if GreenState construction with uppercase String works")
    @Test
    void testConstruction_Green_uppercase(){
        assertTrue(StateFactory.makeState("Green", "", ctrl) instanceof GreenState);
    }

    @DisplayName("Tests if GreenState construction with lowercase String works")
    @Test
    void testConstruction_Green_lowercase(){
        assertTrue(StateFactory.makeState("green", "", ctrl) instanceof GreenState);
    }

    @DisplayName("Tests switching states from yellow to green")
    @Test
    void testTransition_YellowToGreen(){
        ctrl.setCurrentState(ctrl.getYellowState());
        ctrl.nextState();
        assertTrue(ctrl.getCurrentState() instanceof GreenState);
    }

    @DisplayName("Tests switching states from off to red")
    @Test
    void testTransition_OffToRed(){
        ctrl.nextState();
        assertTrue(ctrl.getCurrentState() instanceof RedState);
    }
    @DisplayName("Tests switching states from red to yellow")
    @Test
    void testTransition_RedToYellow(){
        ctrl.setCurrentState(ctrl.getRedState());
        ctrl.nextState();
        assertTrue(ctrl.getCurrentState() instanceof YellowState);
    }
    @DisplayName("Tests switching states from green to red")
    @Test
    void testTransition_GreenToRed(){
        ctrl.setCurrentState(ctrl.getGreenState());
        ctrl.nextState();
        assertTrue(ctrl.getCurrentState() instanceof RedState);
    }

    @DisplayName("Tests correct Enum assigned - Red")
    @Test
    void testStateColorAssignment_Red(){
        RedState red = new RedState(ctrl, "");
        assertEquals(TrafficLightColor.RED, red.getColor());
    }

    @DisplayName("Tests correct Enum assigned - Yellow")
    @Test
    void testStateColorAssignment_Yellow(){
        YellowState yellow = new YellowState(ctrl, "");
        assertEquals(TrafficLightColor.YELLOW, yellow.getColor());
    }

    @DisplayName("Tests correct Enum assigned - Green")
    @Test
    void testStateColorAssignment_Green(){
        GreenState green = new GreenState(ctrl, "");
        assertEquals(TrafficLightColor.GREEN, green.getColor());
    }

    @DisplayName("Tests correct Enum assigned - Off")
    @Test
    void testStateColorAssignment_Off(){
        OffState off = new OffState(ctrl, "");
        assertEquals(TrafficLightColor.OFF, off.getColor());
    }

    @DisplayName("Tests correct assignment of next State")
    @Test
    void testNextStateAssignment(){
        OffState off = new OffState(ctrl, "Red");
        assertEquals("red", off.getNextAssignedState().toLowerCase());
    }

    @DisplayName("Tests method getState()")
    @Test
    void testGetState(){
        OffState off = new OffState(ctrl, "");
        assertEquals(TrafficLightColor.OFF, off.getState());
    }
}

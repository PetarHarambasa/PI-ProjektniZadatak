package hr.algebra.pi.test;

import hr.algebra.pi.model.Terminal;
import org.junit.Test;

import static org.junit.Assert.*;


public class TerminalTest {
    Terminal terminal = new Terminal();

    @Test
    public void testParkSmallCarSuccess() {
        assertTrue(terminal.parkVehicle("car", "small", 0.5, 0.8));
        assertEquals(1, terminal.getSmallTrainOccupancy());
        assertEquals(50, terminal.getTotalRevenue(), 0.001);
    }

    @Test
    public void testParkSmallCarFail() {
        terminal.setSmallTrainOccupancy(8);
        assertFalse(terminal.parkVehicle("car", "small", 0.5, 0.8));
        assertEquals(8, terminal.getSmallTrainOccupancy());
        assertEquals(0, terminal.getTotalRevenue(), 0.001);
    }

    @Test
    public void testParkBigBusSuccess() {
        assertTrue(terminal.parkVehicle("bus", "big", 0.9, 0.6));
        assertEquals(1, terminal.getBigTrainOccupancy());
        assertEquals(70, terminal.getTotalRevenue(), 0.001);
    }

    @Test
    public void testParkBigBusFail() {
        terminal.setBigTrainOccupancy(6);
        assertFalse(terminal.parkVehicle("bus", "big", 0.9, 0.6));
        assertEquals(6, terminal.getBigTrainOccupancy());
        assertEquals(0, terminal.getTotalRevenue(), 0.001);
    }
    @Test
    public void testGasRefill() {
        assertTrue(terminal.parkVehicle("car", "small", 0.05, 0.8));
        assertEquals(1, terminal.getSmallTrainOccupancy());
        assertEquals(50, terminal.getTotalRevenue(), 0.001);
    }

    @Test
    public void testBatteryRecharge() {
        assertTrue(terminal.parkVehicle("bus", "big", 0.9, 0.05));
        assertEquals(1, terminal.getBigTrainOccupancy());
        assertEquals(70, terminal.getTotalRevenue(), 0.001);
    }

    @Test
    public void testInvalidVehicleType() {
        assertFalse(terminal.parkVehicle("motorcycle", "small", 0.5, 0.8));
        assertEquals(0, terminal.getSmallTrainOccupancy());
        assertEquals(0, terminal.getTotalRevenue(), 0.001);
    }

    @Test
    public void testCheckRevenueAndOccupancy() {
        assertTrue(terminal.parkVehicle("car", "small", 0.5, 0.8));
        assertTrue(terminal.parkVehicle("bus", "big", 0.9, 0.6));
        terminal.checkRevenueAndOccupancy();
    }

}

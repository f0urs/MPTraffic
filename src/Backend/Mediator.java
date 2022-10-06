/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.List;

/**
 *
 * @author User
 */
public interface Mediator {
    
    public abstract int trafficLevel(VehiclesABS vehicle, String lanes);
    
    public abstract void addToLane1(VehiclesABS vehicles);
    public abstract void addToLane2(VehiclesABS vehicles);
    public abstract void addToLane3(VehiclesABS vehicles);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author User
 */
public class Vehicle extends VehiclesABS{

    private Mediator mediator;
    private String VehicleName;
    
    public Vehicle(Mediator mediator, String VehicleName) {
        super(mediator, VehicleName);
        this.VehicleName = VehicleName;
        this.mediator = mediator;
    }

    
    @Override
    public int viewTraffic(String lanes) {
    
        return mediator.trafficLevel(this, lanes);
       
    }
    
}

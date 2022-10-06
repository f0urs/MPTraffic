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
public abstract class VehiclesABS {
    
    private Mediator mediator;
    private String VehicleName;

    public VehiclesABS(Mediator mediator, String VehicleName) {
        this.mediator = mediator;
        this.VehicleName = VehicleName;
    }

    
    /**
     * @return the mediator
     */
    public Mediator getMediator() {
        return mediator;
    }

    /**
     * @return the VehicleName
     */
    public String getVehicleName() {
        return VehicleName;
    }
    
    public abstract int viewTraffic(String lanes);
    
    
}

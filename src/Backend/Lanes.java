/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Lanes implements Mediator{
 
    private List<VehiclesABS> Lane1;//creating lane objects
    private List<VehiclesABS> Lane2;
    private List<VehiclesABS> Lane3;
    List<VehiclesABS> lane;

    public Lanes() {
        Lane1 = new ArrayList<VehiclesABS>();
        Lane2 = new ArrayList<VehiclesABS>();
        Lane3 = new ArrayList<VehiclesABS>();
    }

    @Override
    public void addToLane1(VehiclesABS vehicles) {//adding vehicles to the lanes
    
        Lane1.add(vehicles);
    }

    @Override
    public void addToLane2(VehiclesABS vehicles) {
    
        Lane2.add(vehicles);
    }

    @Override
    public void addToLane3(VehiclesABS vehicles) {
    
        Lane3.add(vehicles);
    }

    @Override
    public int trafficLevel(VehiclesABS vehicle, String lanes) {//returning the count of vehiles in specified lanes
    
        if (lanes == "lane1") {
            lane = Lane1;
        }else if(lanes == "lane2"){
            lane = Lane2;
        }else if(lanes == "lane3"){
            lane = Lane3;
        }
        
        int count = 0;
        for (VehiclesABS v : lane) {//removes the user vehicle from counting
            if (!v.getVehicleName().equalsIgnoreCase(vehicle.getVehicleName())) {
               count = count+1;
            }
        }
        return count;
    }

    
}

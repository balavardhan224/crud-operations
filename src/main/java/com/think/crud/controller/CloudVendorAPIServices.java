package com.think.crud.controller;

import com.think.crud.model.CloudVendor;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIServices {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){

        return cloudVendor;
//                new CloudVendor("c1","vendor 1","address 1","1234567890");

    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "cloud vendor details created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "cloud vendor details updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor=null;
        return "cloud vendor details deleted";
    }
}

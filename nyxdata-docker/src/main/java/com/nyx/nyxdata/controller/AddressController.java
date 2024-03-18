package com.nyx.nyxdata.controller;

import com.nyx.nyxdata.entity.Address;
import com.nyx.nyxdata.service.AddressService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable("id") Integer id) {
        return addressService.getAddress(id);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable("id") Integer id, @RequestBody Address address) {
            return addressService.updateAddress(id, address);
    }

    @PatchMapping("/{id}")
    public Address updatePatchAddress(@PathVariable("id") Integer id, @RequestBody Address address) {
        return addressService.updateAddress(id, address);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteAddress(@PathVariable("id") Integer id) {
       addressService.deleteAddress(id);
    }
}
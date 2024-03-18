package com.nyx.nyxdata.service;

import com.nyx.nyxdata.entity.Address;
import com.nyx.nyxdata.repository.AddressRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }
    public Address getAddress(Integer id) {
        return addressRepository.findById(id).get();
    }
    public Address createAddress( Address address) {
        return addressRepository.save(address);
    }
    public Address updateAddress( Integer id, Address address) {
        Address existingAddress = addressRepository.findById(id).get();
        if (existingAddress != null) {
            existingAddress.setFullName(address.getFullName());
            existingAddress.setAddress(address.getAddress());
            existingAddress.setCity(address.getCity());
            existingAddress.setUser(address.getUser());
            // Add other fields as needed
            return addressRepository.save(existingAddress);
        }
        return null; // Handle not found scenario
    }
    public Address updatePatchAddress( Integer id, Address address) {
        Address existingAddress = addressRepository.findById(id).get();
        if (existingAddress != null) {
            if (address.getFullName() != null) {
                existingAddress.setFullName(address.getFullName());
            }
            if (address.getAddress() != null) {
                existingAddress.setAddress(address.getAddress());
            }
            if (address.getCity() != null) {
                existingAddress.setCity(address.getCity());
            }
            if (address.getUser() != null) {
                existingAddress.setUser(address.getUser());
            }
            return addressRepository.save(existingAddress);
        }
        return null; // Handle not found scenario
    }

    public void deleteAddress( Integer id) {
        addressRepository.deleteById(id);
    }
}

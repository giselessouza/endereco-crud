// AddressService.kt
package com.example.yourproject.core.ports

import com.example.yourproject.core.model.Address

interface AddressService {
    fun createAddress(address: Address): Address
    fun getAddressById(id: String): Address?
    fun updateAddress(address: Address): Address
    fun deleteAddressById(id: String)
    fun listAllAddresses(): List<Address>
}

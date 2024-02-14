// AddressRepository.kt
package com.example.yourproject.core.ports

import com.example.yourproject.core.model.Address

interface AddressRepository {
    fun create(address: Address): Address
    fun findById(id: String): Address?
    fun update(address: Address): Address
    fun deleteById(id: String)
    fun findAll(): List<Address>
}

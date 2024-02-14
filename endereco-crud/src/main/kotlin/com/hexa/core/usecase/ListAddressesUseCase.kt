// ListAddressesUseCase.kt
package com.example.yourproject.core.usecase

import com.example.yourproject.core.model.Address
import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Service

@Service
class ListAddressesUseCase(private val addressRepository: AddressRepository) {

    fun execute(): List<Address> {
        return addressRepository.findAll()
    }
}

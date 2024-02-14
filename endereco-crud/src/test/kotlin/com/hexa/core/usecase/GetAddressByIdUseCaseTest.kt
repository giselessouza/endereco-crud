// GetAddressByIdUseCase.kt
package com.example.yourproject.core.usecase

import com.example.yourproject.core.model.Address
import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Service

@Service
class GetAddressByIdUseCase(private val addressRepository: AddressRepository) {

    fun execute(id: String): Address? {
        return addressRepository.findById(id)
    }
}

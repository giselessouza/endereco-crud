
// UpdateAddressUseCase.kt
package com.example.yourproject.core.usecase

import com.example.yourproject.core.model.Address
import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Service

@Service
class UpdateAddressUseCase(private val addressRepository: AddressRepository) {

    fun execute(address: Address): Address {
        // Aqui você pode adicionar lógica de validação, por exemplo
        if (address.street.isBlank() || address.city.isBlank() || address.state.isBlank() || address.zipCode.isBlank()) {
            throw IllegalArgumentException("Address fields cannot be blank")
        }
        
        return addressRepository.update(address)
    }
}


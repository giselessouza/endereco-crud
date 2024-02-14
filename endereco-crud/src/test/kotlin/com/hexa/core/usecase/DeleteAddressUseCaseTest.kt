// DeleteAddressUseCase.kt
package com.example.yourproject.core.usecase

import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Service

@Service
class DeleteAddressUseCase(private val addressRepository: AddressRepository) {

    fun execute(id: String) {
        addressRepository.deleteById(id)
    }
}

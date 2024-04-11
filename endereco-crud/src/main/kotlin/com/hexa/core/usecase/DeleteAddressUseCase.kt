// DeleteAddressUseCase.kt
package com.example.yourproject.core.usecase

import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Service

@Service
class DeleteAddressUseCase(private val addressRepository: AddressRepository) {

    fun execute(id: String) {
        try {
            val address = addressRepository.findById(id)
            if (address != null) {
                addressRepository.deleteById(id)
            } else {
                throw IllegalArgumentException("Address not found")
            }
        } catch (e: Exception) {
            // Handle the exception here
            // You can log the error or throw a custom exception
        }
    }
}


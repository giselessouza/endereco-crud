// GetAddressByIdUseCase.kt
package com.example.yourproject.core.usecase

import com.example.yourproject.core.model.Address
import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Service

@Service
class GetAddressByIdUseCase(private val addressRepository: AddressRepository) {

    fun execute(id: String): Address? {
        try {
            // Validate the id parameter
            if (id.isBlank()) {
                throw IllegalArgumentException("Invalid id")
            }
            
            // Retrieve the address from the repository
            val address = addressRepository.findById(id)
            
            // Check if the address is null
            if (address == null) {
                throw IllegalStateException("Address not found")
            }
            
            return address
        } catch (e: IllegalArgumentException) {
            // Log the validation error
            println("Validation error occurred while executing GetAddressByIdUseCase: ${e.message}")
            return null
        } catch (e: IllegalStateException) {
            // Log the address not found error
            println("Address not found error occurred while executing GetAddressByIdUseCase: ${e.message}")
            return null
        } catch (e: Exception) {
            // Log any other error
            println("Error occurred while executing GetAddressByIdUseCase: ${e.message}")
            return null
        }
    }
}


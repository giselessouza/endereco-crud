// ListAddressesUseCase.kt
package com.example.yourproject.core.usecase

import com.example.yourproject.core.model.Address
import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Service
import javax.validation.Valid

...

@Service
class ListAddressesUseCase(private val addressRepository: AddressRepository) {

    fun execute(): List<@Valid Address> {
        return addressRepository.findAll()
    }
}

// AddressMapper.kt
package com.example.yourproject.entrypoint.mapper

import com.example.yourproject.core.model.Address
import com.example.yourproject.entrypoint.dto.AddressDTO
import org.springframework.stereotype.Component

@Component
class AddressMapper {

    fun toModel(dto: AddressDTO): Address {
        return Address(dto.id, dto.street, dto.city, dto.state, dto.postalCode)
    }

    fun toDTO(model: Address): AddressDTO {
        return AddressDTO(model.id, model.street, model.city, model.state, model.postalCode)
    }
}

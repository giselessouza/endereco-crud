    package com.example.yourproject.core.usecase

    import com.example.yourproject.core.model.Address
    import com.example.yourproject.core.ports.AddressRepository
    import org.springframework.stereotype.Service

    @Service
    class CreateAddressUseCase(private val addressRepository: AddressRepository) {

        fun execute(address: Address): Address {
            // Aqui você pode adicionar lógica de validação, por exemplo
            if (address.street.isBlank() || address.city.isBlank() || address.zipCode.isBlank()) {
                throw IllegalArgumentException("Address fields cannot be empty")
            }
            
            return addressRepository.create(address)
        }
    }

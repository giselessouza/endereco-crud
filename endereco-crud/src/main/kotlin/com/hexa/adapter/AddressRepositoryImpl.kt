// AddressRepositoryImpl.kt
package com.example.yourproject.adapter

import com.example.yourproject.core.model.Address
import com.example.yourproject.core.ports.AddressRepository
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface AddressJpaRepository : JpaRepository<Address, String>

@Repository
class AddressRepositoryImpl(private val addressJpaRepository: AddressJpaRepository) : AddressRepository {

    override fun create(address: Address): Address {
        return addressJpaRepository.save(address)
    }

    override fun findById(id: String): Address? {
        return addressJpaRepository.findById(id).orElse(null)
    }

    override fun update(address: Address): Address {
        return addressJpaRepository.save(address)
    }

    override fun deleteById(id: String) {
        addressJpaRepository.deleteById(id)
    }

    override fun findAll(): List<Address> {
        return addressJpaRepository.findAll()
    }
}

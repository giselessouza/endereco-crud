package com.hexa

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/endereco-crud")
class EnderecoCrudController @Inject constructor(
    private val addressService: AddressService,
    private val addressMapper: AddressMapper
) {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }

    @Post
    fun createAddress(addressDTO: AddressDTO): HttpResponse<AddressDTO> {
        val createdAddress = addressService.createAddress(addressMapper.toModel(addressDTO))
        return HttpResponse.created(addressMapper.toDTO(createdAddress))
    }

    @Get("/{id}")
    fun getAddressById(id: String): HttpResponse<AddressDTO> {
        val address = addressService.getAddressById(id) ?: return HttpResponse.notFound()
        return HttpResponse.ok(addressMapper.toDTO(address))
    }

    @Put("/{id}")
    fun updateAddress(id: String, addressDTO: AddressDTO): HttpResponse<AddressDTO> {
        val address = addressMapper.toModel(addressDTO).copy(id = id)
        val updatedAddress = addressService.updateAddress(address)
        return HttpResponse.ok(addressMapper.toDTO(updatedAddress))
    }

    @Delete("/{id}")
    fun deleteAddress(id: String): HttpResponse<Any> {
        addressService.deleteAddressById(id)
        return HttpResponse.noContent()
    }

    @Get
    fun listAddresses(): HttpResponse<List<AddressDTO>> {
        val addresses = addressService.listAllAddresses().map { addressMapper.toDTO(it) }
        return HttpResponse.ok(addresses)
    }
}
package com.geektech.shoppingapp.domain.usecases

import com.geektech.shoppingapp.domain.repository.ShopListRepository

class GetShopListUseCase(private val repository: ShopListRepository) {

    fun getShopList() = repository.getShopList()

}
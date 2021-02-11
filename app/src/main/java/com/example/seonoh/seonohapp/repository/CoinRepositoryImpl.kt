package com.example.seonoh.seonohapp.repository

import com.example.seonoh.seonohapp.datasource.CoinDataSourceImpl

// 서버 통신 정보 구현
// 데이터 전송 담당
// 필요 통신 구현

class CoinRepositoryImpl : CoinRepository {

    private val coinDataSource = CoinDataSourceImpl()

    override fun sendMarket() = coinDataSource.getMarket()

    override fun sendCurrentPriceInfo(
        markets: String
    ) = coinDataSource.getCurrentPriceInfo(markets)
}
package com.example.seonoh.seonohapp.repository

import com.example.seonoh.seonohapp.model.CurrentPriceInfoModel
import com.example.seonoh.seonohapp.model.Market
import io.reactivex.Single

// 서버 통신 정보 interface
// 필요 통신 정리

interface CoinRepository {
    fun sendMarket() : Single<List<Market>>
    fun sendCurrentPriceInfo(
        markets: String
    ) : Single<List<CurrentPriceInfoModel>>
}
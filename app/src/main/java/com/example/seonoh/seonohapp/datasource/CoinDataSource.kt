package com.example.seonoh.seonohapp.datasource

import com.example.seonoh.seonohapp.model.CurrentPriceInfoModel
import com.example.seonoh.seonohapp.model.Market
import io.reactivex.Single

// 서버 통신 관련 interface

interface CoinDataSource{
    fun getMarket() : Single<List<Market>>
    fun getCurrentPriceInfo(marketNameList : String) : Single<List<CurrentPriceInfoModel>>
}
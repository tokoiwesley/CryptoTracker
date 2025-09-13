package dev.tokoi.cryptotracker.crypto.presentation.coin_list

import dev.tokoi.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class onCoinClick(val coinUi: CoinUi) : CoinListAction
    /*data object onRefresh: CoinListAction*/
}
package com.roughnecks.plunkgame.representations

import com.roughnecks.plunkgame.model.Player

data class NewPlayerScoreVM (
        var player: Player,
        var value: Long
)
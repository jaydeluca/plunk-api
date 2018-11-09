package com.roughnecks.plunkgame.representations

import com.roughnecks.plunkgame.model.Player
import com.roughnecks.plunkgame.model.PlayerScore
import com.roughnecks.plunkgame.model.Team


data class StatsVM (
        var player: Player,
        var team: Team,
        var scores: List<PlayerScore>?
        ) {
    fun getPoints() = 3
}
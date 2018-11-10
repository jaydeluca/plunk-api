package com.roughnecks.plunkgame.representations

import com.fasterxml.jackson.annotation.JsonIgnore
import com.roughnecks.plunkgame.model.Player
import com.roughnecks.plunkgame.model.PlayerScore


data class StatsVM (
        var player: Player,

        @JsonIgnore
        var scores: Set<PlayerScore>?
        ) {

    fun getPoints() = scores!!.map{ it.value }
            .filter { it == 1L  }
            .size

    fun getPlunks() = scores!!.map{ it.value }
            .filter { it == 3L  }
            .size

    fun getTotalPoints() = scores!!.map{ it.value }
            .sum()

    fun getTeam() =  if (player.team !== null) player!!.team!!.name else "None"

    fun getGamesPlayed() = scores!!.map{ it.game!!.id }
            .distinct()
            .size


}
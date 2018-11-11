package com.roughnecks.plunkgame.representations

import com.fasterxml.jackson.annotation.JsonIgnore
import com.roughnecks.plunkgame.model.Player
import com.roughnecks.plunkgame.model.PlayerScore


data class StatsVM (
        var player: Player,

        @JsonIgnore
        var scores: Set<PlayerScore>?
        ) {

    var gamesPlayed = scores!!.map{ it.game!!.id }
            .distinct()
            .size

    var points = this.scores!!.filter { it.value == 1L  }
            .size

    var plunks = this.scores!!.filter { it.value == 3L  }
            .size

    var onePointsPerGame = if (this.gamesPlayed > 0) this.points / this.gamesPlayed else 0


    var plunksPerGame = if (this.gamesPlayed > 0) this.plunks / this.gamesPlayed else 0

    var totalPoints = scores!!.map{ it.value }
            .sum()

    var totalPointsPerGame = if (this.gamesPlayed > 0) this.totalPoints / this.gamesPlayed else 0

    var team =  if (player.team !== null) player.team!!.name else "None"
}
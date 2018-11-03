package com.roughnecks.plunkgame.representations

import com.roughnecks.plunkgame.model.Player


data class NewTeamVM (
        var name: String,
        var playerOne: Player,
        var playerTwo: Player
)
package com.roughnecks.plunkgame.controller

import com.roughnecks.plunkgame.model.Game
import com.roughnecks.plunkgame.model.PlayerScore
import com.roughnecks.plunkgame.repository.GameRepository
import com.roughnecks.plunkgame.repository.PlayerRepository
import com.roughnecks.plunkgame.repository.PlayerScoreRepository
import com.roughnecks.plunkgame.representations.NewPlayerScoreVM
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@CrossOrigin(maxAge = 3600)
@RestController
class GameController {

    @Autowired
    private val gameRepository: GameRepository? = null

    @Autowired
    private val playerScoreRepository: PlayerScoreRepository? = null

    @Autowired
    private val playerRepository: PlayerRepository? = null

    @PostMapping("/games/save")
    fun saveGame(@Valid @RequestBody scores: Array<NewPlayerScoreVM>) : String {
        val game = gameRepository!!.save(Game())

        scores.forEach {
            playerScoreRepository!!.save(PlayerScore(player = it.player, game = game, value = it.value))
        }

        return "Saved"
    }


}
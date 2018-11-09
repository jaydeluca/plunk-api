package com.roughnecks.plunkgame.controller

import com.roughnecks.plunkgame.model.Game
import com.roughnecks.plunkgame.model.PlayerScore
import com.roughnecks.plunkgame.repository.GameRepository
import com.roughnecks.plunkgame.repository.PlayerRepository
import com.roughnecks.plunkgame.repository.PlayerScoreRepository
import com.roughnecks.plunkgame.representations.StatsVM
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@CrossOrigin(maxAge = 3600)
@RestController
class StatsController {

    @Autowired
    private val gameRepository: GameRepository? = null

    @Autowired
    private val playerScoreRepository: PlayerScoreRepository? = null

    @Autowired
    private val playerRepository: PlayerRepository? = null

    @GetMapping("/stats")
    fun getStats() : MutableList<StatsVM> {

        val players = playerRepository!!.findAll()

        val stats: MutableList<StatsVM>

        return stats


    }


}
package com.roughnecks.plunkgame.controller

import com.roughnecks.plunkgame.repository.GameRepository
import com.roughnecks.plunkgame.repository.PlayerRepository
import com.roughnecks.plunkgame.repository.PlayerScoreRepository
import com.roughnecks.plunkgame.representations.StatsVM
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(maxAge = 3600)
@RequestMapping("/api")
@RestController
class StatsController {

    @Autowired
    private val gameRepository: GameRepository? = null

    @Autowired
    private val playerScoreRepository: PlayerScoreRepository? = null

    @Autowired
    private val playerRepository: PlayerRepository? = null

    @GetMapping("/stats")
    fun getStats() : MutableList<StatsVM>? {

        val players = playerRepository!!.findAll()
        val stats = mutableListOf<StatsVM>()

        players.forEach {
            stats.add(StatsVM(player = it, scores = it.playerScores))
        }

        return stats
    }


}
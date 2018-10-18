package com.roughnecks.plunkgame.controller

import com.roughnecks.plunkgame.model.Player
import com.roughnecks.plunkgame.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid
import org.springframework.web.bind.annotation.PostMapping



@RestController
class PlayerController {

    @Autowired
    private val playerRepository: PlayerRepository? = null

    @GetMapping("/players")
    fun getQuestions(pageable: Pageable): Page<Player> {
        return playerRepository!!.findAll(pageable)
    }

    @PostMapping("/players")
    fun createPlayer(@Valid @RequestBody player: Player): Player {

        println(player)

        return playerRepository!!.save(player)
    }

}
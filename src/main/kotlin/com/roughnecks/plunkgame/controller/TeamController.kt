package com.roughnecks.plunkgame.controller

import com.roughnecks.plunkgame.model.NewTeamVM
import com.roughnecks.plunkgame.model.Team
import com.roughnecks.plunkgame.repository.PlayerRepository
import com.roughnecks.plunkgame.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(maxAge = 3600)
@RestController
class TeamController {

    @Autowired
    private val teamRepository: TeamRepository? = null

    @Autowired
    private val playerRepository: PlayerRepository? = null

    @GetMapping("/teams")
    fun getTeams(pageable: Pageable): Page<Team> {
        return teamRepository!!.findAll(pageable)
    }

    @PostMapping("/teams")
    fun createTeam(@Valid @RequestBody newTeam: NewTeamVM) : String {

        val playerOne = playerRepository!!.findById(newTeam.playerOneId)
        val playerTwo = playerRepository!!.findById(newTeam.playerTwoId)

        val team = Team(
                name = newTeam.name,
                playerOne = playerOne,
                playerTwo = playerTwo)
        teamRepository!!.save(team)


        return "Failure"
    }

}
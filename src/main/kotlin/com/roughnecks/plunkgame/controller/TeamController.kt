package com.roughnecks.plunkgame.controller

import com.roughnecks.plunkgame.model.Team
import com.roughnecks.plunkgame.repository.PlayerRepository
import com.roughnecks.plunkgame.repository.TeamRepository
import com.roughnecks.plunkgame.representations.NewTeamVM
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(maxAge = 3600)
@RequestMapping("/api")
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
    fun createTeam(@Valid @RequestBody team: NewTeamVM) : Team {
        val newTeam = teamRepository!!.save(Team(team.name))

        team.playerOne.team = newTeam
        playerRepository!!.save(team.playerOne)

        team.playerTwo.team = newTeam
        playerRepository!!.save(team.playerTwo)

        return newTeam
    }

}
package com.roughnecks.plunkgame.repository

import com.roughnecks.plunkgame.model.Game
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : JpaRepository<Game, Long>
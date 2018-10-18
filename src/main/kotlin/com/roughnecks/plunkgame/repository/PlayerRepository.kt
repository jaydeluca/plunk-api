package com.roughnecks.plunkgame.repository

import com.roughnecks.plunkgame.model.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlayerRepository : JpaRepository<Player, Long>